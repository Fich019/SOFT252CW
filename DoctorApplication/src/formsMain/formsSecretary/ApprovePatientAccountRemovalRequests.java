/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formsMain.formsSecretary;

import Users.userSecretary.RemoveAccount;
import Users.userSecretary.ViewDeleteUser;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Zack
 */
public class ApprovePatientAccountRemovalRequests extends javax.swing.JFrame {

    /**
     * Creates new form ApprovePatientAccountRemovalRequests
     */
    public ApprovePatientAccountRemovalRequests() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        txbxpatientAcc = new javax.swing.JTextArea();
        btnapprove = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        cmbxpatientIDs = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        txbxpatientAcc.setColumns(20);
        txbxpatientAcc.setRows(5);
        jScrollPane2.setViewportView(txbxpatientAcc);

        btnapprove.setText("Approve");
        btnapprove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnapproveMouseClicked(evt);
            }
        });
        btnapprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapproveActionPerformed(evt);
            }
        });

        lblTitle.setText("Approve Account removal");

        lblPatientID.setText("Patient ID: ");

        btnback.setText("Back");
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
        });

        cmbxpatientIDs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxpatientIDsActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 307, Short.MAX_VALUE)
                                .addComponent(btnapprove))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnback)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPatientID)
                                .addGap(18, 18, 18)
                                .addComponent(cmbxpatientIDs, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnback))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientID)
                    .addComponent(cmbxpatientIDs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnapprove)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnapproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapproveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnapproveActionPerformed

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
        // TODO add your handling code here:
        new SecretaryHomeScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        RemoveAccount r = new RemoveAccount();
        ArrayList<String> assign = new ArrayList<String>();
        assign = r.GetRemovePatients();
        
        for (int i = 0; i < assign.size(); i++){
            cmbxpatientIDs.addItem(assign.get(i));
        }
        
        ViewDeleteUser v = new ViewDeleteUser();
        String userdata = v.getSelectedUser(cmbxpatientIDs.getSelectedItem().toString());
        txbxpatientAcc.setText(userdata);
    }//GEN-LAST:event_formWindowActivated

    private void cmbxpatientIDsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxpatientIDsActionPerformed
        // TODO add your handling code here:
        ViewDeleteUser v = new ViewDeleteUser();
        String userdata = v.getSelectedUser(cmbxpatientIDs.getSelectedItem().toString());
        txbxpatientAcc.setText(userdata);
    }//GEN-LAST:event_cmbxpatientIDsActionPerformed

    private void btnapproveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnapproveMouseClicked
        // TODO add your handling code here:
        String userID = cmbxpatientIDs.getSelectedItem().toString();
        RemoveAccount r = new RemoveAccount();
        r.removeAccount(userID);
        
        JOptionPane.showMessageDialog(null, "Account successfully deleted!", "Ok", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnapproveMouseClicked

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
            java.util.logging.Logger.getLogger(ApprovePatientAccountRemovalRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApprovePatientAccountRemovalRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApprovePatientAccountRemovalRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApprovePatientAccountRemovalRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApprovePatientAccountRemovalRequests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnapprove;
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox<String> cmbxpatientIDs;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txbxpatientAcc;
    // End of variables declaration//GEN-END:variables
}
