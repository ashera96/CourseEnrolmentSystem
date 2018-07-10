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
public class manage_subject extends javax.swing.JFrame {

    /**
     * Creates new form manage_subject
     */
    public manage_subject() {
        initComponents();
        homeButton.setContentAreaFilled(false);
        getSemesterPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        degreeProgram = new javax.swing.ButtonGroup();
        manageSubjectPanel = new javax.swing.JPanel();
        signupHeader3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        home_Label = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        lecturerImg3 = new javax.swing.JLabel();
        editCourseSubjectButton = new javax.swing.JButton();
        instructorImg = new javax.swing.JLabel();
        subjectSelectionButton = new javax.swing.JButton();
        editSelectionImg = new javax.swing.JLabel();
        editSelectionButton = new javax.swing.JButton();
        getSemesterPanel = new javax.swing.JPanel();
        manageSubjectHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        getSemester = new javax.swing.JPanel();
        backButton1 = new javax.swing.JButton();
        academicYear_Label = new javax.swing.JLabel();
        academicYearCombo = new javax.swing.JComboBox<>();
        studentID_Label = new javax.swing.JLabel();
        studentID = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        degreeProgram_Label = new javax.swing.JLabel();
        undergraduate = new javax.swing.JRadioButton();
        postgraduate = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        manageSubjectPanel.setBackground(new java.awt.Color(36, 47, 65));
        manageSubjectPanel.setLayout(null);

        signupHeader3.setBackground(new java.awt.Color(97, 212, 195));
        signupHeader3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(36, 47, 65));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MANAGE SUBJECT");
        signupHeader3.add(jLabel4);
        jLabel4.setBounds(0, 13, 930, 64);

        home_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_black.png"))); // NOI18N
        signupHeader3.add(home_Label);
        home_Label.setBounds(0, 0, 90, 90);

        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        signupHeader3.add(homeButton);
        homeButton.setBounds(0, 0, 90, 90);

        manageSubjectPanel.add(signupHeader3);
        signupHeader3.setBounds(0, 0, 950, 90);

        lecturerImg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lecturerImg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editSubject.png"))); // NOI18N
        manageSubjectPanel.add(lecturerImg3);
        lecturerImg3.setBounds(70, 180, 150, 150);

