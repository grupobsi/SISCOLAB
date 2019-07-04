/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.telas;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static siscolab.modelos.Validacao.convertDate;
import static siscolab.modelos.Validacao.validaCnpj;
import static siscolab.modelos.Validacao.validaEmail;
import static siscolab.modelos.Validacao.validaNasc;
import static siscolab.modelos.Validacao.isNotEmpty;

/**
 *
 * @author Julia
 */
public class LaboratorioCadastro extends javax.swing.JFrame {
    
    private String[] planosAtende;

    public JFormattedTextField getCnpjC() {
        return cnpjC;
    }

    public JTextField getEmailC() {
        return emailC;
    }

    public JTextField getMunicipioC() {
        return municipioC;
    }

    public JTextField getNomefantasiaC() {
        return nomefantasiaC;
    }

    public void setCnpjC(String cnpjC) {
        this.cnpjC.setText(cnpjC);
    }

    public void setEmailC(String emailC) {
        this.emailC.setText(emailC);
    }

    public void setMunicipioC(String municipioC) {
        this.municipioC.setText(municipioC);
    }

    public void setNomefantasiaC(String nomefantasiaC) {
        this.nomefantasiaC.setText(nomefantasiaC);
    }

    public void setSenhaC(String senhaC) {
        this.senhaC.setText(senhaC);
    }

    /**
     * Creates new form LaboratorioCad
     */
    public LaboratorioCadastro() {
        initComponents();
    }
    
    public String getEmailC_s() {
        return emailC.getText();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        titulo = new javax.swing.JLabel();
        nomefantasiaL = new javax.swing.JLabel();
        nomefantasiaC = new javax.swing.JTextField();
        cnpjL = new javax.swing.JLabel();
        cnpjC = new javax.swing.JFormattedTextField();
        emailL = new javax.swing.JLabel();
        emailC = new javax.swing.JTextField();
        senhaL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        municipioC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bInserir = new javax.swing.JButton();
        senhaC = new javax.swing.JPasswordField();
        qtdPlanos = new javax.swing.JTextField();
        bInserirPlanos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        listPlanos = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(115, 153, 0));
        titulo.setText("SISCOLAB - Área do laboratório");

        nomefantasiaL.setText("Nome Fantasia:");

        cnpjL.setText("CNPJ:");

        try {
            cnpjC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        emailL.setText("Email:");

        emailC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailCActionPerformed(evt);
            }
        });

        senhaL.setText("Senha:");

        jLabel1.setText("Município:");

        jLabel2.setText("Quantidade de Planos de Saúde:");

        bInserir.setText("Inserir");
        bInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInserirActionPerformed(evt);
            }
        });

        senhaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaCActionPerformed(evt);
            }
        });

        qtdPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdPlanosActionPerformed(evt);
            }
        });

        bInserirPlanos.setText("Inserir Planos de Saúde");
        bInserirPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInserirPlanosActionPerformed(evt);
            }
        });

        jLabel3.setText("Planos de Saúde:");

        listPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPlanosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(212, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(municipioC, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listPlanos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(qtdPlanos)
                                .addGap(18, 18, 18)
                                .addComponent(bInserirPlanos)))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bInserir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomefantasiaL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomefantasiaC, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cnpjL)
                                .addGap(18, 18, 18)
                                .addComponent(cnpjC, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(172, 172, 172))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailC, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(senhaL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(senhaC, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomefantasiaL)
                    .addComponent(nomefantasiaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpjL)
                    .addComponent(cnpjC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(qtdPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bInserirPlanos))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addComponent(listPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailL)
                    .addComponent(emailC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaL)
                    .addComponent(senhaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bInserir)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailCActionPerformed

    private void bInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInserirActionPerformed
        boolean aux = true; //while existe exception
        boolean aux1 = true;
        boolean aux2 = true;

        
        try {
            validaEmail(getEmailC_s());
        }catch (Exception ex){    
            JOptionPane.showMessageDialog(null, "E-mail inválido!", "Error", JOptionPane.ERROR_MESSAGE);
            aux1 = false;
        }
        
        try{
            validaCnpj(getCnpjC().getText());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "CNPJ inválido!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /*try {
            validaCpf(getCpfC_s());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "CPF inválido!", "Error", JOptionPane.ERROR_MESSAGE);
            aux2 = false;
        }*/
        
        
        //if (aux && aux1 && aux2){
           // Medico medico= new Medico(cpfC.getText(), rgC.getText(), nomeC.getText(), sobrenomeC.getText(), dataA, );
        //}
        
        
    }//GEN-LAST:event_bInserirActionPerformed

    private void senhaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaCActionPerformed

    private void bInserirPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInserirPlanosActionPerformed
        //inserir planos
        int tam = Integer.parseInt(qtdPlanos.getText());
        planosAtende = new String[tam];
        
        for(int i = 0; i < tam; i++){
            String plano = JOptionPane.showInputDialog(this, "Plano de Saúde " +(i+1)+":");
            planosAtende[i] = plano;
            listPlanos.add(plano);
        }
        
    }//GEN-LAST:event_bInserirPlanosActionPerformed

    private void qtdPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdPlanosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdPlanosActionPerformed

    private void listPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPlanosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listPlanosActionPerformed

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
            java.util.logging.Logger.getLogger(LaboratorioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaboratorioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaboratorioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaboratorioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaboratorioCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bInserir;
    private javax.swing.JButton bInserirPlanos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField cnpjC;
    private javax.swing.JLabel cnpjL;
    private javax.swing.JTextField emailC;
    private javax.swing.JLabel emailL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.List listPlanos;
    private javax.swing.JTextField municipioC;
    private javax.swing.JTextField nomefantasiaC;
    private javax.swing.JLabel nomefantasiaL;
    private javax.swing.JTextField qtdPlanos;
    private javax.swing.JPasswordField senhaC;
    private javax.swing.JLabel senhaL;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

}
