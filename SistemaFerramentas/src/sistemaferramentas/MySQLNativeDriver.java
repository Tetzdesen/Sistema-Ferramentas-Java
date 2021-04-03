/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaferramentas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MySQLNativeDriver {
        protected String nomeBanco;
        protected String usuario;
        protected String senha;
        private String ip, porta;
    
        public MySQLNativeDriver(String nomeBanco, String usuario, String senha, String ip, String porta){
            this.nomeBanco = nomeBanco;
            this.usuario = usuario;
            this.senha = senha;
            this.ip = ip;
            this.porta = porta;
        
        }
        public MySQLNativeDriver(String nomeBanco, String usuario, String senha){
            this.nomeBanco = nomeBanco;
            this.usuario = usuario;
            this.senha = senha;
            this.ip = "localhost";
            this.porta = "3306";
        }
    
        public Connection ObterConexao(){
            Connection conexao = null;
            try{
                String url;
                url = "jdbc:mysql://" + this.ip + ":" + this.porta + "/" + this.nomeBanco;
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexao = DriverManager.getConnection(url, this.usuario, this.senha);
     
                JOptionPane.showMessageDialog(null, "Conexão realizada.");
            
            } catch (ClassNotFoundException ex) {
                System.out.println("Driver não encontrado.");
            
            } catch (SQLException ex) {
                System.out.println("Problema com o banco de dados.");
            } 
            finally {
                return conexao;
            }
   }
}
