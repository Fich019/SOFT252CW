/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formsMain.formsDoctor;

import Users.DoctorUser;
import Users.userDoctor.AppendNotes;
import Users.userDoctor.CreatePrescription;
import Users.userDoctor.GetMedicines;
import Users.userDoctor.GetPatientAppointments;
import Users.userDoctor.GetPatientHistory;
import Users.userDoctor.MarkAsAttended;
import Users.userSecretary.CreateAppointment;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Zack
 */
public class Consult extends javax.swing.JFrame {

    /**
     * Creates new form Consult
     */
    public Consult() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cmbxpatientID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbxdate = new javax.swing.JComboBox<>();
        btnback = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtappointmentNotes = new javax.swing.JTextArea();
        btnappendNotes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtpatHistory = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbxmeds = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtdosage = new javax.swing.JTextField();
        btncreatePrescription = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnattended = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Appointment");

        jLabel2.setText("PatientID");

        cmbxpatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxpatientIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Date of appointment:");

        cmbxdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxdateActionPerformed(evt);
            }
        });

        btnback.setText("Back");
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
        });

        jLabel4.setText("Appointment notes:");

        txtappointmentNotes.setColumns(20);
        txtappointmentNotes.setRows(5);
        jScrollPane1.setViewportView(txtappointmentNotes);

        btnappendNotes.setText("Append / add notes");
        btnappendNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnappendNotesMouseClicked(evt);
            }
        });
        btnappendNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnappendNotesActionPerformed(evt);
            }
        });

        txtpatHistory.setColumns(20);
        txtpatHistory.setRows(5);
        jScrollPane2.setViewportView(txtpatHistory);

        jLabel5.setText("Patient history:");

        jLabel6.setText("Prescribe medicine");

        jLabel7.setText("Medicine:");

        jLabel8.setText("Dosage:");

        btncreatePrescription.setText("Create prescription");
        btncreatePrescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncreatePrescriptionMouseClicked(evt);
            }
        });
        btncreatePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreatePrescriptionActionPerformed(evt);
            }
        });

        btnattended.setText("Mark as attended");
        btnattended.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnattendedMouseClicked(evt);
            }
        });
        btnattended.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnattendedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnback))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbxpatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbxdate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnappendNotes)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtdosage, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbxmeds, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btncreatePrescription))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnattended, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnback))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbxpatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbxdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnappendNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbxmeds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(btncreatePrescription))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtdosage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnattended)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
        // TODO add your handling code here:
        new DoctorHomeScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackMouseClicked

    private void btnappendNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnappendNotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnappendNotesActionPerformed

    private void btncreatePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreatePrescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncreatePrescriptionActionPerformed

    private void btnattendedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnattendedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnattendedActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        CreateAppointment p = new CreateAppointment();
        ArrayList<String> assign = new ArrayList<String>();
        assign = p.GetPatientIDs();
        
        for (int i = 0; i < assign.size(); i++){
            cmbxpatientID.addItem(assign.get(i));
        }
        
        
        GetPatientAppointments a = new GetPatientAppointments();
        ArrayList<String> assign2 = new ArrayList<String>();
        assign2 = a.GetPatientAppointments(cmbxpatientID.getSelectedItem().toString());
        
        for (int j = 0; j < assign2.size(); j++){
            cmbxdate.addItem(assign2.get(j));
        }
        
        GetMedicines m = new GetMedicines();
        ArrayList<String> assign3 = new ArrayList<String>();
        assign3 = m.GetMeds();
        
        for (int j = 0; j < assign3.size(); j++){
            cmbxmeds.addItem(assign3.get(j));
        }
        
        
        GetPatientHistory h = new GetPatientHistory();
        String history = h.GetHistory(cmbxpatientID.getSelectedItem().toString());
        txtpatHistory.setText(history);
        
        GetPatientAppointments note = new GetPatientAppointments();
        String notes = note.GetAppointments(cmbxdate.getSelectedItem().toString());
        txtappointmentNotes.setText(notes);
    }//GEN-LAST:event_formWindowActivated

    private void cmbxpatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxpatientIDActionPerformed
        // TODO add your handling code here:
        GetPatientHistory h = new GetPatientHistory();
        String appointment = h.GetHistory(cmbxpatientID.getSelectedItem().toString());
        txtpatHistory.setText(appointment);
        
        cmbxdate.removeAllItems();
        GetPatientAppointments a = new GetPatientAppointments();
        ArrayList<String> assign2 = new ArrayList<String>();
        assign2 = a.GetPatientAppointments(cmbxpatientID.getSelectedItem().toString());
        
        for (int i = 0; i < assign2.size(); i++){
            cmbxdate.addItem(assign2.get(i));
        }
        
        GetPatientAppointments note = new GetPatientAppointments();
        String notes = note.GetAppointments(cmbxdate.getSelectedItem().toString());
        txtappointmentNotes.setText(notes);
    }//GEN-LAST:event_cmbxpatientIDActionPerformed

    private void cmbxdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxdateActionPerformed
        // TODO add your handling code here:
        
        GetPatientAppointments note = new GetPatientAppointments();
        String notes = note.GetAppointments(cmbxdate.getSelectedItem().toString());
        txtappointmentNotes.setText(notes);
    }//GEN-LAST:event_cmbxdateActionPerformed

    private void btnappendNotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnappendNotesMouseClicked
        // TODO add your handling code here:
        AppendNotes a = new AppendNotes();
        String notes = txtappointmentNotes.getText();
        a.AppendNotes(notes,cmbxdate.getSelectedItem().toString(),cmbxpatientID.getSelectedItem().toString() );
        
        JOptionPane.showMessageDialog(null, "Notes changed!", "Ok", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnappendNotesMouseClicked

    private void btncreatePrescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncreatePrescriptionMouseClicked
        // TODO add your handling code here:
        String medicine = cmbxmeds.getSelectedItem().toString();
        String dosage = txtdosage.getText();
        String doctorID = DoctorUser.userID;
        String patientID = cmbxpatientID.getSelectedItem().toString();
        
        CreatePrescription p = new CreatePrescription();
        p.AddPrescription(dosage, doctorID, patientID, medicine);
        
        JOptionPane.showMessageDialog(null, "Prescription added!", "Ok", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btncreatePrescriptionMouseClicked

    private void btnattendedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnattendedMouseClicked
        // TODO add your handling code here:
        String patientID = cmbxpatientID.getSelectedItem().toString();
        String date = cmbxdate.getSelectedItem().toString();
        
        MarkAsAttended m = new MarkAsAttended();
        m.Attended(date, patientID);
        
        JOptionPane.showMessageDialog(null, "Patient has been marked as attended!", "Ok", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnattendedMouseClicked

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
            java.util.logging.Logger.getLogger(Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnappendNotes;
    private javax.swing.JButton btnattended;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncreatePrescription;
    private javax.swing.JComboBox<String> cmbxdate;
    private javax.swing.JComboBox<String> cmbxmeds;
    private javax.swing.JComboBox<String> cmbxpatientID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea txtappointmentNotes;
    private javax.swing.JTextField txtdosage;
    private javax.swing.JTextArea txtpatHistory;
    // End of variables declaration//GEN-END:variables
}