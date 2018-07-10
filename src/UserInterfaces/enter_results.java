/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces;

import Controller.assignmentController;
import Controller.undergraduateController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ashera
 */
public class enter_results extends javax.swing.JFrame {

    /**
     * Creates new form enter_results
     */
    public enter_results() {
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

        resultsHeader = new javax.swing.JPanel();
        resultsHeader_Label = new javax.swing.JLabel();
        home_Label = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        paymentDetails = new javax.swing.JPanel();
        subjectCode_Label = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();
        subjectCode = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        examMark_Label = new javax.swing.JLabel();
        examMark = new javax.swing.JTextField();
        studentID_Label = new javax.swing.JLabel();
        studentID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        resultsHeader.setBackground(new java.awt.Color(36, 47, 65));
        resultsHeader.setLayout(null);

        resultsHeader_Label.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        resultsHeader_Label.setForeground(new java.awt.Color(255, 255, 255));
        resultsHeader_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultsHeader_Label.setText("ENTER RESULTS");
        resultsHeader.add(resultsHeader_Label);
        resultsHeader_Label.setBounds(0, 13, 900, 64);

        home_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        resultsHeader.add(home_Label);
        home_Label.setBounds(0, 0, 90, 90);

        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        resultsHeader.add(homeButton);
        homeButton.setBounds(0, 0, 90, 90);

        getContentPane().add(resultsHeader);
        resultsHeader.setBounds(0, 0, 930, 90);

        paymentDetails.setBackground(new java.awt.Color(97, 212, 195));
        paymentDetails.setLayout(null);

        subjectCode_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        subjectCode_Label.setText("Subject Code");
        paymentDetails.add(subjectCode_Label);
        subjectCode_Label.setBounds(100, 110, 210, 30);

        doneButton.setBackground(new java.awt.Color(36, 47, 65));
        doneButton.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        doneButton.setForeground(new java.awt.Color(255, 255, 255));
        doneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/done.png"))); // NOI18N
        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });
        paymentDetails.add(doneButton);
        doneButton.setBounds(570, 430, 120, 50);

        subjectCode.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        subjectCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectCodeActionPerformed(evt);
            }
        });
        paymentDetails.add(subjectCode);
        subjectCode.setBounds(310, 110, 230, 30);

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
        paymentDetails.add(backButton);
        backButton.setBounds(270, 430, 120, 50);

        examMark_Label.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        examMark_Label.setText("Final Exam Paper Mark");
        paymentDetails.add(examMark_Label);
        examMark_Label.setBounds(240, 370, 210, 30);

        examMark.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        examMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examMarkActionPerformed(evt);
            }
        });
        paymentDetails.add(examMark);
        examMark.setBounds(480, 370, 230, 30);

        studentID_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        studentID_Label.setText("Student ID");
        paymentDetails.add(studentID_Label);
        studentID_Label.setBounds(100, 150, 210, 30);

        studentID.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        studentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIDActionPerformed(evt);
            }
        });
        paymentDetails.add(studentID);
        studentID.setBounds(310, 150, 230, 30);

        resultsTable.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Assignment ID", "Assignment Type", "Marks"
            }
        ));
        jScrollPane1.setViewportView(resultsTable);

        paymentDetails.add(jScrollPane1);
        jScrollPane1.setBounds(145, 200, 610, 150);

        searchButton.setBackground(new java.awt.Color(36, 47, 65));
        searchButton.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        paymentDetails.add(searchButton);
        searchButton.setBounds(650, 130, 80, 30);

        resetButton.setBackground(new java.awt.Color(36, 47, 65));
        resetButton.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        paymentDetails.add(resetButton);
        resetButton.setBounds(420, 430, 120, 50);

        getContentPane().add(paymentDetails);
        paymentDetails.setBounds(0, 0, 920, 520);

        setSize(new java.awt.Dimension(918, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        new homepage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) resultsTable.getModel();
        String student_id = studentID.getText();
        for (int i=0;i<resultsTable.getRowCount();i++){
            int assignment_id =Integer.parseInt(model.getValueAt(i, 0).toString());
            int mark = Integer.parseInt(model.getValueAt(i, 2).toString());
            try{
                int result = assignmentController.addStudentAssignmentResults(student_id, assignment_id, mark);
                if ( result<=0 )
                    JOptionPane.showMessageDialog(this,"Error");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
        model.setRowCount(0);
        //Adding the exam marks
        String subject_code = subjectCode.getText();
        int exam_mark = Integer.parseInt(examMark.getText());
        try {
            int temp = assignmentController.addStudentSubjectExamMarks(student_id, subject_code, exam_mark);
            if (temp<=0)
                JOptionPane.showMessageDialog(this, "Error");
        } catch (SQLException ex) {
            Logger.getLogger(enter_results.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(this, "Successfully Updated Results");
        new homepage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    private void subjectCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectCodeActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new manage_results().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void studentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIDActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) resultsTable.getModel();
        String subject_code = subjectCode.getText();
        String student_id = studentID.getText();

        try{
            ResultSet studentCheck = undergraduateController.checkStudentID(student_id);
            if (studentCheck.next()){
                ResultSet rs = assignmentController.checkStudentSubject(student_id, subject_code);
                if(rs.next()){
                    ArrayList<Integer> assignmentList = assignmentController.getAssignmentList(subject_code);
                    if (assignmentList.size()<=0){
                        JOptionPane.showMessageDialog(this, "No Assignments Found");
                        subjectCode.setText(null);
                        studentID.setText(null);
                    }else{
                        subjectCode.setEditable(false);
                        studentID.setEditable(false);
                        searchButton.setEnabled(false);
                        for (int id : assignmentList) {
                            model.addRow(new Object[]{id,assignmentController.getAssignmentType(id),"0"});
                        }
                    }                    
                }else{
                    JOptionPane.showMessageDialog(this, "Not Enrolled for Subject");
                    subjectCode.setText(null);
                    studentID.setText(null);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Student Not Found");
                subjectCode.setText(null);
                studentID.setText(null);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void examMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examMarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_examMarkActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) resultsTable.getModel();
        model.setRowCount(0);
        searchButton.setEnabled(true);
        subjectCode.setEditable(true);
        studentID.setEditable(true);
        subjectCode.setText(null);
        studentID.setText(null);
        examMark.setText(null);
    }//GEN-LAST:event_resetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(enter_results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enter_results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enter_results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enter_results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enter_results().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JTextField examMark;
    private javax.swing.JLabel examMark_Label;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel home_Label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paymentDetails;
    private javax.swing.JButton resetButton;
    private javax.swing.JPanel resultsHeader;
    private javax.swing.JLabel resultsHeader_Label;
    private javax.swing.JTable resultsTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField studentID;
    private javax.swing.JLabel studentID_Label;
    private javax.swing.JTextField subjectCode;
    private javax.swing.JLabel subjectCode_Label;
    // End of variables declaration//GEN-END:variables
}
