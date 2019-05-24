/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.telas;

/**
 *
 * @author 20171BSI0278
 */
public class MedicoListagem extends javax.swing.JFrame {

    /**
     * Creates new form MedicoListagem
     */
    public MedicoListagem() {
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

        bExcluir1 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        listaMedicos = new java.awt.List();
        bAdicionar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bAtualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bExibir = new javax.swing.JButton();

        bExcluir1.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        bExcluir1.setText("Excluir");
        bExcluir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bExcluir1MouseClicked(evt);
            }
        });
        bExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluir1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(115, 153, 0));
        titulo.setText("SISCOLAB");

        bAdicionar.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        bAdicionar.setText("Adicionar");
        bAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAdicionarMouseClicked(evt);
            }
        });
        bAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdicionarActionPerformed(evt);
            }
        });

        bExcluir.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        bExcluir.setText("Excluir");
        bExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bExcluirMouseClicked(evt);
            }
        });
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bAtualizar.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        bAtualizar.setText("Atualizar");
        bAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAtualizarMouseClicked(evt);
            }
        });
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        jLabel1.setText("Médicos já cadastrados");

        bExibir.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        bExibir.setText("Exibir mais");
        bExibir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bExibirMouseClicked(evt);
            }
        });
        bExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExibirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo)
                    .addComponent(listaMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(bExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(bAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(bExibir))
                    .addComponent(jLabel1))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(listaMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bExcluir)
                    .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAdicionarMouseClicked

    }//GEN-LAST:event_bAdicionarMouseClicked

    private void bAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAdicionarActionPerformed

    private void bExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExcluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bExcluirMouseClicked

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bExcluirActionPerformed

    private void bExcluir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExcluir1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bExcluir1MouseClicked

    private void bExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bExcluir1ActionPerformed

    private void bAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAtualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bAtualizarMouseClicked

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAtualizarActionPerformed

    private void bExibirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExibirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bExibirMouseClicked

    private void bExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExibirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bExibirActionPerformed

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
            java.util.logging.Logger.getLogger(MedicoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicoListagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdicionar;
    private javax.swing.JButton bAtualizar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bExcluir1;
    private javax.swing.JButton bExibir;
    private javax.swing.JLabel jLabel1;
    private java.awt.List listaMedicos;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
