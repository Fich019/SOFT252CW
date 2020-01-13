/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formsMain.formsPatient;

import Users.PatientUser;
import formsMain.HomeScreen;

/**
 *
 * @author Zack
 */
public class PatientHomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form PatientHomeScreen
     */
    public PatientHomeScreen() {
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
        btngiveFeedback = new javax.swing.JButton();
        btnreqAccTermination = new javax.swing.JButton();
        btnreqAppointment = new javax.swing.JButton();
        btnlogoff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnviewApp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btngiveFeedback.setText("Give feedback");
        btngiveFeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btngiveFeedbackMouseClicked(evt);
            }
        });

        btnreqAccTermination.setText("Request account termination");
        btnreqAccTermination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreqAccTerminationMouseClicked(evt);
            }
        });

        btnreqAppointment.setText("Request appointment");
        btnreqAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreqAppointmentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btngiveFeedback)
                    .addComponent(btnreqAccTermination)
                    .addComponent(btnreqAppointment))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btngiveFeedback)
                .addGap(18, 18, 18)
                .addComponent(btnreqAccTermination)
                .addGap(18, 18, 18)
                .addComponent(btnreqAppointment)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnlogoff.setText("Log off");
        btnlogoff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoffMouseClicked(evt);
            }
        });

        jLabel1.setText("Home screen");

        btnviewApp.setText("View information");
        btnviewApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnviewAppMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnviewApp))
                        .addGap(0, 269, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnlogoff)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnviewApp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(btnlogoff)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogoffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoffMouseClicked
        // TODO add your handling code here:
        new HomeScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoffMouseClicked

    private void btnviewAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewAppMouseClicked
        // TODO add your handling code here:
        new ViewInfo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnviewAppMouseClicked

    private void btngiveFeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngiveFeedbackMouseClicked
        // TODO add your handling code here;
        new FGiveFeedback().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btngiveFeedbackMouseClicked

    private void btnreqAccTerminationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreqAccTerminationMouseClicked
        // TODO add your handling code here:
        new RequestAccoutTermination().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnreqAccTerminationMouseClicked

    private void btnreqAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreqAppointmentMouseClicked
        // TODO add your handling code here:
        new AppointmentRequest().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnreqAppointmentMouseClicked

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
            java.util.logging.Logger.getLogger(PatientHomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientHomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientHomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientHomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientHomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngiveFeedback;
    private javax.swing.JButton btnlogoff;
    private javax.swing.JButton btnreqAccTermination;
    private javax.swing.JButton btnreqAppointment;
    private javax.swing.JButton btnviewApp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
