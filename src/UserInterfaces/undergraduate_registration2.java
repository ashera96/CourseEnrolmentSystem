/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces;

import Controller.courseController;
import Controller.undergraduateController;
import Model.undergraduate;
import static UserInterfaces.undergraduate_registration.facID;
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
public class undergraduate_registration2 extends javax.swing.JFrame {

    /**
     * Creates new form undergraduate_registration2
     */
    public undergraduate_registration2() {
        initComponents();
        
        try {
            ArrayList<String> courseList = courseController.addUndergraduateCourses(facID);
            for (int i=0 ; i<courseList.size() ; i++){
                courseCombo.addItem(courseList.get(i));
            }
        }catch (SQLException e ){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
   
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
        signupHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        topic = new javax.swing.JLabel();
        subject1_label = new javax.swing.JLabel();
        subject1 = new javax.swing.JTextField();
        subject2_label = new javax.swing.JLabel();
        subject2 = new javax.swing.JTextField();
        subject3_label = new javax.swing.JLabel();
        subject3 = new javax.swing.JTextField();
        result1_label = new javax.swing.JLabel();
        result2_label = new javax.swing.JLabel();
        result3_label = new javax.swing.JLabel();
        zScore_label = new javax.swing.JLabel();
        zScore = new javax.swing.JTextField();
        islandRank_label = new javax.swing.JLabel();
        islandRank = new javax.swing.JTextField();
        nextPageButton1 = new javax.swing.JButton();
        courseCombo = new javax.swing.JComboBox<>();
        course_label = new javax.swing.JLabel();
        indexNumber_label = new javax.swing.JLabel();
        indexNumber = new javax.swing.JTextField();
        result1 = new javax.swing.JComboBox<>();
        result2 = new javax.swing.JComboBox<>();
        result3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(null);

        signupHeader.setBackground(new java.awt.Color(36, 47, 65));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UNDERGRADUATE REGISTRATION");

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

        topic.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        topic.setForeground(new java.awt.Color(36, 47, 65));
        topic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topic.setText("Education Details");
        jPanel1.add(topic);
        topic.setBounds(0, 180, 900, 40);

        subject1_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        subject1_label.setText("Subject 1");
        jPanel1.add(subject1_label);
        subject1_label.setBounds(30, 230, 160, 30);

        subject1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        subject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject1ActionPerformed(evt);
            }
        });
        jPanel1.add(subject1);
        subject1.setBounds(180, 230, 250, 30);

        subject2_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        subject2_label.setText("Subject 2");
        jPanel1.add(subject2_label);
        subject2_label.setBounds(30, 270, 160, 30);

        subject2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        subject2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject2ActionPerformed(evt);
            }
        });
        jPanel1.add(subject2);
        subject2.setBounds(180, 270, 250, 30);

        subject3_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        subject3_label.setText("Subject 3");
        jPanel1.add(subject3_label);
        subject3_label.setBounds(30, 310, 160, 30);

        subject3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        subject3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject3ActionPerformed(evt);
            }
        });
        jPanel1.add(subject3);
        subject3.setBounds(180, 310, 250, 30);

        result1_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        result1_label.setText("Result 1");
        jPanel1.add(result1_label);
        result1_label.setBounds(460, 230, 160, 30);

        result2_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        result2_label.setText("Result 2");
        jPanel1.add(result2_label);
        result2_label.setBounds(460, 270, 160, 30);

        result3_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        result3_label.setText("Result 3");
        jPanel1.add(result3_label);
        result3_label.setBounds(460, 310, 160, 30);

        zScore_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        zScore_label.setText("Z-Score");
        jPanel1.add(zScore_label);
        zScore_label.setBounds(30, 350, 160, 30);

        zScore.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        zScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zScoreActionPerformed(evt);
            }
        });
        jPanel1.add(zScore);
        zScore.setBounds(180, 350, 250, 30);

        islandRank_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        islandRank_label.setText("Island Rank");
        jPanel1.add(islandRank_label);
        islandRank_label.setBounds(30, 389, 160, 30);

        islandRank.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        islandRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                islandRankActionPerformed(evt);
            }
        });
        jPanel1.add(islandRank);
        islandRank.setBounds(180, 389, 250, 30);

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
        courseCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseComboActionPerformed(evt);
            }
        });
        jPanel1.add(courseCombo);
        courseCombo.setBounds(390, 130, 300, 30);

        course_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        course_label.setText("Select Course");
        jPanel1.add(course_label);
        course_label.setBounds(220, 130, 160, 30);

        indexNumber_label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        indexNumber_label.setText("Index Number");
        jPanel1.add(indexNumber_label);
        indexNumber_label.setBounds(460, 350, 160, 30);

        indexNumber.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        indexNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexNumberActionPerformed(evt);
            }
        });
        jPanel1.add(indexNumber);
        indexNumber.setBounds(620, 350, 250, 30);

        result1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "S", "F" }));
        jPanel1.add(result1);
        result1.setBounds(620, 230, 250, 30);

        result2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "S", "F" }));
        jPanel1.add(result2);
        result2.setBounds(620, 270, 250, 30);

        result3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "S", "F" }));
        jPanel1.add(result3);
        result3.setBounds(620, 310, 250, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 910, 510);

        setSize(new java.awt.Dimension(918, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subject1ActionPerformed

    private void subject2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subject2ActionPerformed

    private void subject3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subject3ActionPerformed

    private void zScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zScoreActionPerformed

    private void islandRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_islandRankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_islandRankActionPerformed

    private void nextPageButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageButton1ActionPerformed
        String course = (String) courseCombo.getSelectedItem();
        String subject_1 = subject1.getText();
        String subject_2 = subject2.getText();
        String subject_3 = subject3.getText();
        String subject_result_1 = (String) result1.getSelectedItem();
        String subject_result_2 = (String) result2.getSelectedItem();
        String subject_result_3 = (String) result3.getSelectedItem();
        double z_score = Double.parseDouble(zScore.getText());
        int index_number = Integer.parseInt(indexNumber.getText());
        int rank = Integer.parseInt(islandRank.getText());
        
        String course_id="";
        try {
            course_id = courseController.findCourseID(course);
        } catch (SQLException ex) {
            Logger.getLogger(undergraduate_registration2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        undergraduate undergrad = new undergraduate(student_id,subject_1,subject_2,subject_3,subject_result_1,subject_result_2,subject_result_3,z_score,index_number,rank,course_id);
        try {
            int result = undergraduateController.addUndergraduate(undergrad);
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

    private void courseComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseComboActionPerformed

    private void indexNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indexNumberActionPerformed

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
            java.util.logging.Logger.getLogger(undergraduate_registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(undergraduate_registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(undergraduate_registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(undergraduate_registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new undergraduate_registration2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> courseCombo;
    private javax.swing.JLabel course_label;
    private javax.swing.JTextField indexNumber;
    private javax.swing.JLabel indexNumber_label;
    private javax.swing.JTextField islandRank;
    private javax.swing.JLabel islandRank_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextPageButton1;
    private javax.swing.JComboBox<String> result1;
    private javax.swing.JLabel result1_label;
    private javax.swing.JComboBox<String> result2;
    private javax.swing.JLabel result2_label;
    private javax.swing.JComboBox<String> result3;
    private javax.swing.JLabel result3_label;
    private javax.swing.JPanel signupHeader;
    private javax.swing.JTextField subject1;
    private javax.swing.JLabel subject1_label;
    private javax.swing.JTextField subject2;
    private javax.swing.JLabel subject2_label;
    private javax.swing.JTextField subject3;
    private javax.swing.JLabel subject3_label;
    private javax.swing.JLabel topic;
    private javax.swing.JTextField zScore;
    private javax.swing.JLabel zScore_label;
    // End of variables declaration//GEN-END:variables
}