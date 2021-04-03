/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaferramentas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ferramentas {
       private int codigo;
       private String nome;
       private double preco;
       private String data;
       private int estoque;
       private java.sql.Date dataform;
       public Ferramentas(int codigo, String nome, double preco, String data, int estoque){
           this.codigo = codigo;
           this.nome = nome;
           this.preco = preco;
           this.data = data;
           this.estoque = estoque;
       }
       public int getCodigo(){
           return codigo;
       }
       public String getNome(){
           return nome;
       }
       public double getPreco(){
           return preco;
       }
       public String getData(){
           return data;
       }
       public java.sql.Date getDataFormatado(){
           SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
           
           try {
               dataform = new java.sql.Date(formato.parse(data).getTime());
           } catch (ParseException ex) {
               Logger.getLogger(Ferramentas.class.getName()).log(Level.SEVERE, null, ex);
           }
           finally{
               return dataform;
           }
       }
       public int getEstoque(){
           return estoque;
       }
       public void setNome(String novoNome){
           nome = novoNome;
       }   
       public void setPreco(double novoPreco){
           preco = novoPreco;
       }   
}
