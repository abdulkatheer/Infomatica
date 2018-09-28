
package gui;
import javax.swing.JButton;


public class Hod_Login extends javax.swing.JFrame {

  
    public Hod_Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        SubHeading = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        UserLabel = new javax.swing.JLabel();
        PassLabel = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Username = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        UsernameIcon = new javax.swing.JLabel();
        PasswordIcon = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
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

        exit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_No_20px.png"))); // NOI18N
        exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit1MousePressed(evt);
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
                .addGap(217, 217, 217)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit1))
            .addGroup(HeadLayout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addGroup(HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeadLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        Content.setBackground(new java.awt.Color(255, 255, 255));

        UserLabel.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        UserLabel.setText("Username :");

        PassLabel.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        PassLabel.setText("Password :");

        Password.setBorder(null);
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        Username.setBorder(null);
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(45, 118, 232));

        jSeparator2.setForeground(new java.awt.Color(45, 118, 232));

        UsernameIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Collaborator Male_30px.png"))); // NOI18N

        PasswordIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Access_30px.png"))); // NOI18N

        LoginButton.setBackground(new java.awt.Color(45, 118, 232));
        LoginButton.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsernameIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Username)
                            .addComponent(jSeparator1)
                            .addComponent(Password)
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PassLabel)
                                    .addComponent(UserLabel))
                                .addGap(0, 156, Short.MAX_VALUE))
                            .addComponent(jSeparator2))))
                .addGap(283, 283, 283))
            .addComponent(Footer_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(UserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addComponent(PassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PasswordIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addComponent(LoginButton)
                .addGap(46, 46, 46)
                .addComponent(Footer_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        MainPanel.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 860, 400));

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
    //1. Code for Panel Movement Ends
    
    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void MainPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseReleased
        setOpacity((float)1.0);
    }//GEN-LAST:event_MainPanelMouseReleased

    private void exit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MousePressed
        dispose();
    }//GEN-LAST:event_exit1MousePressed

    private void minimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMousePressed
        this.setState(Hod_Login.ICONIFIED);
    }//GEN-LAST:event_minimizeMousePressed

   
   
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
            java.util.logging.Logger.getLogger(Hod_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hod_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hod_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hod_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hod_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JPanel Footer_panel;
    private javax.swing.JLabel Footer_txt;
    private javax.swing.JPanel Head;
    private javax.swing.JLabel Heading;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel PasswordIcon;
    private javax.swing.JPanel SubHeading;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel UsernameIcon;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
