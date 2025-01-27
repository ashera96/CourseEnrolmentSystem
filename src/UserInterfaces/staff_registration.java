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
public class staff_registration extends javax.swing.JFrame {

    /**
     * Creates new form staff_registration
     */
    public staff_registration() {
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
        jLabel1.setText("ACADEMIC STAFF REGISTRATION");
        signupHeader.add(jLabel1);
        jLabel1.setBounds(0, 13, 900, 64);

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
        signupHeader.setBounds(0, 0, 930, 90);

        lecturerImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lecturerImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lecturer.png"))); // NOI18N
        jPanel1.add(lecturerImg);
        lecturerImg.setBounds(200, 170, 150, 150);

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
        lecturerButton.setBounds(200, 330, 150, 30);

        instructorImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructorImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/instructor.png"))); // NOI18N
        jPanel1.add(instructorImg);
        instructorImg.setBounds(550, 170, 150, 150);

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
        instructorButton.setBounds(550, 330, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 930, 520);

        setSize(new java.awt.Dimension(918, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lecturerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerButtonActionPerformed
        new lecturer_registration().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lecturerButtonActionPerformed

    private void instructorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructorButtonActionPerformed
        new instructor_registration().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_instructorButtonActionPerformed

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
            java.util.logging.Logger.getLogger(staff_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staff_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staff_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staff_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staff_registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
