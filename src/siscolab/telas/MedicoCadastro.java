/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.telas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import siscolab.modelos.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import siscolab.modelos.Validacao.SoNumeros;
/**
 *
 * @author 20171BSI0278
 */
public class MedicoCadastro extends javax.swing.JFrame {

    private ArrayList<Usuario> container;
    /**
     * Creates new form MedicoCadastro
     */
    public MedicoCadastro() {
        container = new ArrayList();
        initComponents();
        
    }
    
    public MedicoCadastro(ArrayList container) {
        this.container = container;
        initComponents();
        
        cpfC.setDocument(new SoNumeros());
        rgC.setDocument(new SoNumeros());
        dataNascimentoC.setDocument(new SoNumeros());
        crmC.setDocument(new SoNumeros());
        
        formatarCampoCPF();
        formatarCampoRG();
        formatarCampoDT();
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void formatarCampoCPF(){
        try {
            MaskFormatter mask = new MaskFormatter("###.###.###-##");
            mask.install(cpfC);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void formatarCampoRG(){
        try {
            MaskFormatter mask = new MaskFormatter("#.###.###");
            mask.install(rgC);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void formatarCampoDT(){
        try {
            MaskFormatter mask = new MaskFormatter("##/##/####");
            mask.install(dataNascimentoC);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        cpfT = new javax.swing.JLabel();
        rgT = new javax.swing.JLabel();
        nomeT = new javax.swing.JLabel();
        nomeC = new javax.swing.JTextField();
        sobrenomeT = new javax.swing.JLabel();
        sobrenomeC = new javax.swing.JTextField();
        dataNascimentoT = new javax.swing.JLabel();
        emailT = new javax.swing.JLabel();
        emailC = new javax.swing.JTextField();
        senhaT = new javax.swing.JLabel();
        senhaC = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        especialidadeT = new javax.swing.JLabel();
        especialidadeC = new javax.swing.JTextField();
        senhaT1 = new javax.swing.JLabel();
        municipioC = new javax.swing.JTextField();
        crmT = new javax.swing.JLabel();
        crmC = new javax.swing.JTextField();
        cpfC = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        rgC = new javax.swing.JFormattedTextField();
        dataNascimentoC = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(115, 153, 0));
        titulo.setText("SISCOLAB - Área do médico");

        cpfT.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        cpfT.setText("CPF:");

        rgT.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        rgT.setText("RG:");

        nomeT.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        nomeT.setText("Nome:");

        nomeC.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        nomeC.setText("Insira o seu nome");
        nomeC.setToolTipText("");
        nomeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCActionPerformed(evt);
            }
        });

        sobrenomeT.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        sobrenomeT.setText("Sobrenome:");

        sobrenomeC.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        sobrenomeC.setText("Insira o seu sobrenome");
        sobrenomeC.setToolTipText("");
        sobrenomeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobrenomeCActionPerformed(evt);
            }
        });

        dataNascimentoT.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        dataNascimentoT.setText("Data de Nascimento:");

        emailT.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        emailT.setText("Email:");

        emailC.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        emailC.setText("Insira o seu email");
        emailC.setToolTipText("");
        emailC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailCActionPerformed(evt);
            }
        });

        senhaT.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        senhaT.setText("Senha:");

        senhaC.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        senhaC.setText("Insira a sua senha");
        senhaC.setToolTipText("");
        senhaC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        senhaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaCActionPerformed(evt);
            }
        });

        ok.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        ok.setText("OK");
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        especialidadeT.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        especialidadeT.setText("Especialidade:");

        especialidadeC.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        especialidadeC.setText("Insira a sua especialidade");
        especialidadeC.setToolTipText("");
        especialidadeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadeCActionPerformed(evt);
            }
        });

        senhaT1.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        senhaT1.setText("Municipio: ");

        municipioC.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        municipioC.setText("Insira o seu municipio");
        municipioC.setToolTipText("");
        municipioC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        municipioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municipioCActionPerformed(evt);
            }
        });

        crmT.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        crmT.setText("CRM:");

        crmC.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        crmC.setText("Insira o CRM");
        crmC.setToolTipText("");
        crmC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crmCActionPerformed(evt);
            }
        });

        jLabel1.setText("- ES");

        jLabel2.setText("- ES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfT)
                            .addComponent(rgT)
                            .addComponent(nomeT)
                            .addComponent(sobrenomeT)
                            .addComponent(dataNascimentoT)
                            .addComponent(emailT)
                            .addComponent(senhaT)
                            .addComponent(crmT)
                            .addComponent(especialidadeT)
                            .addComponent(senhaT1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(crmC, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(especialidadeC, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(municipioC, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(nomeC, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(sobrenomeC, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(emailC, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(senhaC, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(cpfC)
                            .addComponent(rgC)
                            .addComponent(dataNascimentoC))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(ok)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cpfT)
                    .addComponent(cpfC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rgT)
                    .addComponent(jLabel1)
                    .addComponent(rgC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeT)
                    .addComponent(nomeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sobrenomeT)
                    .addComponent(sobrenomeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataNascimentoT)
                    .addComponent(dataNascimentoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailT)
                    .addComponent(emailC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaT)
                    .addComponent(senhaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crmT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(especialidadeT)
                        .addGap(12, 12, 12)
                        .addComponent(senhaT1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crmC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(especialidadeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(municipioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ok))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sobrenomeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrenomeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sobrenomeCActionPerformed

    private void nomeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCActionPerformed

    private void emailCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailCActionPerformed

    private void senhaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaCActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okActionPerformed

    private void especialidadeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadeCActionPerformed

    private void municipioCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municipioCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_municipioCActionPerformed

    private void crmCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crmCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crmCActionPerformed

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked

        // Lembrar de mudar para pegar de um banco/array de cadastro de especialidades...
        Especialidade e = new Especialidade(this.especialidadeC.getText());
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        Date data = null;
        
        try {
            data = formato.parse(this.dataNascimentoC.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        // String cpf, String rg, String nome, String sobrenome, Date dataNascimento, String email, String senha, String crm, Especialidade especialidade, String municipioAtuacao
        Medico m = new Medico(this.cpfC.getText(), this.rgC.getText(), this.nomeC.getText(), this.sobrenomeC.getText(), data , this.emailC.getText(), this.senhaC.getText(), this.crmC.getText(), e, this.municipioC.getText()); 
        this.container.add(m);
        JOptionPane.showMessageDialog(this, "Médico adicionado com sucesso!");
    }//GEN-LAST:event_okMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(MedicoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField cpfC;
    private javax.swing.JLabel cpfT;
    private javax.swing.JTextField crmC;
    private javax.swing.JLabel crmT;
    private javax.swing.JFormattedTextField dataNascimentoC;
    private javax.swing.JLabel dataNascimentoT;
    private javax.swing.JTextField emailC;
    private javax.swing.JLabel emailT;
    private javax.swing.JTextField especialidadeC;
    private javax.swing.JLabel especialidadeT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField municipioC;
    private javax.swing.JTextField nomeC;
    private javax.swing.JLabel nomeT;
    private javax.swing.JButton ok;
    private javax.swing.JFormattedTextField rgC;
    private javax.swing.JLabel rgT;
    private javax.swing.JTextField senhaC;
    private javax.swing.JLabel senhaT;
    private javax.swing.JLabel senhaT1;
    private javax.swing.JTextField sobrenomeC;
    private javax.swing.JLabel sobrenomeT;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
