
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
public class Telafornecedor extends javax.swing.JFrame {
fornecedor ficha  = new fornecedor();
ArrayList<fornecedor>  fichario = new ArrayList<fornecedor>();
int atual = 0;// controla a ficha atual
int total =0;//conta o total de fichas criadas

    /**
     * Creates new form telafornecedor
     */
    public Telafornecedor() {
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

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        entradanome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        entradaendereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        entradacidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entradatelefone = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Salvar = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        sair = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nome");

        entradanome.setPreferredSize(new java.awt.Dimension(180, 28));

        jLabel2.setText("Endereço");

        entradaendereco.setPreferredSize(new java.awt.Dimension(180, 28));

        jLabel4.setText("Cidade");

        entradacidade.setPreferredSize(new java.awt.Dimension(180, 28));

        jLabel3.setText("Telefone");

        entradatelefone.setPreferredSize(new java.awt.Dimension(180, 28));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entradatelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entradacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(307, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(17, 17, 17)
                        .addComponent(entradanome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entradaendereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(entradanome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(entradaendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(entradacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entradatelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        Salvar.setText("Salvar");
        Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalvarMouseClicked(evt);
            }
        });

        pesquisar.setText("Pesquisar");
        pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisarMouseClicked(evt);
            }
        });

        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Salvar)
                .addGap(41, 41, 41)
                .addComponent(pesquisar)
                .addGap(28, 28, 28)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar)
                    .addComponent(pesquisar)
                    .addComponent(sair))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarMouseClicked
        ficha  = new fornecedor();       
        ficha.nome = entradanome.getText();
        ficha.endereco = entradaendereco.getText();
        ficha.telefone = Integer.parseInt(entradatelefone.getText());
        ficha.cidade = entradacidade.getText();
        //acabou a coleta de dados
        //Limpa os campos
        entradanome.setText("");
        entradaendereco.setText("");
        entradatelefone.setText("");
        entradacidade.setText("");
        //limpando os campos
        
        //atualiza o contador
        atual++;// faz a mesma coisa que atual=atual+1
        //mostra em qual registro está(registro atual)

        fichario.add(ficha);
        FileOutputStream filestream;
        try {
            filestream = new FileOutputStream("fornecedor.ser");
            try {
                ObjectOutputStream arquivo = new ObjectOutputStream(filestream);
                arquivo.writeObject(fichario);
                arquivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Telafornecedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Telafornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }//GEN-LAST:event_SalvarMouseClicked

    private void pesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarMouseClicked
        // TODO add your handling code here:
        // 0 1 2 3 4 5 6 7 8 9
        if (atual<=0){
            atual=0;
        }else{
            atual--;
            
        }

        ficha = fichario.get(atual);
        entradanome.setText(ficha.nome);
        entradaendereco.setText(ficha.endereco);
        entradatelefone.setText(Integer.toString(ficha.telefone));
        entradacidade.setText(ficha.cidade);
    }//GEN-LAST:event_pesquisarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     File teste = new File("fornecedor.ser"); 
     if (teste.exists()){
            try {
                FileInputStream arquivo = new FileInputStream("fornecedor.ser");
                try {
                    ObjectInputStream fluxo = new ObjectInputStream (arquivo);
                    try {
                     Object objeto = fluxo.readObject();
                     fichario = (ArrayList<fornecedor>) objeto ;
                     total = fichario.size();
                     atual = total -1;
                     ficha = fichario.get(atual);
                     entradanome.setText(ficha.nome);
                     entradaendereco.setText(ficha.endereco);
                     entradatelefone.setText(Integer.toString(ficha.telefone));
                     entradacidade.setText(ficha.cidade);

                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Telafornecedor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Telafornecedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Telafornecedor.class.getName()).log(Level.SEVERE, null, ex);
            }
     }
         
    }//GEN-LAST:event_formWindowOpened

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        // TODO add your handling code here:
        if  (atual >=total-1){
            atual = total-1 ;
        } 
        else {
            atual++;
        }

        ficha = fichario.get(atual);        
        entradanome.setText(ficha.nome);
        entradaendereco.setText(ficha.endereco);
        entradatelefone.setText(Integer.toString(ficha.telefone));
        entradacidade.setText(ficha.cidade);
        
    }//GEN-LAST:event_sairMouseClicked

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
            java.util.logging.Logger.getLogger(Telafornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telafornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telafornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telafornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run(){
                new Telafornecedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salvar;
    private javax.swing.JTextField entradacidade;
    private javax.swing.JTextField entradaendereco;
    private javax.swing.JTextField entradanome;
    private javax.swing.JTextField entradatelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