        editCourseSubjectButton.setBackground(new java.awt.Color(255, 255, 255));
        editCourseSubjectButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        editCourseSubjectButton.setForeground(new java.awt.Color(36, 47, 65));
        editCourseSubjectButton.setText("Edit Course Subject");
        editCourseSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCourseSubjectButtonActionPerformed(evt);
            }
        });
        manageSubjectPanel.add(editCourseSubjectButton);
        editCourseSubjectButton.setBounds(50, 340, 190, 30);

        instructorImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructorImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/selectSubjects.png"))); // NOI18N
        manageSubjectPanel.add(instructorImg);
        instructorImg.setBounds(370, 180, 150, 150);

        subjectSelectionButton.setBackground(new java.awt.Color(255, 255, 255));
        subjectSelectionButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        subjectSelectionButton.setForeground(new java.awt.Color(36, 47, 65));
        subjectSelectionButton.setText("Subject Selection");
        subjectSelectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectSelectionButtonActionPerformed(evt);
            }
        });
        manageSubjectPanel.add(subjectSelectionButton);
        subjectSelectionButton.setBounds(350, 340, 190, 30);

        editSelectionImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editSelectionImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editSelection.png"))); // NOI18N
        manageSubjectPanel.add(editSelectionImg);
        editSelectionImg.setBounds(670, 180, 150, 150);

        editSelectionButton.setBackground(new java.awt.Color(255, 255, 255));
        editSelectionButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        editSelectionButton.setForeground(new java.awt.Color(36, 47, 65));
        editSelectionButton.setText("Edit Selection");
        editSelectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSelectionButtonActionPerformed(evt);
            }
        });
        manageSubjectPanel.add(editSelectionButton);
        editSelectionButton.setBounds(650, 340, 190, 30);

        getContentPane().add(manageSubjectPanel);
        manageSubjectPanel.setBounds(0, 0, 950, 540);

        getSemesterPanel.setLayout(null);

        manageSubjectHeader.setBackground(new java.awt.Color(36, 47, 65));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SUBJECT SELECTION");

        javax.swing.GroupLayout manageSubjectHeaderLayout = new javax.swing.GroupLayout(manageSubjectHeader);
        manageSubjectHeader.setLayout(manageSubjectHeaderLayout);
        manageSubjectHeaderLayout.setHorizontalGroup(
            manageSubjectHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSubjectHeaderLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        manageSubjectHeaderLayout.setVerticalGroup(
            manageSubjectHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageSubjectHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        getSemesterPanel.add(manageSubjectHeader);
        manageSubjectHeader.setBounds(0, 0, 940, 90);

        getSemester.setBackground(new java.awt.Color(97, 212, 195));
        getSemester.setLayout(null);

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
        getSemester.add(backButton1);
        backButton1.setBounds(300, 300, 150, 50);

        academicYear_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        academicYear_Label.setText("Academic Year");
        getSemester.add(academicYear_Label);
        academicYear_Label.setBounds(270, 110, 180, 30);

        academicYearCombo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        academicYearCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Year", "2nd Year", "3rd Year", "4th Year" }));
        getSemester.add(academicYearCombo);
        academicYearCombo.setBounds(490, 110, 180, 30);

        studentID_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        studentID_Label.setText("Student ID");
        getSemester.add(studentID_Label);
        studentID_Label.setBounds(270, 60, 180, 30);

        studentID.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        studentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIDActionPerformed(evt);
            }
        });
        getSemester.add(studentID);
        studentID.setBounds(490, 60, 160, 30);

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
        getSemester.add(confirmButton);
        confirmButton.setBounds(490, 300, 150, 50);

        degreeProgram_Label.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        degreeProgram_Label.setText("Degree Program");
        getSemester.add(degreeProgram_Label);
        degreeProgram_Label.setBounds(270, 160, 180, 30);

        degreeProgram.add(undergraduate);
        undergraduate.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        undergraduate.setText("Undergraduate");
        undergraduate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undergraduateActionPerformed(evt);
            }
        });
        getSemester.add(undergraduate);
        undergraduate.setBounds(490, 160, 160, 30);

        degreeProgram.add(postgraduate);
        postgraduate.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        postgraduate.setText("Postgraduate");
        postgraduate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgraduateActionPerformed(evt);
            }
        });
        getSemester.add(postgraduate);
        postgraduate.setBounds(490, 210, 160, 30);

        getSemesterPanel.add(getSemester);
        getSemester.setBounds(0, 90, 910, 420);

        getContentPane().add(getSemesterPanel);
        getSemesterPanel.setBounds(0, 0, 930, 520);

        setSize(new java.awt.Dimension(918, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editCourseSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCourseSubjectButtonActionPerformed
        new edit_course_subject().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editCourseSubjectButtonActionPerformed

    private void subjectSelectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectSelectionButtonActionPerformed
        manageSubjectPanel.setVisible(false);
        getSemesterPanel.setVisible(true);
    }//GEN-LAST:event_subjectSelectionButtonActionPerformed

    private void editSelectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSelectionButtonActionPerformed
        new edit_enrolled_subjects().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editSelectionButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        new manage_subject().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void studentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIDActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        String student_id = studentID.getText();
        String academic_year = (String) academicYearCombo.getSelectedItem();
        String degree_program = degreeProgram.getSelection().getActionCommand();
        int year;
        if (null == academic_year)
        year = 4;
        else switch (academic_year) {
            case "1st Year":
            year = 1;
            break;
            case "2nd Year":
            year = 2;
            break;
            case "3rd Year":
            year = 3;
            break;
            default:
            year = 4;
            break;
        }
        subject_selection.student_id = student_id;
        subject_selection.academicYear = year;
        if ("Undergraduate".equals(degree_program)) {
            subject_selection.is_undergraduate = true;
        }
        else {
            subject_selection.is_undergraduate = false;
        }
        new subject_selection().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void confirmButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButtonKeyPressed

    private void undergraduateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undergraduateActionPerformed
        undergraduate.setActionCommand("Undergraduate");
    }//GEN-LAST:event_undergraduateActionPerformed

    private void postgraduateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgraduateActionPerformed
        postgraduate.setActionCommand("Postgraduate");
    }//GEN-LAST:event_postgraduateActionPerformed

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
            java.util.logging.Logger.getLogger(manage_subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage_subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage_subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage_subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manage_subject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> academicYearCombo;
    private javax.swing.JLabel academicYear_Label;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton confirmButton;
    private javax.swing.ButtonGroup degreeProgram;
    private javax.swing.JLabel degreeProgram_Label;
    private javax.swing.JButton editCourseSubjectButton;
    private javax.swing.JButton editSelectionButton;
    private javax.swing.JLabel editSelectionImg;
    private javax.swing.JPanel getSemester;
    private javax.swing.JPanel getSemesterPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel home_Label;
    private javax.swing.JLabel instructorImg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lecturerImg3;
    private javax.swing.JPanel manageSubjectHeader;
    private javax.swing.JPanel manageSubjectPanel;
    private javax.swing.JRadioButton postgraduate;
    private javax.swing.JPanel signupHeader3;
    private javax.swing.JTextField studentID;
    private javax.swing.JLabel studentID_Label;
    private javax.swing.JButton subjectSelectionButton;
    private javax.swing.JRadioButton undergraduate;
    // End of variables declaration//GEN-END:variables
}