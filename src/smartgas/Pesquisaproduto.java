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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author info52
 */
public class Pesquisaproduto extends javax.swing.JDialog {
    ArrayList <produto> fichario = new ArrayList <produto>();
    ArrayList<Integer> achados = new ArrayList<Integer>();
    produto ficha = new produto();

    /**
     * Creates new form PesquisaProduto
     */
    public Pesquisaproduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        tipo = new javax.swing.JLabel();
        EntradaTipo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Pesquisar = new javax.swing.JButton();
        Ok = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        novo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tipo.setText("tipo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        Pesquisar.setText("Pesquisar");
        Pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesquisarMouseClicked(evt);
            }
        });

        Ok.setText("Alterar");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });

        Cancelar.setText("Ok");
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantidade", "Preço unitario", "Peso", "tipo"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        novo.setText("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipo)
                .addGap(42, 42, 42)
                .addComponent(EntradaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pesquisar)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Cancelar)
                        .addGap(33, 33, 33)
                        .addComponent(novo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tipo)
                        .addComponent(Pesquisar))
                    .addComponent(EntradaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ok)
                    .addComponent(Cancelar)
                    .addComponent(novo))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisarMouseClicked
        // TODO add your handling code here:
        boolean encontrou = false;//pra indicar se achou ou não
        int total = fichario.size();//pra contar as fichas
        DefaultTableModel dtm = (DefaultTableModel) Tabela.getModel();
        for (int x=0; x<total;x++){ //for
           ficha = fichario.get(x);//pega a ficha atual
           
          
           if(ficha.tipo.startsWith(EntradaTipo.getText())){
               achados.add(x);
                Object linha[] = { ficha.quantidade,ficha.precounitario, ficha.peso, ficha.tipo};
                dtm.addRow(linha);
               JOptionPane.showMessageDialog(null, "encontrado com sucesso", "SmartGas", JOptionPane.INFORMATION_MESSAGE);
               encontrou = true;
               
           }
           //JOptionPane.showMessageDialog(null, "Nome dentro do arquivo: "+ficha.nome+" Nome pesquisado: "+EntradaNome.getText(), "SmartGas", JOptionPane.INFORMATION_MESSAGE);
   
        }  
        if(!encontrou){
            JOptionPane.showMessageDialog(null, "nome nao encontrado.", "Agenda", JOptionPane.INFORMATION_MESSAGE);
       }      
        
    }//GEN-LAST:event_PesquisarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try{
            ObjectInputStream arqEntrada = new ObjectInputStream(new FileInputStream(new File("produto.ser")));
            fichario = (ArrayList<produto>) arqEntrada.readObject();
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Problema com a Classe", "SmartGas", JOptionPane.ERROR_MESSAGE);
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Gerando Arquivo de Dados", "SmartGas", JOptionPane.INFORMATION_MESSAGE);
            File arquivo = new File("produto.ser");
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch(IOException e){
                   JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado", "SmartGas", JOptionPane.INFORMATION_MESSAGE);
    }
                                     
    }//GEN-LAST:event_formWindowOpened

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        // TODO add your handling code here:
              if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja Fechar?","atenção ",javax.swing.JOptionPane.YES_NO_OPTION )==0){  
                this.dispose();         
      }
    }//GEN-LAST:event_CancelarMouseClicked

    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) Tabela.getModel();
        if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja Alterar?","TENÇÃO",javax.swing.JOptionPane.YES_NO_OPTION)==0){            
            retorna();
            this.dispose();
        }
    }//GEN-LAST:event_OkActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed

         EntradaTipo.setText("");
       
    }//GEN-LAST:event_novoActionPerformed

    public Integer retorna(){
        return achados.get(Tabela.getSelectedRow());   
        
    }
        
    /**
     * @param args the command line arguments
     */
    public static produto main(String args[]) {
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
            java.util.logging.Logger.getLogger(Pesquisaproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisaproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisaproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisaproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisaproduto(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField EntradaTipo;
    private javax.swing.JButton Ok;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JTable Tabela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton novo;
    private javax.swing.JLabel tipo;
    // End of variables declaration//GEN-END:variables

}