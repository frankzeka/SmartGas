/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
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
        jButton1 = new javax.swing.JButton();
        Produto = new javax.swing.JComboBox();
        EntradaPreco = new javax.swing.JFormattedTextField();
        Qtde = new javax.swing.JSpinner();
        Fornecedor = new javax.swing.JComboBox();

        setTitle("Tela de Compra");
        setName("formtelacompra"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel1.setText("Fornecedor:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 40, 80, 17);

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

        jPanel1.add(itensvenda);
        itensvenda.setBounds(40, 270, 420, 150);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Produto:");

        jLabel3.setText("Quantidade:");

        jButton1.setText("Incluir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        EntradaPreco.setBorder(javax.swing.BorderFactory.createTitledBorder("Preço de compra"));
        EntradaPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Qtde, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(EntradaPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Qtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(EntradaPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 90, 450, 140);

        Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(Fornecedor);
        Fornecedor.setBounds(130, 40, 350, 25);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(518, 473));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:        
        try{
            ObjectInputStream arqEntrada = new ObjectInputStream(new FileInputStream(new File("fornecedor.ser")));
            fichas_fornecedor = (ArrayList<fornecedor>) arqEntrada.readObject();
            int totalF = fichas_fornecedor.size();
            for (int x=0; x<totalF;x++){ //for
                Fornecedor.addItem(fichas_fornecedor.get(x).nome);
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
                Produto.addItem(fichas_produto.get(x).tipo);
            }
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

    private void FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FornecedorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Object linha[] = {Produto.getSelectedItem(),Qtde.getValue(),EntradaPreco.getText()};
        DefaultTableModel dtm = (DefaultTableModel) tabelaitens.getModel();
        dtm.addRow(linha);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
    private javax.swing.JFormattedTextField EntradaPreco;
    private javax.swing.JComboBox Fornecedor;
    private javax.swing.JComboBox Produto;
    private javax.swing.JSpinner Qtde;
    private javax.swing.JScrollPane itensvenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable tabelaitens;
    // End of variables declaration//GEN-END:variables
}
