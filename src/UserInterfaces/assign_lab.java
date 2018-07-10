/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces;

import Controller.labController;
import Model.lab;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashera
 */
public class assign_lab extends javax.swing.JFrame {

    /**
     * Creates new form assign_lab
     */
    public assign_lab() {
        initComponents();
        homeButton.setContentAreaFilled(false);
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
        labAssignmentHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        home_Label = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        subjectCode_label = new javax.swing.JLabel();
        subjectCode = new javax.swing.JTextField();
        instructor_id_label = new javax.swing.JLabel();
        instructorID = new javax.swing.JTextField();
        labCode_label = new javax.swing.JLabel();
        labCode = new javax.swing.JTextField();
        studentRange_label = new javax.swing.JLabel();
        studentRange = new javax.swing.JTextField();
        dayCombo = new javax.swing.JComboBox<>();
        day_Label = new javax.swing.JLabel();
        timeSlot_Label = new javax.swing.JLabel();
        confirmButton1 = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        timeCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(null);

        labAssignmentHeader.setBackground(new java.awt.Color(36, 47, 65));
        labAssignmentHeader.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LAB ASSIGNMENT");
        labAssignmentHeader.add(jLabel1);
        jLabel1.setBounds(0, 13, 898, 64);

        home_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        labAssignmentHeader.add(home_Label);
        home_Label.setBounds(0, 0, 90, 90);

        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        labAssignmentHeader.add(homeButton);
        homeButton.setBounds(0, 0, 90, 90);

        jPanel1.add(labAssignmentHeader);
        labAssignmentHeader.setBounds(0, 0, 910, 90);

        subjectCode_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        subjectCode_label.setText("Subject Code");
        jPanel1.add(subjectCode_label);
        subjectCode_label.setBounds(200, 130, 160, 30);

        subjectCode.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        subjectCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectCodeActionPerformed(evt);
            }
        });
        jPanel1.add(subjectCode);
        subjectCode.setBounds(450, 130, 250, 30);

        instructor_id_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        instructor_id_label.setText("Instructor ID");
        jPanel1.add(instructor_id_label);
        instructor_id_label.setBounds(200, 170, 160, 30);

        instructorID.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        instructorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructorIDActionPerformed(evt);
            }
        });
        jPanel1.add(instructorID);
        instructorID.setBounds(450, 170, 250, 30);

        labCode_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        labCode_label.setText("Lab Code");
        jPanel1.add(labCode_label);
        labCode_label.setBounds(200, 210, 160, 30);

        labCode.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labCodeActionPerformed(evt);
            }
        });
        jPanel1.add(labCode);
        labCode.setBounds(450, 210, 250, 30);

        studentRange_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        studentRange_label.setText("Student Range");
        jPanel1.add(studentRange_label);
        studentRange_label.setBounds(200, 330, 160, 30);

        studentRange.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        studentRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRangeActionPerformed(evt);
            }
        });
        jPanel1.add(studentRange);
        studentRange.setBounds(450, 330, 250, 30);

        dayCombo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        dayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        jPanel1.add(dayCombo);
        dayCombo.setBounds(450, 250, 265, 30);

        day_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        day_Label.setText("Day of week");
        jPanel1.add(day_Label);
        day_Label.setBounds(200, 250, 160, 30);

        timeSlot_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        timeSlot_Label.setText("Time Slot");
        jPanel1.add(timeSlot_Label);
        timeSlot_Label.setBounds(200, 290, 160, 30);

        confirmButton1.setBackground(new java.awt.Color(36, 47, 65));
        confirmButton1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        confirmButton1.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton1.setText("Confirm");
        confirmButton1.setBorder(null);
        confirmButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButton1ActionPerformed(evt);
            }
        });
        confirmButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmButton1KeyPressed(evt);
            }
        });
        jPanel1.add(confirmButton1);
        confirmButton1.setBounds(480, 400, 150, 50);

        backButton1.setBackground(new java.awt.Color(36, 47, 65));
        backButton1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        backButton1.setForeground(new java.awt.Color(255, 255, 255));
        backButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow.png"))); // NOI18N
        backButton1.setText("Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(backButton1);
        backButton1.setBounds(290, 400, 150, 50);

        timeCombo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        timeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8.00-10.00", "10.00-12.00", "1.00-3.00" }));
        jPanel1.add(timeCombo);
        timeCombo.setBounds(450, 290, 265, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 910, 510);

        setSize(new java.awt.Dimension(918, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subjectCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectCodeActionPerformed

    private void instructorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instructorIDActionPerformed

    private void labCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labCodeActionPerformed

    private void studentRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentRangeActionPerformed

    private void confirmButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButton1ActionPerformed
        String subject_code = subjectCode.getText();
        String instructor_id = instructorID.getText();
        String lab_code = labCode.getText();
        String day_of_week = (String) dayCombo.getSelectedItem();
        String time_slot = (String) timeCombo.getSelectedItem();
        String student_list = studentRange.getText();
        
        lab labSession = new lab(day_of_week,time_slot,lab_code,subject_code,instructor_id,student_list);
        try{
            int result = labController.addLabSession(labSession);
            if ( result>0 ) {
                JOptionPane.showMessageDialog(this,"Successfully Assigned Lab Session");
                new homepage().setVisible(true);
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(this,"Invalid");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_confirmButton1ActionPerformed

    private void confirmButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButton1KeyPressed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        new manage_staff().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        new homepage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(assign_lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(assign_lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(assign_lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(assign_lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new assign_lab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JButton confirmButton1;
    private javax.swing.JComboBox<String> dayCombo;
    private javax.swing.JLabel day_Label;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel home_Label;
    private javax.swing.JTextField instructorID;
    private javax.swing.JLabel instructor_id_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel labAssignmentHeader;
    private javax.swing.JTextField labCode;
    private javax.swing.JLabel labCode_label;
    private javax.swing.JTextField studentRange;
    private javax.swing.JLabel studentRange_label;
    private javax.swing.JTextField subjectCode;
    private javax.swing.JLabel subjectCode_label;
    private javax.swing.JComboBox<String> timeCombo;
    private javax.swing.JLabel timeSlot_Label;
    // End of variables declaration//GEN-END:variables
}
