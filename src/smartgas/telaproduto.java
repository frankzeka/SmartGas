/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgas;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class telaproduto extends javax.swing.JFrame {
 produto ficha  = new produto();
ArrayList<produto>  fichario = new ArrayList<produto>();
int atual = 0;// controla a ficha atual
int total =0;//conta o total de fichas criadas
private produto fichas;


    /**
     * Creates new form telaproduto
     */
    public telaproduto() {
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

        jButton1 = new javax.swing.JButton();
        Salvar = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        Proximo = new javax.swing.JButton();
        Cancela = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        variavel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        entradaquantidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        entradapreçounitario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entradapeso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        entradatipo = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        Anterior.setText("Anterior");
        Anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnteriorMouseClicked(evt);
            }
        });

        Proximo.setText("Próximo");
        Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProximoActionPerformed(evt);
            }
        });

        Cancela.setText("Cancela");
        Cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaActionPerformed(evt);
            }
        });

        jLabel5.setText("contador");

        variavel.setText("0");

        jLabel1.setText("Quantidade");

        jLabel2.setText("Preço unitário");

        jLabel3.setText("Peso");

        jLabel4.setText("Tipo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(entradaquantidade))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entradapreçounitario)
                        .addGap(55, 55, 55)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(93, 93, 93)
                .addComponent(entradapeso)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(entradatipo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(entradaquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(entradapreçounitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entradapeso, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(entradatipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Salvar)
                .addGap(18, 18, 18)
                .addComponent(Anterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Proximo)
                .addGap(18, 18, 18)
                .addComponent(Cancela)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(variavel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(variavel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar)
                    .addComponent(Anterior)
                    .addComponent(Proximo)
                    .addComponent(Cancela))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        // TODO add your handling code here:
         ficha = new produto();
    ficha.quantidade=Integer.parseInt(entradaquantidade.getText());
    entradaquantidade.setText("");
    
    ficha.precounitario=Integer.parseInt(entradapreçounitario.getText());
    entradapreçounitario.setText("");
    
    ficha.peso=Integer.parseInt(entradapeso.getText());
    entradapeso.setText("");
    
    ficha.tipo = entradatipo.getText();
    entradatipo.setText("");
    
    total++;
        atual = atual+1; //vai para a prox ficha
        variavel.setText(Integer.toString(atual));
        fichario.add(ficha);
        try {
            FileOutputStream  arquivo = new FileOutputStream("produto.ser");
            try {
                ObjectOutputStream salva = new  ObjectOutputStream (arquivo);
                salva.writeObject(fichario);
                salva.close();
            } catch (IOException ex) {
                Logger.getLogger(telaproduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(telaproduto.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    
                 
         
         
         
         
    }//GEN-LAST:event_SalvarActionPerformed

    private void ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProximoActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (atual>total){
            variavel.setText("Fim atingido!");
            atual=total;
        }else{
            atual=atual++;
            variavel.setText(Integer.toString(atual));
        }
        entradaquantidade.setText(Integer.toString(ficha.quantidade));
        entradapreçounitario.setText(Float.toString(ficha.precounitario));
        entradapeso.setText(Integer.toString(ficha.peso));
        entradatipo.setText(ficha.tipo);  
    }//GEN-LAST:event_ProximoActionPerformed

    private void CancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelaActionPerformed

    private void AnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnteriorMouseClicked
        // TODO add your handling code here:
        if (atual<=0){
            //avisa o usuario que chegou no inicio
            variavel.setText("Inicio atingido");
            atual=0;//volta para 0 para nao dar problema
        }else{
            atual = atual-1;//volta para a anterior 
            variavel.setText(Integer.toString(atual));
        }
        ficha = new produto();
        ficha = fichario.get(atual);// pega a ficha atual do fichario
        entradaquantidade.setText(Integer.toString(ficha.quantidade));
        entradapreçounitario.setText(Float.toString(ficha.precounitario));
        entradapeso.setText(Integer.toString(ficha.peso));
        entradatipo.setText(ficha.tipo);      
      
          
    
    }//GEN-LAST:event_AnteriorMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        File testa = new File ("produto.ser");
        if (testa.exists()){
            try {
                FileInputStream arquivo = new FileInputStream("produto.ser");
                try {
                    ObjectInputStream carregar = new ObjectInputStream(arquivo);
                    try {
                        Object objeto = carregar.readObject();
                        fichario = (ArrayList<produto>) objeto;
                        carregar.close();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(telaproduto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(telaproduto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(telaproduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        total = fichario.size();
        atual = total-1;
        ficha = new produto();
        ficha = fichario.get(atual);// pega a ficha atual do fichario
        entradaquantidade.setText(Integer.toString(ficha.quantidade));
        entradapreçounitario.setText(Float.toString(ficha.precounitario));
        entradapeso.setText(Integer.toString(ficha.peso));
        entradatipo.setText(ficha.tipo);     
                
        }
    
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new telaproduto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JButton Cancela;
    private javax.swing.JButton Proximo;
    private javax.swing.JButton Salvar;
    private javax.swing.JTextField entradapeso;
    private javax.swing.JTextField entradapreçounitario;
    private javax.swing.JTextField entradaquantidade;
    private javax.swing.JTextField entradatipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel variavel;
    // End of variables declaration//GEN-END:variables
}
