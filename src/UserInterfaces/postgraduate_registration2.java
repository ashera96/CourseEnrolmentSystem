/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterfaces;

import Controller.courseController;
import Controller.postgraduateController;
import Model.postgraduate;
import static UserInterfaces.postgraduate_registration.facID;
import static UserInterfaces.subject_selection.student_id;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashera
 */
public class postgraduate_registration2 extends javax.swing.JFrame {

    /** Creates new form postgraduate_registration2 */
    public postgraduate_registration2() {
        initComponents();
        try {
            ArrayList<String> courseList = courseController.addPostgraduateCourses(facID);
            for (int i=0 ; i<courseList.size() ; i++){
                courseCombo.addItem(courseList.get(i));
            }
        }catch (SQLException e ){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        signupHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        course_label = new javax.swing.JLabel();
        topic = new javax.swing.JLabel();
        qualificationType_label = new javax.swing.JLabel();
        qualificationType = new javax.swing.JTextField();
        institute_label = new javax.swing.JLabel();
        institute = new javax.swing.JTextField();
        year_label = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        nextPageButton1 = new javax.swing.JButton();
        courseCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(null);

        signupHeader.setBackground(new java.awt.Color(36, 47, 65));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POSTGRADUATE REGISTRATION");

        javax.swing.GroupLayout signupHeaderLayout = new javax.swing.GroupLayout(signupHeader);
        signupHeader.setLayout(signupHeaderLayout);
        signupHeaderLayout.setHorizontalGroup(
            signupHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupHeaderLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                .addContainerGap())
        );
        signupHeaderLayout.setVerticalGroup(
            signupHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(signupHeader);
        signupHeader.setBounds(0, 0, 910, 90);

        course_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        course_label.setText("Course");
        jPanel1.add(course_label);
        course_label.setBounds(180, 130, 160, 30);

        topic.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        topic.setForeground(new java.awt.Color(36, 47, 65));
        topic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topic.setText("Education Details");
        jPanel1.add(topic);
        topic.setBounds(0, 180, 900, 40);

        qualificationType_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        qualificationType_label.setText("Qualification Type");
        jPanel1.add(qualificationType_label);
        qualificationType_label.setBounds(180, 250, 260, 30);

        qualificationType.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        qualificationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualificationTypeActionPerformed(evt);
            }
        });
        jPanel1.add(qualificationType);
        qualificationType.setBounds(420, 250, 300, 30);

        institute_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        institute_label.setText("Institute");
        jPanel1.add(institute_label);
        institute_label.setBounds(180, 290, 260, 30);

        institute.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        institute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instituteActionPerformed(evt);
            }
        });
        jPanel1.add(institute);
        institute.setBounds(420, 290, 300, 30);

        year_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        year_label.setText("Year of Completion");
        jPanel1.add(year_label);
        year_label.setBounds(180, 330, 260, 30);

        year.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        jPanel1.add(year);
        year.setBounds(420, 330, 300, 30);

        nextPageButton1.setBackground(new java.awt.Color(36, 47, 65));
        nextPageButton1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        nextPageButton1.setForeground(new java.awt.Color(255, 255, 255));
        nextPageButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/right-arrow.png"))); // NOI18N
        nextPageButton1.setText("Next");
        nextPageButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(nextPageButton1);
        nextPageButton1.setBounds(750, 420, 120, 50);

        courseCombo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPanel1.add(courseCombo);
        courseCombo.setBounds(420, 130, 300, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 910, 510);

        setSize(new java.awt.Dimension(918, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void instituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instituteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instituteActionPerformed

    private void qualificationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualificationTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qualificationTypeActionPerformed

    private void nextPageButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageButton1ActionPerformed
        String course = (String) courseCombo.getSelectedItem();
        String qualification_type = qualificationType.getText();
        String Institute = institute.getText();
        int year_of_completion = Integer.parseInt(year.getText());
        
        String course_id="";
        try {
            course_id = courseController.findCourseID(course);
        } catch (SQLException ex) {
            Logger.getLogger(undergraduate_registration2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        postgraduate postgrad = new postgraduate(student_id,qualification_type, Institute, year_of_completion,course_id);
        try {
            int result = postgraduateController.addPostgraduate(postgrad);
            if (result>0) {
                new subject_selection().setVisible(true);
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(this,"Invalid");
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

    }//GEN-LAST:event_nextPageButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(postgraduate_registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(postgraduate_registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(postgraduate_registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(postgraduate_registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new postgraduate_registration2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> courseCombo;
    private javax.swing.JLabel course_label;
    private javax.swing.JTextField institute;
    private javax.swing.JLabel institute_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextPageButton1;
    private javax.swing.JTextField qualificationType;
    private javax.swing.JLabel qualificationType_label;
    private javax.swing.JPanel signupHeader;
    private javax.swing.JLabel topic;
    private javax.swing.JTextField year;
    private javax.swing.JLabel year_label;
    // End of variables declaration//GEN-END:variables

}