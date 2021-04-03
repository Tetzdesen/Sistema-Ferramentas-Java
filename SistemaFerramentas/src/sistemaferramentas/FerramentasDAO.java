package sistemaferramentas;

import java.sql.*;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FerramentasDAO {
       MySQLNativeDriver driver = new MySQLNativeDriver("ferramentas", "root", "");
       Connection conexao = driver.ObterConexao();
       
       int codigo;
       String nome;
       Double preco;
       String data;
       java.sql.Date dataf;
       int estoque;
       ArrayList lista;
       
       FerramentasDAO(){
           lista = new ArrayList();
       }
       public void InserirDados(Ferramentas ferramentas){
           codigo = ferramentas.getCodigo();
           nome = ferramentas.getNome();
           preco = ferramentas.getPreco();
           data = ferramentas.getData();
           estoque = ferramentas.getEstoque();
           dataf = ferramentas.getDataFormatado();

           PreparedStatement pstmt;
           String sql = "INSERT INTO Ferramentas (codigo, nome, preco, data_cadastro, estoque) values (?, ?, ?, ?, ?)";
           try {
               pstmt = conexao.prepareStatement(sql);
               pstmt.setInt(1, codigo);
               pstmt.setString(2, nome);
               pstmt.setDouble(3, preco);
               pstmt.setDate(4, dataf);
               pstmt.setInt(5, estoque);
               pstmt.executeUpdate();
               
           } catch(SQLException ex){
               System.out.println("ERRO NA INSERÇÃO DE DADOS.");
           }     
       }
       
       public void AtualizarDados(Ferramentas ferramentas){
           codigo = ferramentas.getCodigo();
           nome = ferramentas.getNome();
           preco = ferramentas.getPreco();
           data = ferramentas.getData();
           estoque = ferramentas.getEstoque();
           dataf = ferramentas.getDataFormatado();
       
           String sql = "UPDATE Ferramentas SET " 
                        + "codigo = ?, " 
                        + "nome = ?, " 
                        + "preco = ?, "
                        + "data_cadastro = ?, "
                        + "estoque = ? "
                        + "WHERE codigo = ?";
           
           PreparedStatement pstmt;
           try{
               pstmt = conexao.prepareStatement(sql);
               pstmt.setInt(1, codigo);
               pstmt.setString(2, nome);
               pstmt.setDouble(3, preco);
               pstmt.setDate(4, ferramentas.getDataFormatado());
               pstmt.setInt(5, estoque);
               pstmt.setInt(6, codigo);
               pstmt.executeUpdate();
           } catch (SQLException ex) {
               Logger.getLogger(FerramentasDAO.class.getName()).log(Level.SEVERE, null, ex);
           }
          
       }
       public void ExcluirDados(int codigo){
           String sql = "DELETE FROM Ferramentas WHERE codigo = ?";
           
           PreparedStatement pstmt;
           try{
               pstmt = conexao.prepareStatement(sql);
               pstmt.setString(1, String.valueOf(codigo));
               pstmt.executeUpdate();
           } catch (SQLException ex) {
               Logger.getLogger(FerramentasDAO.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
       public Ferramentas BuscarDados(int codigo){
     
           PreparedStatement pstmt;
           
           int cod;
           String nome;
           double preco;
           java.sql.Date data_sql;
           String data;
           int estoque;
           
           Ferramentas ferramentas = null;
           try {
               String sql = "select codigo, nome, preco,data_cadastro, estoque from Ferramentas where codigo = ?";
               pstmt = conexao.prepareStatement(sql);
               pstmt.setInt(1, codigo);
               ResultSet rs = pstmt.executeQuery();     
               rs.next();
               cod = rs.getInt(1);
               nome = rs.getString(2); 
               preco = rs.getDouble(3);
               data_sql = new java.sql.Date(rs.getDate(4).getTime());
               data = String.valueOf(data_sql);
               estoque = rs.getInt(5);
 
               ferramentas = new Ferramentas(cod, nome, preco, data, estoque);
               
               pstmt.close();
                 
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro em buscar dados ou dados nulos");      
            }
           finally{
               return ferramentas;      
           }
    }
    public ArrayList BuscarDadosTotal(){
           PreparedStatement pstmt;
           
           int cod = 0;
           String nome = " ";
           double preco = 0;
           java.sql.Date data_sql = null;
           String data = " ";
           int estoque = 0;
           
           Ferramentas ferramentas = null;
           try {
               String sql = "select* from Ferramentas";
               pstmt = conexao.prepareStatement(sql);
               ResultSet rs = pstmt.executeQuery();    
               while(rs.next()){
                    cod = rs.getInt(1);
                    nome = rs.getString(2); 
                    preco = rs.getDouble(3);
                    data_sql = new java.sql.Date(rs.getDate(4).getTime());
                    data = String.valueOf(data_sql);
                    estoque = rs.getInt(5);
                    ferramentas = new Ferramentas(cod, nome, preco, data, estoque);
                    lista.add(ferramentas);
               }
               pstmt.close();
                 
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro em buscar dados");      
            }
           finally{
                 return lista;    
           }
       }
}

 
       
  
    

