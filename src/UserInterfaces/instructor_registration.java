/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces;

import Controller.instructorController;
import Model.instructor;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashera
 */
public class instructor_registration extends javax.swing.JFrame {

    /**
     * Creates new form instructor_registration
     */
    public instructor_registration() {
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

        gender = new javax.swing.ButtonGroup();
        signupHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        signupHeader1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        instructorID_Label = new javax.swing.JLabel();
        name_Label = new javax.swing.JLabel();
        nic_Label = new javax.swing.JLabel();
        contactNumber_Label = new javax.swing.JLabel();
        instructorID = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        contactNumber = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        nic = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        email_Label = new javax.swing.JLabel();
        address_Label = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        gender_Label = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        signupHeader.setBackground(new java.awt.Color(36, 47, 65));
        signupHeader.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSTRUCTOR REGISTRATION");
        signupHeader.add(jLabel1);
        jLabel1.setBounds(0, 13, 900, 64);

        getContentPane().add(signupHeader);
        signupHeader.setBounds(0, 0, 930, 90);

        jPanel3.setBackground(new java.awt.Color(97, 212, 195));
        jPanel3.setLayout(null);

        signupHeader1.setBackground(new java.awt.Color(36, 47, 65));
        signupHeader1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INSTRUCTOR REGISTRATION");
        signupHeader1.add(jLabel2);
        jLabel2.setBounds(0, 13, 920, 64);

        jPanel3.add(signupHeader1);
        signupHeader1.setBounds(0, 0, 930, 90);

        instructorID_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        instructorID_Label.setText("Instructor ID");
        jPanel3.add(instructorID_Label);
        instructorID_Label.setBounds(230, 120, 160, 30);

        name_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        name_Label.setText("Name");
        jPanel3.add(name_Label);
        name_Label.setBounds(230, 160, 160, 30);

        nic_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        nic_Label.setText("NIC");
        jPanel3.add(nic_Label);
        nic_Label.setBounds(230, 280, 160, 30);

        contactNumber_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        contactNumber_Label.setText("Contact Number");
        jPanel3.add(contactNumber_Label);
        contactNumber_Label.setBounds(230, 320, 180, 30);

        instructorID.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        instructorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructorIDActionPerformed(evt);
            }
        });
        jPanel3.add(instructorID);
        instructorID.setBounds(420, 120, 280, 30);

        name.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel3.add(name);
        name.setBounds(420, 160, 280, 30);

        contactNumber.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        contactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberActionPerformed(evt);
            }
        });
        jPanel3.add(contactNumber);
        contactNumber.setBounds(420, 320, 280, 30);

        submitButton.setBackground(new java.awt.Color(36, 47, 65));
        submitButton.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel3.add(submitButton);
        submitButton.setBounds(750, 420, 120, 50);

        nic.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicActionPerformed(evt);
            }
        });
        jPanel3.add(nic);
        nic.setBounds(420, 280, 280, 30);

        email.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel3.add(email);
        email.setBounds(420, 240, 280, 30);

        email_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        email_Label.setText("Email");
        jPanel3.add(email_Label);
        email_Label.setBounds(230, 240, 160, 30);

        address_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        address_Label.setText("Address");
        jPanel3.add(address_Label);
        address_Label.setBounds(230, 200, 160, 30);

        address.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel3.add(address);
        address.setBounds(420, 200, 280, 30);

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
        jPanel3.add(backButton);
        backButton.setBounds(580, 420, 120, 50);

        gender_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        gender_Label.setText("Gender");
        jPanel3.add(gender_Label);
        gender_Label.setBounds(230, 360, 160, 30);

        gender.add(male);
        male.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel3.add(male);
        male.setBounds(420, 360, 130, 31);

        gender.add(female);
        female.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel3.add(female);
        female.setBounds(570, 360, 130, 31);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 920, 520);

        setSize(new java.awt.Dimension(918, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void instructorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instructorIDActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void contactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String Instructor_id = instructorID.getText();
        String Name = name.getText();
        String Address = address.getText();
        String Gender = gender.getSelection().getActionCommand();
        String Email = email.getText();
        String NIC = nic.getText();
        String Contact_number = contactNumber.getText();

        instructor Lecturer = new instructor(Instructor_id,Name,Address,Gender,Email,NIC,Contact_number);
        try{
            int result = instructorController.addInstructor(Lecturer);
            if ( result>0 ) {
                JOptionPane.showMessageDialog(this, "Successfully Registered Instructor");
                new homepage().setVisible(true);
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(this,"Invalid");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new staff_registration().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        male.setActionCommand("Male");
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        female.setActionCommand("Female");
    }//GEN-LAST:event_femaleActionPerformed

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
            java.util.logging.Logger.getLogger(instructor_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instructor_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instructor_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instructor_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new instructor_registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel address_Label;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField contactNumber;
    private javax.swing.JLabel contactNumber_Label;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_Label;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel gender_Label;
    private javax.swing.JTextField instructorID;
    private javax.swing.JLabel instructorID_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name_Label;
    private javax.swing.JTextField nic;
    private javax.swing.JLabel nic_Label;
    private javax.swing.JPanel signupHeader;
    private javax.swing.JPanel signupHeader1;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}