/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.ReceptionistLogin;

import Hospital.Employee;
import Hospital.Hospital;
import Hospital.LabTest;
import Hospital.Patient;
import Hospital.PatientTest;
import UI.MainFrame;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author shrey
 */
public class TestDetails extends javax.swing.JPanel {

    /**
     * Creates new form TestDetails
     */
    Hospital hospital;
    Employee employee;
    public TestDetails(Hospital hospital, Employee employee) {
        initComponents();
        this.hospital = hospital;
        this.employee = employee;
        populateDoctorDropDown();
        populateLabtestDropDown();
    }
    
    public void populateDoctorDropDown() {
        
        cmbdoctor.removeAllItems();
        for(Employee doctor : hospital.getEmployeeDirectory().getEmployeeList().stream().filter(r -> r.isDoctor()).collect(Collectors.toList())) {
            cmbdoctor.addItem(doctor.toString());
           
        }
         cmbdoctor.setSelectedIndex(0);
    }
    
    public void populateLabtestDropDown() {
        
        cmbtestname.removeAllItems();
        for(LabTest labtest : hospital.getLabTestDirectory().getLabTestList()) {
            cmbtestname.addItem(labtest.getTestName());           
        }
         cmbtestname.setSelectedIndex(0);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtName2 = new javax.swing.JTextField();
        txtPhNo = new javax.swing.JTextField();
        txtemail2 = new javax.swing.JTextField();
        cmbdoctor = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtDate1 = new javax.swing.JTextField();
        cmbtestname = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Test Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 160, 39));

        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 93, -1, -1));

        jLabel6.setText("Contact Information :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel7.setText("Test Name:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel8.setText("Email:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel10.setText("Ordering Physician :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 220, 60));
        add(txtName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 76, 230, 30));
        add(txtPhNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 230, 30));

        txtemail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemail2ActionPerformed(evt);
            }
        });
        add(txtemail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 300, 230, 30));

        cmbdoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbdoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 230, 30));

        jLabel11.setText("Date");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        txtDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDate1ActionPerformed(evt);
            }
        });
        add(txtDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 230, 230, 30));

        cmbtestname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbtestname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 230, 30));

        jButton2.setBackground(new java.awt.Color(102, 204, 255));
        jButton2.setText("< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel3.setText("mm/dd/yyyy");
        jLabel3.setEnabled(false);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void txtemail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemail2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemail2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = txtName2.getText();
        String number = txtPhNo.getText();
        String testName = (String) cmbtestname.getSelectedItem();
        String date = txtDate1.getText();
        String email = txtemail2.getText();
        String doctorName = (String) cmbdoctor.getSelectedItem();
        if (name.trim().isEmpty() || number.trim().isEmpty() || testName.trim().isEmpty()
            || date.trim().isEmpty() || email.trim().isEmpty() || doctorName.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter all details", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        // Validation for phone number (10-digit number)
        if (!number.matches("\\d{10}")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid 10-digit phone number", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validation for date format (mm/dd/yyyy)
        if (!date.matches("(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/(19|20)\\d\\d")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid date in mm/dd/yyyy format", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    

    // Validation for email format
        if (!email.matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid email address", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        Random random = new Random();
        int random1 = random.nextInt(1000);
        
        Optional<Patient> existingPatient = hospital.getPatientDirectory().getPatientList().stream().filter(n -> n.getPatientName() == name).findFirst();
        Patient p1 = null;
        if(existingPatient.isPresent()) {
            p1 = existingPatient.get();
        }
        else {
            p1 = new Patient(String.valueOf(random1),name, number,email);
            hospital.addNewPatient(p1); 
        }
        
        LabTest selectLabTest = null;
        
        for(LabTest labtest : hospital.getLabTestDirectory().getLabTestList()) {
            if(labtest.getTestName().equals(testName)) {
                selectLabTest = labtest;
                break;
            }
        }
        
        PatientTest pt1 = new PatientTest(date, false, String.valueOf(random1), selectLabTest, p1, "",doctorName);
        hospital.addNewPatientTest(pt1);
        JOptionPane.showMessageDialog(this, "Test Booked");
        ReceptionistLandingPage vajp1 = new ReceptionistLandingPage(hospital, employee);
        MainFrame.mfInstance.setMainframeSplitFrame(vajp1);
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDate1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ReceptionistLandingPage rljp = new ReceptionistLandingPage(hospital, employee);
        MainFrame.mfInstance.setMainframeSplitFrame(rljp);

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbdoctor;
    private javax.swing.JComboBox<String> cmbtestname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtDate1;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtPhNo;
    private javax.swing.JTextField txtemail2;
    // End of variables declaration//GEN-END:variables
}
