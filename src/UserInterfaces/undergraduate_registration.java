/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces;

import Controller.undergraduateController;
import Model.student;
import static UserInterfaces.login.admin_username;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashera
 */
public class undergraduate_registration extends javax.swing.JFrame {

    /**
     * Creates new form undergraduate_registration
     */
    public undergraduate_registration() {
        initComponents();        
        //Finding the faculty of the admin logged into the system
        if (null != admin_username) switch (admin_username) {
            case "Business_001":
                faculty.setText("School of Business");
                break;
            case "Computing_001":
                faculty.setText("School of Computing");
                break;
            case "Engineering_001":
                faculty.setText("School of Engineering");
                break;
            default:
                faculty.setText("Invalid");
                break;
        }
        faculty.setEditable(false);
    }
    
    public static String facID;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        intake = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        signupHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        topic = new javax.swing.JLabel();
        studentID_Label = new javax.swing.JLabel();
        name_Label = new javax.swing.JLabel();
        faculty_Label = new javax.swing.JLabel();
        contactNo_Label = new javax.swing.JLabel();
        email_Label = new javax.swing.JLabel();
        intakeMonth_label = new javax.swing.JLabel();
        studentID = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        contactNumber = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        nextPageButton = new javax.swing.JButton();
        julyIntake = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        februaryIntake = new javax.swing.JRadioButton();
        faculty = new javax.swing.JTextField();
        gender_Label = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        address_Label = new javax.swing.JLabel();
        NIC_Label = new javax.swing.JLabel();
        NIC = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(97, 212, 195));
        jPanel3.setLayout(null);

        signupHeader.setBackground(new java.awt.Color(36, 47, 65));
        signupHeader.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UNDERGRADUATE REGISTRATION");
        signupHeader.add(jLabel1);
        jLabel1.setBounds(0, 13, 900, 64);

        jPanel3.add(signupHeader);
        signupHeader.setBounds(0, 0, 930, 90);

        topic.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        topic.setForeground(new java.awt.Color(36, 47, 65));
        topic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topic.setText("Personal Details");
        jPanel3.add(topic);
        topic.setBounds(0, 90, 900, 40);

        studentID_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        studentID_Label.setText("Index Number");
        jPanel3.add(studentID_Label);
        studentID_Label.setBounds(30, 150, 160, 30);

        name_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        name_Label.setText("Name");
        jPanel3.add(name_Label);
        name_Label.setBounds(30, 190, 160, 30);

        faculty_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        faculty_Label.setText("Faculty");
        jPanel3.add(faculty_Label);
        faculty_Label.setBounds(30, 350, 160, 30);

        contactNo_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        contactNo_Label.setText("Contact Number");
        jPanel3.add(contactNo_Label);
        contactNo_Label.setBounds(450, 150, 180, 30);

        email_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        email_Label.setText("Email");
        jPanel3.add(email_Label);
        email_Label.setBounds(450, 190, 160, 30);

        intakeMonth_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        intakeMonth_label.setText("Intake Month");
        jPanel3.add(intakeMonth_label);
        intakeMonth_label.setBounds(30, 390, 210, 30);

        studentID.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        studentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIDActionPerformed(evt);
            }
        });
        jPanel3.add(studentID);
        studentID.setBounds(190, 152, 230, 30);

        name.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel3.add(name);
        name.setBounds(190, 191, 230, 30);

        contactNumber.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        contactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberActionPerformed(evt);
            }
        });
        jPanel3.add(contactNumber);
        contactNumber.setBounds(640, 150, 230, 30);

        email.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel3.add(email);
        email.setBounds(640, 190, 230, 30);

        nextPageButton.setBackground(new java.awt.Color(36, 47, 65));
        nextPageButton.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        nextPageButton.setForeground(new java.awt.Color(255, 255, 255));
        nextPageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/right-arrow.png"))); // NOI18N
        nextPageButton.setText("Next");
        nextPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageButtonActionPerformed(evt);
            }
        });
        jPanel3.add(nextPageButton);
        nextPageButton.setBounds(750, 420, 120, 50);

        intake.add(julyIntake);
        julyIntake.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        julyIntake.setText("July");
        julyIntake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                julyIntakeActionPerformed(evt);
            }
        });
        jPanel3.add(julyIntake);
        julyIntake.setBounds(310, 389, 110, 31);

        gender.add(male);
        male.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel3.add(male);
        male.setBounds(640, 230, 110, 31);

        gender.add(female);
        female.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel3.add(female);
        female.setBounds(760, 230, 110, 31);

        intake.add(februaryIntake);
        februaryIntake.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        februaryIntake.setText("February");
        februaryIntake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                februaryIntakeActionPerformed(evt);
            }
        });
        jPanel3.add(februaryIntake);
        februaryIntake.setBounds(190, 389, 110, 31);

        faculty.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyActionPerformed(evt);
            }
        });
        jPanel3.add(faculty);
        faculty.setBounds(190, 348, 230, 30);

        gender_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        gender_Label.setText("Gender");
        jPanel3.add(gender_Label);
        gender_Label.setBounds(450, 230, 160, 30);

        address.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel3.add(address);
        address.setBounds(190, 269, 230, 30);

        address_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        address_Label.setText("Address");
        jPanel3.add(address_Label);
        address_Label.setBounds(30, 270, 160, 30);

        NIC_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        NIC_Label.setText("NIC");
        jPanel3.add(NIC_Label);
        NIC_Label.setBounds(30, 230, 160, 30);

        NIC.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        NIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NICActionPerformed(evt);
            }
        });
        jPanel3.add(NIC);
        NIC.setBounds(190, 230, 230, 30);

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

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 920, 520);

        setSize(new java.awt.Dimension(918, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageButtonActionPerformed
        String ID = studentID.getText();
        String Name = name.getText();
        String Address = address.getText();
        String nic = NIC.getText();
        String num = contactNumber.getText();
        String Email = email.getText();
        String Gender = gender.getSelection().getActionCommand();
        String Faculty = faculty.getText();
        String Intake = intake.getSelection().getActionCommand();
        
        String fac;
        if (null == Faculty)
            fac = "";
        else switch (Faculty) {
            case "School of Business":
                fac = "SB";
                break;
            case "School of Computing":
                fac = "SC";
                break;
            case "School of Engineering":
                fac = "SE";
                break;
            default:
                fac = "";
                break;
        }
        
        student stud1 = new student(ID,Name,Address,nic,num,Gender,Email,fac,Intake);
        try{
            int result = undergraduateController.addStudent(stud1);
            if ( result>0 ) {
                facID = fac;
                subject_selection.student_id = ID;
                subject_selection.intake_month = Intake;
                new undergraduate_registration2().setVisible(true);
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(this,"Invalid");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_nextPageButtonActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void contactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void studentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIDActionPerformed

    private void facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        male.setActionCommand("Male");
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        female.setActionCommand("Female");
    }//GEN-LAST:event_femaleActionPerformed

    private void februaryIntakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_februaryIntakeActionPerformed
        februaryIntake.setActionCommand("February");
    }//GEN-LAST:event_februaryIntakeActionPerformed

    private void julyIntakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_julyIntakeActionPerformed
        julyIntake.setActionCommand("July");
    }//GEN-LAST:event_julyIntakeActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void NICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NICActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new student_registration().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(undergraduate_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(undergraduate_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(undergraduate_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(undergraduate_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new undergraduate_registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIC;
    private javax.swing.JLabel NIC_Label;
    private javax.swing.JTextField address;
    private javax.swing.JLabel address_Label;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel contactNo_Label;
    private javax.swing.JTextField contactNumber;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_Label;
    private javax.swing.JTextField faculty;
    private javax.swing.JLabel faculty_Label;
    private javax.swing.JRadioButton februaryIntake;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel gender_Label;
    private javax.swing.ButtonGroup intake;
    private javax.swing.JLabel intakeMonth_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton julyIntake;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name_Label;
    private javax.swing.JButton nextPageButton;
    private javax.swing.JPanel signupHeader;
    private javax.swing.JTextField studentID;
    private javax.swing.JLabel studentID_Label;
    private javax.swing.JLabel topic;
    // End of variables declaration//GEN-END:variables
}
