/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces;

import Controller.undergraduateController;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashera
 */
public class manage_student extends javax.swing.JFrame {
    public static boolean isUndergraduate;
    public static String editingStudentID;
    /**
     * Creates new form manage_student
     */
    public manage_student() {
        initComponents();
        homeButton.setContentAreaFilled(false);
        getStudentIDPanel.setVisible(false);
        selectPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        undergraduatePostgraduatePanel = new javax.swing.JPanel();
        manageStudentHeader = new javax.swing.JPanel();
        manageStudent_Label = new javax.swing.JLabel();
        home_Label = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        undergraduateImg = new javax.swing.JLabel();
        undergraduateButton = new javax.swing.JButton();
        postgraduateButton = new javax.swing.JButton();
        postgraduateImg = new javax.swing.JLabel();
        getStudentIDPanel = new javax.swing.JPanel();
        manageStudentHeader1 = new javax.swing.JPanel();
        manageStudent_Label1 = new javax.swing.JLabel();
        studentID_Label = new javax.swing.JLabel();
        studentID = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        studentID_Label1 = new javax.swing.JLabel();
        selectPanel = new javax.swing.JPanel();
        manageStudentHeader2 = new javax.swing.JPanel();
        manageStudent_Label2 = new javax.swing.JLabel();
        personalDetailsImg = new javax.swing.JLabel();
        educationalDetailsImg = new javax.swing.JLabel();
        personalDetailsButton = new javax.swing.JButton();
        educationalDetailsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        undergraduatePostgraduatePanel.setBackground(new java.awt.Color(36, 47, 65));
        undergraduatePostgraduatePanel.setLayout(null);

        manageStudentHeader.setBackground(new java.awt.Color(97, 212, 195));
        manageStudentHeader.setLayout(null);

        manageStudent_Label.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        manageStudent_Label.setForeground(new java.awt.Color(36, 47, 65));
        manageStudent_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageStudent_Label.setText("MANAGE STUDENT");
        manageStudentHeader.add(manageStudent_Label);
        manageStudent_Label.setBounds(0, 13, 900, 64);

        home_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_black.png"))); // NOI18N
        manageStudentHeader.add(home_Label);
        home_Label.setBounds(0, 0, 90, 90);

        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        manageStudentHeader.add(homeButton);
        homeButton.setBounds(0, 0, 90, 90);

        undergraduatePostgraduatePanel.add(manageStudentHeader);
        manageStudentHeader.setBounds(0, 0, 930, 90);

        undergraduateImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        undergraduateImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undergraduate.png"))); // NOI18N
        undergraduatePostgraduatePanel.add(undergraduateImg);
        undergraduateImg.setBounds(200, 200, 150, 150);

        undergraduateButton.setBackground(new java.awt.Color(255, 255, 255));
        undergraduateButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        undergraduateButton.setForeground(new java.awt.Color(36, 47, 65));
        undergraduateButton.setText("Undergraduate");
        undergraduateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undergraduateButtonActionPerformed(evt);
            }
        });
        undergraduatePostgraduatePanel.add(undergraduateButton);
        undergraduateButton.setBounds(200, 360, 150, 30);

        postgraduateButton.setBackground(new java.awt.Color(255, 255, 255));
        postgraduateButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        postgraduateButton.setForeground(new java.awt.Color(36, 47, 65));
        postgraduateButton.setText("Postgraduate");
        postgraduateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgraduateButtonActionPerformed(evt);
            }
        });
        undergraduatePostgraduatePanel.add(postgraduateButton);
        postgraduateButton.setBounds(550, 360, 150, 30);

        postgraduateImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postgraduateImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/postgraduate.png"))); // NOI18N
        undergraduatePostgraduatePanel.add(postgraduateImg);
        postgraduateImg.setBounds(550, 200, 150, 150);

        getContentPane().add(undergraduatePostgraduatePanel);
        undergraduatePostgraduatePanel.setBounds(0, 0, 930, 520);

        getStudentIDPanel.setBackground(new java.awt.Color(97, 212, 195));
        getStudentIDPanel.setLayout(null);

        manageStudentHeader1.setBackground(new java.awt.Color(36, 47, 65));
        manageStudentHeader1.setLayout(null);

        manageStudent_Label1.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        manageStudent_Label1.setForeground(new java.awt.Color(255, 255, 255));
        manageStudent_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageStudent_Label1.setText("MANAGE STUDENT");
        manageStudentHeader1.add(manageStudent_Label1);
        manageStudent_Label1.setBounds(0, 13, 900, 64);

        getStudentIDPanel.add(manageStudentHeader1);
        manageStudentHeader1.setBounds(0, 0, 930, 90);

        studentID_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        studentID_Label.setText("Student ID");
        getStudentIDPanel.add(studentID_Label);
        studentID_Label.setBounds(280, 190, 180, 30);

        studentID.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        studentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIDActionPerformed(evt);
            }
        });
        getStudentIDPanel.add(studentID);
        studentID.setBounds(500, 190, 150, 30);

        confirmButton.setBackground(new java.awt.Color(36, 47, 65));
        confirmButton.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton.setText("Confirm");
        confirmButton.setBorder(null);
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        confirmButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmButtonKeyPressed(evt);
            }
        });
        getStudentIDPanel.add(confirmButton);
        confirmButton.setBounds(490, 300, 150, 50);

        backButton.setBackground(new java.awt.Color(36, 47, 65));
        backButton.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getStudentIDPanel.add(backButton);
        backButton.setBounds(300, 300, 150, 50);

        studentID_Label1.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        studentID_Label1.setText("Student ID");
        getStudentIDPanel.add(studentID_Label1);
        studentID_Label1.setBounds(280, 190, 180, 30);

        getContentPane().add(getStudentIDPanel);
        getStudentIDPanel.setBounds(0, 0, 940, 520);

        selectPanel.setBackground(new java.awt.Color(36, 47, 65));
        selectPanel.setLayout(null);

        manageStudentHeader2.setBackground(new java.awt.Color(97, 212, 195));
        manageStudentHeader2.setLayout(null);

        manageStudent_Label2.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        manageStudent_Label2.setForeground(new java.awt.Color(36, 47, 65));
        manageStudent_Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageStudent_Label2.setText("MANAGE STUDENT");
        manageStudentHeader2.add(manageStudent_Label2);
        manageStudent_Label2.setBounds(0, 13, 900, 64);

        selectPanel.add(manageStudentHeader2);
        manageStudentHeader2.setBounds(0, 0, 930, 90);

        personalDetailsImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personalDetailsImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editPersonal.png"))); // NOI18N
        selectPanel.add(personalDetailsImg);
        personalDetailsImg.setBounds(200, 200, 150, 150);

        educationalDetailsImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        educationalDetailsImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editEducational.png"))); // NOI18N
        selectPanel.add(educationalDetailsImg);
        educationalDetailsImg.setBounds(550, 200, 150, 150);

        personalDetailsButton.setBackground(new java.awt.Color(255, 255, 255));
        personalDetailsButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        personalDetailsButton.setForeground(new java.awt.Color(36, 47, 65));
        personalDetailsButton.setText("Personal Details");
        personalDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalDetailsButtonActionPerformed(evt);
            }
        });
        selectPanel.add(personalDetailsButton);
        personalDetailsButton.setBounds(200, 360, 164, 30);

        educationalDetailsButton.setBackground(new java.awt.Color(255, 255, 255));
        educationalDetailsButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        educationalDetailsButton.setForeground(new java.awt.Color(36, 47, 65));
        educationalDetailsButton.setText("Educational Details");
        educationalDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                educationalDetailsButtonActionPerformed(evt);
            }
        });
        selectPanel.add(educationalDetailsButton);
        educationalDetailsButton.setBounds(530, 360, 190, 30);

        getContentPane().add(selectPanel);
        selectPanel.setBounds(0, 0, 930, 520);

        setSize(new java.awt.Dimension(918, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        String student_id = studentID.getText();
        try {
            ResultSet rs = undergraduateController.checkStudentID(student_id);
            if (rs.next()) {
                getStudentIDPanel.setVisible(false);
                selectPanel.setVisible(true);
                editingStudentID = student_id;
            }else{
                JOptionPane.showMessageDialog(this, "Student Not Found");
                studentID.setText(null);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void confirmButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButtonKeyPressed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new homepage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void studentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIDActionPerformed

    private void undergraduateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undergraduateButtonActionPerformed
        isUndergraduate = true;
        undergraduatePostgraduatePanel.setVisible(false);
        getStudentIDPanel.setVisible(true);
    }//GEN-LAST:event_undergraduateButtonActionPerformed

    private void personalDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalDetailsButtonActionPerformed
        new edit_student_personal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_personalDetailsButtonActionPerformed

    private void educationalDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_educationalDetailsButtonActionPerformed
        if (isUndergraduate) {
            new edit_undergraduate_education().setVisible(true);
            this.dispose();
        }
        else {
            new edit_postgraduate_education().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_educationalDetailsButtonActionPerformed

    private void postgraduateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgraduateButtonActionPerformed
        isUndergraduate = false;
        undergraduatePostgraduatePanel.setVisible(false);
        getStudentIDPanel.setVisible(true);
    }//GEN-LAST:event_postgraduateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(manage_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manage_student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton educationalDetailsButton;
    private javax.swing.JLabel educationalDetailsImg;
    private javax.swing.JPanel getStudentIDPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel home_Label;
    private javax.swing.JPanel manageStudentHeader;
    private javax.swing.JPanel manageStudentHeader1;
    private javax.swing.JPanel manageStudentHeader2;
    private javax.swing.JLabel manageStudent_Label;
    private javax.swing.JLabel manageStudent_Label1;
    private javax.swing.JLabel manageStudent_Label2;
    private javax.swing.JButton personalDetailsButton;
    private javax.swing.JLabel personalDetailsImg;
    private javax.swing.JButton postgraduateButton;
    private javax.swing.JLabel postgraduateImg;
    private javax.swing.JPanel selectPanel;
    private javax.swing.JTextField studentID;
    private javax.swing.JLabel studentID_Label;
    private javax.swing.JLabel studentID_Label1;
    private javax.swing.JButton undergraduateButton;
    private javax.swing.JLabel undergraduateImg;
    private javax.swing.JPanel undergraduatePostgraduatePanel;
    // End of variables declaration//GEN-END:variables
}
