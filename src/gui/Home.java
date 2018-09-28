
package gui;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Home extends javax.swing.JFrame {

    
    public Home() {
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
        Content = new javax.swing.JPanel();
        Student_panel = new javax.swing.JPanel();
        StudentIcon = new javax.swing.JLabel();
        Faculty_panel = new javax.swing.JPanel();
        StaffIcon = new javax.swing.JLabel();
        Hod_panel = new javax.swing.JPanel();
        HoDIcon = new javax.swing.JLabel();
        Footer_panel = new javax.swing.JPanel();
        Footer_txt = new javax.swing.JLabel();
        LoginAs_txt = new javax.swing.JLabel();
        Faculty_txt = new javax.swing.JLabel();
        Student_txt = new javax.swing.JLabel();
        HoD_txt = new javax.swing.JLabel();

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
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        MainPanel.add(Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 110));

        Content.setBackground(new java.awt.Color(255, 255, 255));

        StudentIcon.setForeground(new java.awt.Color(255, 255, 255));
        StudentIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StudentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Student Male_100px.png"))); // NOI18N
        StudentIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StudentIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StudentIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StudentIconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Student_panelLayout = new javax.swing.GroupLayout(Student_panel);
        Student_panel.setLayout(Student_panelLayout);
        Student_panelLayout.setHorizontalGroup(
            Student_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        Student_panelLayout.setVerticalGroup(
            Student_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        StaffIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StaffIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Admin_100px_1.png"))); // NOI18N
        StaffIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StaffIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StaffIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StaffIconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Faculty_panelLayout = new javax.swing.GroupLayout(Faculty_panel);
        Faculty_panel.setLayout(Faculty_panelLayout);
        Faculty_panelLayout.setHorizontalGroup(
            Faculty_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StaffIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        Faculty_panelLayout.setVerticalGroup(
            Faculty_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StaffIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HoDIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HoDIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Admin_Settings_Male_100px_1.png"))); // NOI18N
        HoDIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HoDIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoDIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HoDIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HoDIconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Hod_panelLayout = new javax.swing.GroupLayout(Hod_panel);
        Hod_panel.setLayout(Hod_panelLayout);
        Hod_panelLayout.setHorizontalGroup(
            Hod_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HoDIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        Hod_panelLayout.setVerticalGroup(
            Hod_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HoDIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );

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

        LoginAs_txt.setFont(new java.awt.Font("Oregon LDO", 1, 18)); // NOI18N
        LoginAs_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginAs_txt.setText("Login As");

        Faculty_txt.setFont(new java.awt.Font("Oregon LDO", 1, 14)); // NOI18N
        Faculty_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Faculty_txt.setText("Faculty");
        Faculty_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Faculty_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Faculty_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Faculty_txtMouseExited(evt);
            }
        });

        Student_txt.setFont(new java.awt.Font("Oregon LDO", 1, 14)); // NOI18N
        Student_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Student_txt.setText("Student");
        Student_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Student_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Student_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Student_txtMouseExited(evt);
            }
        });

        HoD_txt.setFont(new java.awt.Font("Oregon LDO", 1, 14)); // NOI18N
        HoD_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HoD_txt.setText("HoD");
        HoD_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoD_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HoD_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HoD_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Footer_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Student_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Student_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LoginAs_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Faculty_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Faculty_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Hod_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HoD_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(LoginAs_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Hod_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Faculty_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Student_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Faculty_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Student_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoD_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(Footer_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainPanel.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 860, 430));

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
        //Lightens the frame on dragging
        setOpacity((float)0.8);
        g_xx = evt.getX();
        g_yy = evt.getY();
    }//GEN-LAST:event_MainPanelMousePressed

    private void MainPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseDragged
       int m_x = evt.getXOnScreen();
       int m_y = evt.getYOnScreen();
       
       this.setLocation(m_x-g_xx, m_y-g_yy);
    }//GEN-LAST:event_MainPanelMouseDragged
    //1. Code for Panel Movement Ends
    
    //Icon Functions to Create new Frame
    private void StudentIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentIconMouseClicked
        
        Student_Login s = new Student_Login();
        s.setVisible(true);
    }//GEN-LAST:event_StudentIconMouseClicked

    private void StaffIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaffIconMouseClicked
      
        Faculty_Login f = new Faculty_Login();
        f.setVisible(true);
    }//GEN-LAST:event_StaffIconMouseClicked

    private void HoDIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoDIconMouseClicked
        
        Hod_Login h = new Hod_Login();
        h.setVisible(true);
    }//GEN-LAST:event_HoDIconMouseClicked

    //2. Changing color on mouse enter
    void setColor(JLabel p){
        p.setOpaque(true);
        p.setBackground(new Color(45,118,232));
    }
    
    void resetColor(JLabel p){
        p.setBackground(new Color(240,240,240));
        p.setOpaque(false);
    }
    private void Student_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Student_txtMouseEntered
        setColor(Student_txt);   
    }//GEN-LAST:event_Student_txtMouseEntered

    private void Student_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Student_txtMouseExited
        resetColor(Student_txt);
    }//GEN-LAST:event_Student_txtMouseExited

    private void Faculty_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Faculty_txtMouseEntered
        setColor(Faculty_txt);
    }//GEN-LAST:event_Faculty_txtMouseEntered

    private void Faculty_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Faculty_txtMouseExited
        resetColor(Faculty_txt);
    }//GEN-LAST:event_Faculty_txtMouseExited

    private void HoD_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoD_txtMouseEntered
        setColor(HoD_txt);
    }//GEN-LAST:event_HoD_txtMouseEntered

    private void HoD_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoD_txtMouseExited
        resetColor(HoD_txt);
    }//GEN-LAST:event_HoD_txtMouseExited

    private void StudentIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentIconMouseEntered
        setColor(Student_txt); 
    }//GEN-LAST:event_StudentIconMouseEntered

    private void StudentIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentIconMouseExited
        resetColor(Student_txt);
    }//GEN-LAST:event_StudentIconMouseExited

    private void StaffIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaffIconMouseEntered
        setColor(Faculty_txt);
    }//GEN-LAST:event_StaffIconMouseEntered

    private void StaffIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaffIconMouseExited
        resetColor(Faculty_txt);
    }//GEN-LAST:event_StaffIconMouseExited

    private void HoDIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoDIconMouseEntered
        setColor(HoD_txt);
    }//GEN-LAST:event_HoDIconMouseEntered

    private void HoDIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoDIconMouseExited
        resetColor(HoD_txt);
    }//GEN-LAST:event_HoDIconMouseExited

    private void Student_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Student_txtMouseClicked
        new Student_Login().show();
    }//GEN-LAST:event_Student_txtMouseClicked
    //2. Changing color ends
    
    private void Faculty_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Faculty_txtMouseClicked
        new Faculty_Login().show();
    }//GEN-LAST:event_Faculty_txtMouseClicked

    private void HoD_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoD_txtMouseClicked
        new Hod_Login().show();
    }//GEN-LAST:event_HoD_txtMouseClicked

    private void MainPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseReleased
        setOpacity((float)1.0);
    }//GEN-LAST:event_MainPanelMouseReleased

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        dispose();
    }//GEN-LAST:event_exitMousePressed

    private void minimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMousePressed
        this.setState(Home.ICONIFIED);
    }//GEN-LAST:event_minimizeMousePressed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JPanel Faculty_panel;
    private javax.swing.JLabel Faculty_txt;
    private javax.swing.JPanel Footer_panel;
    private javax.swing.JLabel Footer_txt;
    private javax.swing.JPanel Head;
    private javax.swing.JLabel HoDIcon;
    private javax.swing.JLabel HoD_txt;
    private javax.swing.JPanel Hod_panel;
    private javax.swing.JLabel LoginAs_txt;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel StaffIcon;
    private javax.swing.JLabel StudentIcon;
    private javax.swing.JPanel Student_panel;
    private javax.swing.JLabel Student_txt;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
