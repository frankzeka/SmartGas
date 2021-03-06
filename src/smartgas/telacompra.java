/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgas;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author frank
 */
public class telacompra extends javax.swing.JFrame {
    ArrayList <fornecedor> fichas_fornecedor = new ArrayList<fornecedor>();
    ArrayList <Funcionario> fichas_funcionario = new ArrayList<Funcionario>();
    ArrayList <produto> fichas_produto = new ArrayList<produto>();  
    ArrayList<compra>  fichas_compra = new ArrayList<compra>();
    ArrayList<itens_compra>fichas_itens = new ArrayList<itens_compra>();
    compra ficha_compra = new compra();
    produto ficha_produto = new produto();
    float totalcompra = 0;

    /**
     * Creates new form telacompra
     */
    public telacompra() {        
        initComponents();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        itensvenda = new javax.swing.JScrollPane();
        tabelaitens = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Incluir = new javax.swing.JButton();
        entradaproduto = new javax.swing.JComboBox();
        entradaquantidade = new javax.swing.JSpinner();
        entradaPreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        qtde_estoque = new javax.swing.JLabel();
        entradafornecedor = new javax.swing.JComboBox();
        FinalizarCompra = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ComboFunc = new javax.swing.JComboBox();

        setTitle("Tela de Compra");
        setName("formtelacompra"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Fornecedor:");

        tabelaitens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Valor de Compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itensvenda.setViewportView(tabelaitens);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Produto:");

        jLabel3.setText("Quantidade:");

        Incluir.setText("Incluir");
        Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncluirActionPerformed(evt);
            }
        });

        entradaproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaprodutoActionPerformed(evt);
            }
        });

        entradaPreco.setBorder(javax.swing.BorderFactory.createTitledBorder("Preço Unitário"));

        jLabel4.setText("R$");

        jLabel8.setText("Quantidade em estoque:");

        qtde_estoque.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(entradaproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entradaquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(entradaPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtde_estoque)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(entradaproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Incluir))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(qtde_estoque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entradaquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entradaPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        FinalizarCompra.setText("Finalizar Compra");
        FinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarCompraActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));

        jLabel5.setText("R$");

        jLabel6.setText("by Arildo");

        jLabel7.setText("Funcionário:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(itensvenda, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(FinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(entradafornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboFunc, 0, 350, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ComboFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradafornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(itensvenda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FinalizarCompra)
                    .addComponent(Cancelar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-518)/2, (screenSize.height-552)/2, 518, 552);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:        
        try{
            ObjectInputStream arqEntrada = new ObjectInputStream(new FileInputStream(new File("fornecedor.ser")));
            fichas_fornecedor = (ArrayList<fornecedor>) arqEntrada.readObject();
            int totalF = fichas_fornecedor.size();
            arqEntrada.close();
            for (int x=0; x<totalF;x++){ 
                entradafornecedor.addItem(fichas_fornecedor.get(x).nome);
            }

        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado Fornecedor", "SmartGas", JOptionPane.ERROR_MESSAGE);
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Erro na abertura do arquivo de dados Fornecedor", "SmartGas", JOptionPane.ERROR_MESSAGE);
        }
        catch(IOException e){
                   JOptionPane.showMessageDialog(null, "Erro na leitura dos dados Fornecedor", "SmartGas", JOptionPane.ERROR_MESSAGE);
        }
        
        //Funcionario
        try{
            ObjectInputStream arqEntrada = new ObjectInputStream(new FileInputStream(new File("funcionario.ser")));
            fichas_funcionario = (ArrayList<Funcionario>) arqEntrada.readObject();
            int totalF = fichas_funcionario.size();
            for (int x=0; x<totalF;x++){ //for
                ComboFunc.addItem(fichas_funcionario.get(x).nome);
            }
            arqEntrada.close();
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado Funcionario", "SmartGas", JOptionPane.ERROR_MESSAGE);
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Erro na abertura do arquivo de dados Funcionario", "SmartGas", JOptionPane.ERROR_MESSAGE);
        }
        catch(IOException e){
                   JOptionPane.showMessageDialog(null, "Erro na leitura dos dados Funcionario", "SmartGas", JOptionPane.ERROR_MESSAGE);
        } 
        //Produto
        try{
            ObjectInputStream arqEntrada = new ObjectInputStream(new FileInputStream(new File("produto.ser")));
            fichas_produto = (ArrayList<produto>) arqEntrada.readObject();
            int totalP = fichas_produto.size();
            for (int x=0; x<totalP;x++){ //for
                entradaproduto.addItem(fichas_produto.get(x).tipo);
            }
            arqEntrada.close();
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado cliente", "SmartGas", JOptionPane.ERROR_MESSAGE);
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Erro na abertura do arquivo de dados cliente", "SmartGas", JOptionPane.ERROR_MESSAGE);
        }
        catch(IOException e){
                   JOptionPane.showMessageDialog(null, "Erro na leitura dos dados cliente", "SmartGas", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_formWindowOpened

    private void IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncluirActionPerformed
        // TODO add your handling code here:        
        itens_compra ficha_item = new itens_compra();
        Object linha[] = {entradaproduto.getSelectedItem(),entradaquantidade.getValue(),entradaPreco.getText()};
        DefaultTableModel dtm = (DefaultTableModel) tabelaitens.getModel();
        dtm.addRow(linha);
        ficha_item.cod_compra = ficha_compra.hashCode();
        ficha_item.cod_produto = entradaproduto.getSelectedItem().hashCode();
        ficha_item.preco_custo = Float.parseFloat(entradaPreco.getText());
        ficha_item.quantidade =  Integer.parseInt(entradaquantidade.getValue().toString());
        fichas_itens.add(ficha_item);        
        
        //atualiza estoque do produto mas não salva no arquivo
        int indice =entradaproduto.getSelectedIndex();
        ficha_produto = fichas_produto.get(indice);
        ficha_produto.quantidade = ficha_item.quantidade+ficha_produto.quantidade;
        fichas_produto.set(indice, ficha_produto);
        
        //limpa e atualiza os dados
        totalcompra = (Float.parseFloat(entradaquantidade.getValue().toString()) * Float.parseFloat(entradaPreco.getText()))+totalcompra;
        entradaprodutoActionPerformed(evt);
        jTextFieldTotal.setText(Float.toString(totalcompra));
        entradaPreco.setText("");
        
    }//GEN-LAST:event_IncluirActionPerformed

    private void FinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarCompraActionPerformed
        // TODO add your handling code here:          
          ficha_compra.cod_fornecedor =  entradafornecedor.getSelectedItem().hashCode();
          ficha_compra.cod_funcionario = ComboFunc.getSelectedItem().hashCode();
          ficha_compra.data_compra = new Date();
          ficha_compra.itenscompra=fichas_itens;
          ficha_compra.valor_total = totalcompra;
          fichas_compra.add(ficha_compra);
           if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja Finalizar a Compra?","atenção ",javax.swing.JOptionPane.YES_NO_OPTION )==0){  
               try {
            FileOutputStream  arquivo = new FileOutputStream("compra.ser");
           try {
                ObjectOutputStream salva = new  ObjectOutputStream (arquivo);
                salva.writeObject(fichas_compra);
                salva.close();
            } catch (IOException ex) {
                Logger.getLogger(telaproduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(telaproduto.class.getName()).log(Level.SEVERE, null, ex);
        }
         FileOutputStream filestream;
        try {
            filestream = new FileOutputStream("produto.ser");
            try {
                ObjectOutputStream arquivo = new ObjectOutputStream(filestream);
                arquivo.writeObject(fichas_produto);
                arquivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Telafornecedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Telafornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
            
               this.dispose();  
       }
         
    }//GEN-LAST:event_FinalizarCompraActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
         if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja Fechar?","atenção ",javax.swing.JOptionPane.YES_NO_OPTION )==0){  
                this.dispose();  
            }  
    }//GEN-LAST:event_CancelarActionPerformed

    private void entradaprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaprodutoActionPerformed
        // TODO add your handling code here:
        //Pega a Quantidade em estoque
        ficha_produto = fichas_produto.get(entradaproduto.getSelectedIndex());
        qtde_estoque.setText(Integer.toString(ficha_produto.quantidade));
    }//GEN-LAST:event_entradaprodutoActionPerformed

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
            java.util.logging.Logger.getLogger(telacompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telacompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telacompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telacompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telacompra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox ComboFunc;
    private javax.swing.JButton FinalizarCompra;
    private javax.swing.JButton Incluir;
    private javax.swing.JTextField entradaPreco;
    private javax.swing.JComboBox entradafornecedor;
    private javax.swing.JComboBox entradaproduto;
    private javax.swing.JSpinner entradaquantidade;
    private javax.swing.JScrollPane itensvenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JLabel qtde_estoque;
    private javax.swing.JTable tabelaitens;
    // End of variables declaration//GEN-END:variables
}
