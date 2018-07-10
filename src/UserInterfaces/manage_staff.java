/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces;

/**
 *
 * @author Ashera
 */
public class manage_staff extends javax.swing.JFrame {

    /**
     * Creates new form edit_staff
     */
    public manage_staff() {
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
        signupHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        home_Label = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        lecturerImg = new javax.swing.JLabel();
        lecturerButton = new javax.swing.JButton();
        instructorImg = new javax.swing.JLabel();
        instructorButton = new javax.swing.JButton();
        assignLabImg = new javax.swing.JLabel();
        assignLabButton = new javax.swing.JButton();
        editLabButton = new javax.swing.JButton();
        editLabImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setLayout(null);

        signupHeader.setBackground(new java.awt.Color(97, 212, 195));
        signupHeader.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 47, 65));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE STAFF");
        signupHeader.add(jLabel1);
        jLabel1.setBounds(0, 13, 930, 64);

        home_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_black.png"))); // NOI18N
        signupHeader.add(home_Label);
        home_Label.setBounds(0, 0, 90, 90);

        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        signupHeader.add(homeButton);
        homeButton.setBounds(0, 0, 90, 90);

        jPanel1.add(signupHeader);
        signupHeader.setBounds(0, 0, 950, 90);

        lecturerImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lecturerImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lecturer.png"))); // NOI18N
        jPanel1.add(lecturerImg);
        lecturerImg.setBounds(40, 190, 150, 150);

        lecturerButton.setBackground(new java.awt.Color(255, 255, 255));
        lecturerButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lecturerButton.setForeground(new java.awt.Color(36, 47, 65));
        lecturerButton.setText("Lecturer");
        lecturerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(lecturerButton);
        lecturerButton.setBounds(40, 350, 150, 30);

        instructorImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructorImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/instructor.png"))); // NOI18N
        jPanel1.add(instructorImg);
        instructorImg.setBounds(270, 190, 150, 150);

        instructorButton.setBackground(new java.awt.Color(255, 255, 255));
        instructorButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        instructorButton.setForeground(new java.awt.Color(36, 47, 65));
        instructorButton.setText("Instructor");
        instructorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructorButtonActionPerformed(evt);
            }
        });
        jPanel1.add(instructorButton);
        instructorButton.setBounds(270, 350, 150, 30);

        assignLabImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignLabImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/assignLab.png"))); // NOI18N
        jPanel1.add(assignLabImg);
        assignLabImg.setBounds(500, 190, 150, 150);

        assignLabButton.setBackground(new java.awt.Color(255, 255, 255));
        assignLabButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        assignLabButton.setForeground(new java.awt.Color(36, 47, 65));
        assignLabButton.setText("Assign Lab");
        assignLabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignLabButtonActionPerformed(evt);
            }
        });
        jPanel1.add(assignLabButton);
        assignLabButton.setBounds(500, 350, 150, 30);

        editLabButton.setBackground(new java.awt.Color(255, 255, 255));
        editLabButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        editLabButton.setForeground(new java.awt.Color(36, 47, 65));
        editLabButton.setText("Edit Assigned Lab");
        editLabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLabButtonActionPerformed(evt);
            }
        });
        jPanel1.add(editLabButton);
        editLabButton.setBounds(721, 350, 168, 30);

        editLabImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLabImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editLab.png"))); // NOI18N
        jPanel1.add(editLabImg);
        editLabImg.setBounds(730, 190, 150, 150);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 540);

        setSize(new java.awt.Dimension(948, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lecturerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerButtonActionPerformed
        new manage_lecturer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lecturerButtonActionPerformed

    private void instructorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructorButtonActionPerformed
        new manage_instructor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_instructorButtonActionPerformed

    private void assignLabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignLabButtonActionPerformed
        new assign_lab().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_assignLabButtonActionPerformed

    private void editLabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLabButtonActionPerformed
        new edit_assigned_lab().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editLabButtonActionPerformed

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
            java.util.logging.Logger.getLogger(manage_staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage_staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage_staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage_staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manage_staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignLabButton;
    private javax.swing.JLabel assignLabImg;
    private javax.swing.JButton editLabButton;
    private javax.swing.JLabel editLabImg;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel home_Label;
    private javax.swing.JButton instructorButton;
    private javax.swing.JLabel instructorImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lecturerButton;
    private javax.swing.JLabel lecturerImg;
    private javax.swing.JPanel signupHeader;
    // End of variables declaration//GEN-END:variables
}