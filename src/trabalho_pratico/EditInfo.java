/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_pratico;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class EditInfo extends javax.swing.JFrame {

    /**
     * Creates new form EditInfo
     */
    public EditInfo() {
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

        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("ISBN");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Remover Livro", "Remover Livros de um autor", "Remover Autor", "Alterar Preco", "Adicionar Premios" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Go");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField2.setText("jTextField2");

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String x= String.valueOf(jComboBox1.getSelectedItem());
        
        if(x.equals("Remover Livro"))
            {
                jTextField1.setText("ISBN");
                jTextField2.setVisible(false);
            }
            else if(x.equals("Remover Livros de um autor"))
            {
                jTextField1.setText("Código autor");
                jTextField2.setVisible(false);
            }
            else if(x.equals("Remover Autor"))
            {
                jTextField1.setText("Código do autor");
                jTextField2.setVisible(false);
            }
            else if(x.equals("Alterar Preco"))
            {
                jTextField1.setText("ISBN");
                jTextField2.setText("Novo preço");
                jTextField2.setVisible(true);     
            }
            else if(x.equals("Adicionar Premios"))
            {
                jTextField1.setText("Codigo do autor");
                jTextField2.setText("Premio");
                jTextField2.setVisible(true);
            }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList res = new ArrayList();
        String x= String.valueOf(jComboBox1.getSelectedItem());
        String resultado;
        



        try{
            if(x.equals("Remover Livro"))
            {
                    resultado=Trabalho_Pratico.removeLivroIsbn(jTextField1.getText());
                    jTextArea1.setText(resultado);
                    if(Trabalho_Pratico.validarDocumentoDTD("livros.xml", "livros.dtd")==1)
                    {
                        JOptionPane.showMessageDialog(this, "Livros.xml validado por DTD","Sucesso", JOptionPane.PLAIN_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Invalido por DTD","Erro", JOptionPane.ERROR_MESSAGE);
                    }

            }
            else if(x.equals("Remover Livros de um autor"))
            {
                    resultado=Trabalho_Pratico.removeLivroAutor(jTextField1.getText());
                    jTextArea1.setText(resultado);
                    if(Trabalho_Pratico.validarDocumentoDTD("livros.xml", "livros.dtd")==1)
                    {
                        JOptionPane.showMessageDialog(this, "Livros.xml validado por DTD","Sucesso", JOptionPane.PLAIN_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Invalido por DTD","Erro", JOptionPane.ERROR_MESSAGE);
                    }
            }
            else if(x.equals("Remover Autor"))
            {
                    resultado=Trabalho_Pratico.removeAutorCod(jTextField1.getText());
                    jTextArea1.setText(resultado);
                    if(Trabalho_Pratico.validarDocumentoDTD("autores.xml", "autores.dtd")==1)
                    {
                        JOptionPane.showMessageDialog(this, "Autores.xml validado por DTD","Sucesso", JOptionPane.PLAIN_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Invalido por DTD","Erro", JOptionPane.ERROR_MESSAGE);
                    }
            }
            else if(x.equals("Alterar Preco"))
            {
                    resultado=Trabalho_Pratico.alteraPrecoLivro(jTextField1.getText(), jTextField2.getText());
                    jTextArea1.setText(resultado);
                    if(Trabalho_Pratico.validarDocumentoDTD("livros.xml", "livros.dtd")==1)
                    {
                        JOptionPane.showMessageDialog(this, "Livros.xml validado por DTD","Sucesso", JOptionPane.PLAIN_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Invalido por DTD","Erro", JOptionPane.ERROR_MESSAGE);
                    }
            }
            else if(x.equals("Adicionar Premios"))
            {
                    resultado=Trabalho_Pratico.adicionaPremios(jTextField1.getText(), jTextField2.getText());
                    jTextArea1.setText(resultado);
                    if(Trabalho_Pratico.validarDocumentoDTD("autores.xml", "autores.dtd")==1)
                    {
                        JOptionPane.showMessageDialog(this, "Autores.xml validado por DTD","Sucesso", JOptionPane.PLAIN_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Invalido por DTD","Erro", JOptionPane.ERROR_MESSAGE);
                    }
            }
            
        }catch (IOException ex) {
            Logger.getLogger(EditInfo.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
