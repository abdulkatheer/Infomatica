
package gui;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Hod_Content extends javax.swing.JFrame {

  

    public Hod_Content() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        SubHeading = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        biodata_label = new javax.swing.JLabel();
        progress_label = new javax.swing.JLabel();
        information_label = new javax.swing.JLabel();
        internal_marks_label = new javax.swing.JLabel();
        biodata_txt = new javax.swing.JLabel();
        internal_marks_txt = new javax.swing.JLabel();
        progress_txt = new javax.swing.JLabel();
        information_txt = new javax.swing.JLabel();
        sem_result_label = new javax.swing.JLabel();
        sem_result_txt = new javax.swing.JLabel();
        feedback_label = new javax.swing.JLabel();
        feedback_txt = new javax.swing.JLabel();
        Footer_panel = new javax.swing.JPanel();
        Footer_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainPanelMouseDragged(evt);
            }
        });
        MainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MainPanelMouseReleased(evt);
            }
        });
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Head.setBackground(new java.awt.Color(45, 118, 232));

        jLabel1.setBackground(new java.awt.Color(45, 118, 232));
        jLabel1.setFont(new java.awt.Font("Quicksand Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MAHENDRA ENGINEERING COLLEGE");

        jLabel2.setFont(new java.awt.Font("Oregon LDO DemiBold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("(Autonomous)");

        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_No_20px.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Iconified.png"))); // NOI18N
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jLabel2)
                .addContainerGap(385, Short.MAX_VALUE))
            .addGroup(HeadLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit))
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addGroup(HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeadLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        MainPanel.add(Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 110));

        Heading.setFont(new java.awt.Font("Oregon LDO", 1, 18)); // NOI18N
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("HoD Portal");

        javax.swing.GroupLayout SubHeadingLayout = new javax.swing.GroupLayout(SubHeading);
        SubHeading.setLayout(SubHeadingLayout);
        SubHeadingLayout.setHorizontalGroup(
            SubHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubHeadingLayout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303))
        );
        SubHeadingLayout.setVerticalGroup(
            SubHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        MainPanel.add(SubHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 860, 40));

        content.setBackground(new java.awt.Color(255, 255, 255));

        biodata_label.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        biodata_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        biodata_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hod_pics/icons8_Resume_100px.png"))); // NOI18N
        biodata_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        biodata_label.setIconTextGap(1);
        biodata_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                biodata_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                biodata_labelMouseExited(evt);
            }
        });

        progress_label.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        progress_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        progress_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hod_pics/Student Progress.png"))); // NOI18N
        progress_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        progress_label.setIconTextGap(1);
        progress_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                progress_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                progress_labelMouseExited(evt);
            }
        });

        information_label.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        information_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        information_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student_pics/Request Leave.png"))); // NOI18N
        information_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        information_label.setIconTextGap(1);
        information_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                information_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                information_labelMouseExited(evt);
            }
        });

        internal_marks_label.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        internal_marks_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        internal_marks_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hod_pics/Internal Result_1.png"))); // NOI18N
        internal_marks_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        internal_marks_label.setIconTextGap(1);
        internal_marks_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                internal_marks_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                internal_marks_labelMouseExited(evt);
            }
        });

        biodata_txt.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        biodata_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        biodata_txt.setText("Biodata");

        internal_marks_txt.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        internal_marks_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        internal_marks_txt.setText("Internal Marks");

        progress_txt.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        progress_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        progress_txt.setText("Student's Progress");

        information_txt.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        information_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        information_txt.setText("Convey Information");

        sem_result_label.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        sem_result_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sem_result_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student_pics/Sem Result.png"))); // NOI18N
        sem_result_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sem_result_label.setIconTextGap(1);
        sem_result_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sem_result_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sem_result_labelMouseExited(evt);
            }
        });

        sem_result_txt.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        sem_result_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sem_result_txt.setText("Semester Result");

        feedback_label.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        feedback_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        feedback_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student_pics/Feedback_1.png"))); // NOI18N
        feedback_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        feedback_label.setIconTextGap(1);
        feedback_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                feedback_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                feedback_labelMouseExited(evt);
            }
        });

        feedback_txt.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        feedback_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        feedback_txt.setText("View Feedback");

        Footer_txt.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        Footer_txt.setForeground(new java.awt.Color(45, 118, 232));
        Footer_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Footer_txt.setText("Powered by Kd.org");

        javax.swing.GroupLayout Footer_panelLayout = new javax.swing.GroupLayout(Footer_panel);
        Footer_panel.setLayout(Footer_panelLayout);
        Footer_panelLayout.setHorizontalGroup(
            Footer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Footer_panelLayout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(Footer_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Footer_panelLayout.setVerticalGroup(
            Footer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Footer_txt)
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(information_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(information_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(biodata_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(biodata_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sem_result_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(internal_marks_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sem_result_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(internal_marks_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(progress_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(feedback_label, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(feedback_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(progress_label, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(194, Short.MAX_VALUE))
            .addComponent(Footer_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(internal_marks_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(biodata_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progress_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(biodata_txt)
                    .addComponent(internal_marks_txt)
                    .addComponent(progress_txt))
                .addGap(18, 18, 18)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(information_label, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(information_txt))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(sem_result_label, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sem_result_txt))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(feedback_label, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feedback_txt)))
                .addGap(35, 35, 35)
                .addComponent(Footer_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainPanel.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 860, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //1. Code for Panel Movement Starts
    int g_xx, g_yy;
    private void MainPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMousePressed
        setOpacity((float)0.8);       
        g_xx = evt.getX();
        g_yy = evt.getY();
    }//GEN-LAST:event_MainPanelMousePressed

    private void MainPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseDragged
        int m_x = evt.getXOnScreen();
        int m_y = evt.getYOnScreen();
        this.setLocation(m_x-g_xx, m_y-g_yy);
    }//GEN-LAST:event_MainPanelMouseDragged
    //1. Code for Panel Movement Endss  
    
    //2. Changing color on mouse eneter
    void setColor(JLabel p){
        p.setOpaque(true);
        p.setBackground(new Color(45,118,232));
    }
    
    void resetColor(JLabel p){
        p.setBackground(new Color(240,240,240));
        p.setOpaque(false);
    }
    private void biodata_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_biodata_labelMouseEntered
        setColor(biodata_txt);
    }//GEN-LAST:event_biodata_labelMouseEntered

    private void biodata_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_biodata_labelMouseExited
        resetColor(biodata_txt);
    }//GEN-LAST:event_biodata_labelMouseExited

    private void internal_marks_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internal_marks_labelMouseEntered
        setColor(internal_marks_txt);
    }//GEN-LAST:event_internal_marks_labelMouseEntered

    private void internal_marks_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internal_marks_labelMouseExited
        resetColor(internal_marks_txt);
    }//GEN-LAST:event_internal_marks_labelMouseExited

    private void progress_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_progress_labelMouseEntered
        setColor(progress_txt);
    }//GEN-LAST:event_progress_labelMouseEntered

    private void progress_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_progress_labelMouseExited
        resetColor(progress_txt);
    }//GEN-LAST:event_progress_labelMouseExited

    private void information_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_information_labelMouseEntered
        setColor(information_txt);
    }//GEN-LAST:event_information_labelMouseEntered

    private void information_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_information_labelMouseExited
        resetColor(information_txt);
    }//GEN-LAST:event_information_labelMouseExited

    private void sem_result_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sem_result_labelMouseEntered
        setColor(sem_result_txt);
    }//GEN-LAST:event_sem_result_labelMouseEntered

    private void sem_result_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sem_result_labelMouseExited
        resetColor(sem_result_txt);
    }//GEN-LAST:event_sem_result_labelMouseExited

    private void feedback_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedback_labelMouseEntered
        setColor(feedback_txt);
    }//GEN-LAST:event_feedback_labelMouseEntered

    private void feedback_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedback_labelMouseExited
        resetColor(feedback_txt);
    }//GEN-LAST:event_feedback_labelMouseExited

    private void MainPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseReleased
        setOpacity((float)1.0);
    }//GEN-LAST:event_MainPanelMouseReleased

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        dispose();
    }//GEN-LAST:event_exitMousePressed

    private void minimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMousePressed
        this.setState(Hod_Content.ICONIFIED);
    }//GEN-LAST:event_minimizeMousePressed
    //2. Changing color ends 
  
   
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hod_Content.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hod_Content.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hod_Content.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hod_Content.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hod_Content().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer_panel;
    private javax.swing.JLabel Footer_txt;
    private javax.swing.JPanel Head;
    private javax.swing.JLabel Heading;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SubHeading;
    private javax.swing.JLabel biodata_label;
    private javax.swing.JLabel biodata_txt;
    private javax.swing.JPanel content;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel feedback_label;
    private javax.swing.JLabel feedback_txt;
    private javax.swing.JLabel information_label;
    private javax.swing.JLabel information_txt;
    private javax.swing.JLabel internal_marks_label;
    private javax.swing.JLabel internal_marks_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel progress_label;
    private javax.swing.JLabel progress_txt;
    private javax.swing.JLabel sem_result_label;
    private javax.swing.JLabel sem_result_txt;
    // End of variables declaration//GEN-END:variables
}
