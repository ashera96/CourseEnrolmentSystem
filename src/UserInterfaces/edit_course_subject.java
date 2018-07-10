/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces;

import Controller.subjectController;
import Model.subject;
import com.sun.glass.events.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashera
 */
public class edit_course_subject extends javax.swing.JFrame {

    /**
     * Creates new form manage_subject
     */
    public edit_course_subject() {
        initComponents();
        editSubjectPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isCompulsory = new javax.swing.ButtonGroup();
        getSubjectCodePanel = new javax.swing.JPanel();
        editSubjectHeader1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        subjectcode_Label = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        backButton2 = new javax.swing.JButton();
        subjectcode = new javax.swing.JTextField();
        editSubjectPanel = new javax.swing.JPanel();
        editSubjectHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        subjectCode_Label = new javax.swing.JLabel();
        name_Label = new javax.swing.JLabel();
        courseID_Label = new javax.swing.JLabel();
        semesterID_Label = new javax.swing.JLabel();
        lecturerID_Label = new javax.swing.JLabel();
        isCompulsory_label = new javax.swing.JLabel();
        subjectCode = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        semesterID = new javax.swing.JTextField();
        lecturerID = new javax.swing.JTextField();
        no = new javax.swing.JRadioButton();
        yes = new javax.swing.JRadioButton();
        courseID = new javax.swing.JTextField();
        credits = new javax.swing.JTextField();
        address_Label = new javax.swing.JLabel();
        fee_Label = new javax.swing.JLabel();
        fee = new javax.swing.JTextField();
        day_Label = new javax.swing.JLabel();
        timeSlot_Label = new javax.swing.JLabel();
        lectureHall_Label = new javax.swing.JLabel();
        timeSlot = new javax.swing.JTextField();
        lectureHall = new javax.swing.JTextField();
        dayCombo = new javax.swing.JComboBox<>();
        backButton1 = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        getSubjectCodePanel.setBackground(new java.awt.Color(97, 212, 195));
        getSubjectCodePanel.setLayout(null);

        editSubjectHeader1.setBackground(new java.awt.Color(36, 47, 65));
        editSubjectHeader1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EDIT SUBJECT");
        editSubjectHeader1.add(jLabel2);
        jLabel2.setBounds(0, 13, 900, 64);

        getSubjectCodePanel.add(editSubjectHeader1);
        editSubjectHeader1.setBounds(0, 0, 930, 90);

        subjectcode_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        subjectcode_Label.setText("Subject Code");
        getSubjectCodePanel.add(subjectcode_Label);
        subjectcode_Label.setBounds(280, 190, 180, 30);

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
        getSubjectCodePanel.add(confirmButton);
        confirmButton.setBounds(490, 300, 150, 50);

        backButton2.setBackground(new java.awt.Color(36, 47, 65));
        backButton2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        backButton2.setForeground(new java.awt.Color(255, 255, 255));
        backButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow.png"))); // NOI18N
        backButton2.setText("Back");
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });
        getSubjectCodePanel.add(backButton2);
        backButton2.setBounds(300, 300, 150, 50);

        subjectcode.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        subjectcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectcodeActionPerformed(evt);
            }
        });
        getSubjectCodePanel.add(subjectcode);
        subjectcode.setBounds(500, 190, 150, 30);

        getContentPane().add(getSubjectCodePanel);
        getSubjectCodePanel.setBounds(0, 0, 940, 520);

        editSubjectPanel.setBackground(new java.awt.Color(97, 212, 195));
        editSubjectPanel.setLayout(null);

        editSubjectHeader.setBackground(new java.awt.Color(36, 47, 65));
        editSubjectHeader.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIT SUBJECT");
        editSubjectHeader.add(jLabel1);
        jLabel1.setBounds(0, 13, 900, 64);

        editSubjectPanel.add(editSubjectHeader);
        editSubjectHeader.setBounds(0, 0, 930, 90);

        subjectCode_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        subjectCode_Label.setText("Subject Code");
        editSubjectPanel.add(subjectCode_Label);
        subjectCode_Label.setBounds(30, 150, 160, 30);

        name_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        name_Label.setText("Name");
        editSubjectPanel.add(name_Label);
        name_Label.setBounds(30, 190, 160, 30);

        courseID_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        courseID_Label.setText("Course ID");
        editSubjectPanel.add(courseID_Label);
        courseID_Label.setBounds(30, 310, 160, 30);

        semesterID_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        semesterID_Label.setText("Semester ID");
        editSubjectPanel.add(semesterID_Label);
        semesterID_Label.setBounds(450, 150, 180, 30);

        lecturerID_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        lecturerID_Label.setText("Lecturer ID");
        editSubjectPanel.add(lecturerID_Label);
        lecturerID_Label.setBounds(450, 190, 160, 30);

        isCompulsory_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        isCompulsory_label.setText("Is Compulsory");
        editSubjectPanel.add(isCompulsory_label);
        isCompulsory_label.setBounds(260, 370, 210, 30);

        subjectCode.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        subjectCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectCodeActionPerformed(evt);
            }
        });
        subjectCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                subjectCodeKeyPressed(evt);
            }
        });
        editSubjectPanel.add(subjectCode);
        subjectCode.setBounds(190, 152, 230, 30);

        name.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        editSubjectPanel.add(name);
        name.setBounds(190, 191, 230, 30);

        semesterID.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        semesterID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterIDActionPerformed(evt);
            }
        });
        editSubjectPanel.add(semesterID);
        semesterID.setBounds(640, 150, 230, 30);

        lecturerID.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lecturerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturerIDActionPerformed(evt);
            }
        });
        editSubjectPanel.add(lecturerID);
        lecturerID.setBounds(640, 190, 230, 30);

        isCompulsory.add(no);
        no.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        no.setText("No");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        editSubjectPanel.add(no);
        no.setBounds(560, 370, 110, 31);

        isCompulsory.add(yes);
        yes.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        yes.setText("Yes");
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });
        editSubjectPanel.add(yes);
        yes.setBounds(440, 370, 110, 31);

        courseID.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        courseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseIDActionPerformed(evt);
            }
        });
        editSubjectPanel.add(courseID);
        courseID.setBounds(190, 308, 230, 30);

        credits.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsActionPerformed(evt);
            }
        });
        editSubjectPanel.add(credits);
        credits.setBounds(190, 269, 230, 30);

        address_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        address_Label.setText("Credits");
        editSubjectPanel.add(address_Label);
        address_Label.setBounds(30, 270, 160, 30);

        fee_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        fee_Label.setText("Fee");
        editSubjectPanel.add(fee_Label);
        fee_Label.setBounds(30, 230, 160, 30);

        fee.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        fee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeActionPerformed(evt);
            }
        });
        editSubjectPanel.add(fee);
        fee.setBounds(190, 230, 230, 30);

        day_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        day_Label.setText("Day of week");
        editSubjectPanel.add(day_Label);
        day_Label.setBounds(450, 230, 160, 30);

        timeSlot_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        timeSlot_Label.setText("Time Slot");
        editSubjectPanel.add(timeSlot_Label);
        timeSlot_Label.setBounds(450, 270, 160, 30);

        lectureHall_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        lectureHall_Label.setText("Lecture Hall");
        editSubjectPanel.add(lectureHall_Label);
        lectureHall_Label.setBounds(450, 310, 160, 30);

        timeSlot.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        timeSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeSlotActionPerformed(evt);
            }
        });
        editSubjectPanel.add(timeSlot);
        timeSlot.setBounds(640, 269, 230, 30);

        lectureHall.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lectureHall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectureHallActionPerformed(evt);
            }
        });
        editSubjectPanel.add(lectureHall);
        lectureHall.setBounds(640, 308, 230, 30);

        dayCombo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        dayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        editSubjectPanel.add(dayCombo);
        dayCombo.setBounds(640, 230, 230, 30);

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
        editSubjectPanel.add(backButton1);
        backButton1.setBounds(220, 430, 150, 50);

        updateButton.setBackground(new java.awt.Color(36, 47, 65));
        updateButton.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        editSubjectPanel.add(updateButton);
        updateButton.setBounds(390, 430, 150, 50);

        deleteButton.setBackground(new java.awt.Color(36, 47, 65));
        deleteButton.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        editSubjectPanel.add(deleteButton);
        deleteButton.setBounds(560, 430, 150, 50);

        getContentPane().add(editSubjectPanel);
        editSubjectPanel.setBounds(0, 0, 920, 520);

        setSize(new java.awt.Dimension(918, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subjectCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectCodeActionPerformed
  
    }//GEN-LAST:event_subjectCodeActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void semesterIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterIDActionPerformed

    private void lecturerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecturerIDActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        no.setActionCommand("No");
    }//GEN-LAST:event_noActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
        yes.setActionCommand("Yes");
    }//GEN-LAST:event_yesActionPerformed

    private void courseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseIDActionPerformed

    private void creditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditsActionPerformed

    private void feeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feeActionPerformed

    private void timeSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeSlotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeSlotActionPerformed

    private void lectureHallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectureHallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lectureHallActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        new manage_subject().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String Subject_code = subjectCode.getText();
        String Subject_name = name.getText();
        double Fee = Double.parseDouble(fee.getText());
        int Credits = Integer.parseInt(credits.getText());
        String Course_id = courseID.getText();
        int Semester_id = Integer.parseInt(semesterID.getText());
        String Lecturer_id = lecturerID.getText();
        String DayOfWeek = (String) dayCombo.getSelectedItem();
        String Time_slot = timeSlot.getText();
        String Lecture_hall = lectureHall.getText();
        String temp = isCompulsory.getSelection().getActionCommand();
        
        boolean Is_compulsory;
        if (temp=="Yes")
            Is_compulsory = true;
        else
            Is_compulsory = false;

        subject subj = new subject(Subject_code,Subject_name,Fee,Credits,Course_id,Semester_id,Lecturer_id,DayOfWeek,Time_slot,Lecture_hall,Is_compulsory);
        try{
            int result = subjectController.updateSubject(subj);
            if ( result>0 ) {
                JOptionPane.showMessageDialog(this, "Successfully Updated");
                new homepage().setVisible(true);
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(this,"Update Failed");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String subject_code = subjectCode.getText();

        try{
            int result = subjectController.deleteSubject(subject_code);
            if ( result>0 ) {
                JOptionPane.showMessageDialog(this, "Successfully Deleted");
                new homepage().setVisible(true);
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(this,"Delete Failed");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void subjectCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjectCodeKeyPressed

    }//GEN-LAST:event_subjectCodeKeyPressed

    private void subjectcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectcodeActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
    String subject_code = subjectcode.getText();
    subjectCode.setEditable(false);
    try {
        subject subj = subjectController.searchSubject(subject_code);
        if (subj!=null) {
            getSubjectCodePanel.setVisible(false);
            editSubjectPanel.setVisible(true);
            subjectCode.setText(subj.getSubject_code());
            name.setText(subj.getSubject_name());
            fee.setText(Double.toString(subj.getFee()));
            credits.setText(Integer.toString(subj.getCredits()));
            courseID.setText(subj.getCourse_id());
            semesterID.setText(Integer.toString(subj.getSemester_id()));
            lecturerID.setText(subj.getLecturer_id());
            dayCombo.setSelectedItem(subj.getDay_of_week());
            timeSlot.setText(subj.getTime_slot());
            lectureHall.setText(subj.getLecture_hall());
            boolean is_compulsory = subj.isIs_compulsory();
            if (is_compulsory){
                yes.setSelected(true);
                yes.setActionCommand("Yes");
            }
            else{
                no.setSelected(true);
                no.setActionCommand("No");
            }
        }else {
            JOptionPane.showMessageDialog(this, "Subject Not Found");
            subjectcode.setText(null);
        }
    }catch (SQLException ex) {    
        Logger.getLogger(edit_course_subject.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void confirmButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButtonKeyPressed

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed
        new manage_subject().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(edit_course_subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_course_subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_course_subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_course_subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_course_subject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_Label;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton backButton2;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField courseID;
    private javax.swing.JLabel courseID_Label;
    private javax.swing.JTextField credits;
    private javax.swing.JComboBox<String> dayCombo;
    private javax.swing.JLabel day_Label;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel editSubjectHeader;
    private javax.swing.JPanel editSubjectHeader1;
    private javax.swing.JPanel editSubjectPanel;
    private javax.swing.JTextField fee;
    private javax.swing.JLabel fee_Label;
    private javax.swing.JPanel getSubjectCodePanel;
    private javax.swing.ButtonGroup isCompulsory;
    private javax.swing.JLabel isCompulsory_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField lectureHall;
    private javax.swing.JLabel lectureHall_Label;
    private javax.swing.JTextField lecturerID;
    private javax.swing.JLabel lecturerID_Label;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name_Label;
    private javax.swing.JRadioButton no;
    private javax.swing.JTextField semesterID;
    private javax.swing.JLabel semesterID_Label;
    private javax.swing.JTextField subjectCode;
    private javax.swing.JLabel subjectCode_Label;
    private javax.swing.JTextField subjectcode;
    private javax.swing.JLabel subjectcode_Label;
    private javax.swing.JTextField timeSlot;
    private javax.swing.JLabel timeSlot_Label;
    private javax.swing.JButton updateButton;
    private javax.swing.JRadioButton yes;
    // End of variables declaration//GEN-END:variables
}