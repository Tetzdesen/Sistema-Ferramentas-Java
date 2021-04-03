/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaferramentas;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class CadastroFerramentas extends javax.swing.JFrame {
    FerramentasDAO ferramentasDAO = new FerramentasDAO();
    
    public CadastroFerramentas() {
      initComponents();
      Calendar c1 = Calendar.getInstance();
      int hora = c1.get(Calendar.HOUR_OF_DAY);
      
      if(hora >= 6 && hora <= 12){
          jButton7.setText("BOM DIA!!!");
      }else if(hora >= 12 && hora <= 18){
          jButton7.setText("BOA TARDE!!!");
      }else{
          jButton7.setText("BOA NOITE!!!");
      }
      
      ArrayList lista = ferramentasDAO.BuscarDadosTotal();
      lista.clear();
    }
        
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField1.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Código: ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Nome:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Preço:");

        jTextField3.setText(" ");

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("Salvar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 153));
        jButton4.setText("Limpar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("CADASTRO FERRAMENTAS");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Data da venda:");

        jButton5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 153));
        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox1.setMaximumRowCount(7);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "50", "100", "150", "200", "250", "300" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Estoque:");

        jButton6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 153));
        jButton6.setText("Atualizar Dados");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço", "Data", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 51, 153));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon.png"))); // NOI18N

        jButton8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 153));
        jButton8.setText("Carregar Dados");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 153));
        jButton9.setText("Mostrar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(85, 85, 85)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(94, 94, 94)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(81, 81, 81)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton4))
                    .addComponent(jButton9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    // Botão salvar:
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        if(jTextField1.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Código não está preenchido.");
         }
         else if(jTextField2.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Nome não está preenchido.");
         }
         else if(jTextField3.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Preço não está preenchido.");
         }
         else if(jFormattedTextField1.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Data não está preenchida.");
         }
         else if(jComboBox1.getSelectedIndex() == 0){
             JOptionPane.showMessageDialog(null, "Estoque não está preenchido.");
         }
         else{
            ArrayList lista = ferramentasDAO.BuscarDadosTotal();
            int tamanho = lista.size();
            Ferramentas ferra = null;
            boolean verifc = false;
            
            DefaultTableModel modelotabela = (DefaultTableModel)jTable1.getModel();
            
            for(int i = 0; i < tamanho; i++){
                ferra = (Ferramentas)lista.get(i);
                if(ferra.getCodigo() == Integer.parseInt(jTextField1.getText())){
                    verifc = true;
                    break;
                }
            }
            if(verifc == true){
                JOptionPane.showMessageDialog(null, "Ferramenta já cadastrada.");
            }
            else{
                int codigo = Integer.parseInt(jTextField1.getText());
                String nome = jTextField2.getText();
                double preco = Double.parseDouble(jTextField3.getText());
                String data =  jFormattedTextField1.getText();
                int estoque = Integer.parseInt(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));
                Ferramentas ferramentas = new Ferramentas(codigo, nome, preco, data, estoque);
                 
                ferramentasDAO.InserirDados(ferramentas);    
               
                String[] linha = new String[5];
                linha[0] = String.valueOf(codigo);
                linha[1] = nome;
                linha[2] = String.valueOf(preco);
                linha[3] = data;
                linha[4] = String.valueOf(estoque);
           
                int posicao = modelotabela.getRowCount();
          
                modelotabela.insertRow(posicao, linha);
                
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jFormattedTextField1.setText((new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis()))));
                jComboBox1.setSelectedItem(jComboBox1.getItemAt(0));
                jTextField1.requestFocus();
 
                JOptionPane.showMessageDialog(null, "Ferramenta salva!!!");
            }
            
       
             }              
       
    }//GEN-LAST:event_jButton2ActionPerformed
    
    // Botão Excluir
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        DefaultTableModel modelotabela = (DefaultTableModel)jTable1.getModel();
        
        if(jTable1.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null,"Favor Selecionar a LINHA na Tabela que deseja excluir.");
        } else {
            int linha = jTable1.getSelectedRow();
             
            int nr = Integer.parseInt((String) modelotabela.getValueAt(linha, 0));
            if(jTextField1.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Campo de código vazio.");
            }
            else{
                int codigo = Integer.parseInt(jTextField1.getText());
                if(nr != codigo){
                    JOptionPane.showMessageDialog(null, "Ferramenta não excluída.");
                }
                else{
                    ferramentasDAO.ExcluirDados(codigo);
                    modelotabela.removeRow(linha);
                    JOptionPane.showMessageDialog(null, "Ferramenta excluída com sucesso.");
                }
            } 
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    // Botão Limpar:
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          jTextField1.setText("");
          jTextField2.setText("");
          jTextField3.setText("");
          jFormattedTextField1.setText((new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis()))));
          jComboBox1.setSelectedItem(jComboBox1.getItemAt(0));
          jTextField1.requestFocus();
          JOptionPane.showMessageDialog(null, "Os campos de texto estão limpos!!!");
    }//GEN-LAST:event_jButton4ActionPerformed
    
    // Botão Buscar:
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            if(jTextField1.getText().trim().equals("")){
                    JOptionPane.showMessageDialog(null, "ERROR - Digite o código para buscar a ferramenta!!!");
                }
                else{
                    String cod = jTextField1.getText().trim();
                    int codigo = Integer.parseInt(cod);
                    String datap = " ";
                    String datapp = " ";
                    Ferramentas ferramentas = ferramentasDAO.BuscarDados(codigo);
                    if(ferramentas == null){
                        JOptionPane.showMessageDialog(null,"FALHA Geral - Ferramenta não encontrada!!!");
                    } else {
                       jTextField1.setText(String.valueOf(ferramentas.getCodigo()));
                       jTextField2.setText(ferramentas.getNome());
                       jTextField3.setText(String.valueOf(ferramentas.getPreco()));
                       datap = String.valueOf(ferramentas.getData());
                       String vetor[] = datap.split("-");
                       datapp = vetor[2] + "/" + vetor[1] + "/" + vetor[0];
                       jFormattedTextField1.setText(datapp);
   
                       int estoque = ferramentas.getEstoque();
                       jComboBox1.setSelectedItem(String.valueOf(estoque));
                    
                       JOptionPane.showMessageDialog(null, "Ferramenta encontrado!!!");
                    }
                }
            
            
    }//GEN-LAST:event_jButton5ActionPerformed
   // Botão Atualizar
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         if(jTextField1.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Código não está preenchido.");
         }
         else if(jTextField2.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Nome não está preenchido.");
         }
         else if(jTextField3.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Preço não está preenchido.");
         }
         else if(jFormattedTextField1.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Data não está preenchida.");
         }
         else if(jComboBox1.getSelectedIndex() == 0){
             JOptionPane.showMessageDialog(null, "Estoque não está preenchido.");
         }
         else{
              DefaultTableModel modelotabela = (DefaultTableModel)jTable1.getModel();
              if(jTable1.getSelectedRow() == -1){
                    JOptionPane.showMessageDialog(null, "Favor Selecionar a LINHA na Tabela que deseja atualizar.");
              }
              else{
                    int codigo = Integer.parseInt(jTextField1.getText());
                    String nome = jTextField2.getText();
                    double preco = Double.parseDouble(jTextField3.getText());
                    String data = jFormattedTextField1.getText();
                    int estoque = Integer.parseInt(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));
                    int selec = jTable1.getSelectedRow();
        
                    int nr = Integer.parseInt((String) modelotabela.getValueAt(selec, 0));
                    
                    if(nr == codigo){
                          Ferramentas ferramentas = new Ferramentas(codigo, nome, preco, data, estoque);

                          ferramentasDAO.AtualizarDados(ferramentas);
        
                          String[] linha = new String[5];
                          linha[0] = String.valueOf(codigo);
                          linha[1] = nome;
                          linha[2] = String.valueOf(preco);
                          linha[3] = data;
                          linha[4] = String.valueOf(estoque);
           
                          int posicao = jTable1.getSelectedRow();
        
                          modelotabela.removeRow(jTable1.getSelectedRow());
                          modelotabela.insertRow(posicao, linha);
                          JOptionPane.showMessageDialog(null, "Ferramenta atualizada.");
                    }
                    else{
                          JOptionPane.showMessageDialog(null, "Ferramenta não atualizada.");
                    }
              }
        }           
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       // carregar dados
       ArrayList lista = ferramentasDAO.BuscarDadosTotal();
      
       int tamanho = lista.size();
       
       Ferramentas ferramentas = null;
       DefaultTableModel modelotabela = (DefaultTableModel)jTable1.getModel();
       for(int i = 0; i < tamanho; i++){
           modelotabela.removeRow(i);
       }
       String[] linha = new String[5];
       String data = " ";
       for(int i = 0; i < tamanho; i++){
           ferramentas = (Ferramentas)lista.get(i);
           linha[0] = String.valueOf(ferramentas.getCodigo());
           linha[1] = ferramentas.getNome();
           linha[2] = String.valueOf(ferramentas.getPreco());
           data = ferramentas.getData();
           String vetor[] = data.split("-");
           linha[3] = vetor[2] + "/" + vetor[1] + "/" + vetor[0];
           linha[4] = String.valueOf(ferramentas.getEstoque());
         
           modelotabela.insertRow(i, linha);
           
           
       }
       lista.clear();
      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // Botão mostrar:
        
         DefaultTableModel modelotabela = (DefaultTableModel)jTable1.getModel();
         int posicaotabela = jTable1.getSelectedRow();
         if(posicaotabela == -1){
               JOptionPane.showMessageDialog(null, "Favor Selecionar a LINHA na Tabela que deseja mostrar.");
         }
         else{
               int num = Integer.parseInt(String.valueOf(modelotabela.getValueAt(posicaotabela, 0)));
               String nome = String.valueOf(modelotabela.getValueAt(posicaotabela, 1));
               double preco = Double.parseDouble(String.valueOf(modelotabela.getValueAt(posicaotabela, 2)));
               String data = String.valueOf(modelotabela.getValueAt(posicaotabela, 3));
               int estoque = Integer.parseInt(String.valueOf(modelotabela.getValueAt(posicaotabela, 4)));
         
               jTextField1.setText(String.valueOf(num));
               jTextField2.setText(nome);
               jTextField3.setText(String.valueOf(preco));
               jFormattedTextField1.setText(data);
               jComboBox1.setSelectedItem(String.valueOf(estoque));
         }
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFerramentas().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
