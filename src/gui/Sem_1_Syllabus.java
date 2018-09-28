
package gui;

import com.adobe.acrobat.Viewer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Sem_1_Syllabus extends javax.swing.JFrame {

    
    public Sem_1_Syllabus() {
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
        exit1 = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        Footer_panel = new javax.swing.JPanel();
        Footer_txt = new javax.swing.JLabel();
        InnerContent = new javax.swing.JPanel();
        dataAnalytics = new javax.swing.JButton();
        mobileComputing = new javax.swing.JButton();
        infoSecurity = new javax.swing.JButton();
        infoCodingTeq = new javax.swing.JButton();
        fundamentalsOfDSP = new javax.swing.JButton();
        roboticsAndAutomation = new javax.swing.JButton();
        SubHeading = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

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

        exit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Iconified.png"))); // NOI18N
        exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit1MousePressed(evt);
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
                .addComponent(exit1)
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
                    .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        MainPanel.add(Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 110));

        Content.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(367, Short.MAX_VALUE))
        );
        Footer_panelLayout.setVerticalGroup(
            Footer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Footer_txt)
        );

        InnerContent.setBackground(new java.awt.Color(255, 255, 255));

        dataAnalytics.setBackground(new java.awt.Color(45, 118, 232));
        dataAnalytics.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        dataAnalytics.setText("1. Data Analytics");
        dataAnalytics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataAnalyticsActionPerformed(evt);
            }
        });

        mobileComputing.setBackground(new java.awt.Color(45, 118, 232));
        mobileComputing.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        mobileComputing.setText("4. Mobile Computing");
        mobileComputing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileComputingActionPerformed(evt);
            }
        });

        infoSecurity.setBackground(new java.awt.Color(45, 118, 232));
        infoSecurity.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        infoSecurity.setText("2. Information Security");
        infoSecurity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoSecurityActionPerformed(evt);
            }
        });

        infoCodingTeq.setBackground(new java.awt.Color(45, 118, 232));
        infoCodingTeq.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        infoCodingTeq.setText("3. Information Coding Techniques");
        infoCodingTeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoCodingTeqActionPerformed(evt);
            }
        });

        fundamentalsOfDSP.setBackground(new java.awt.Color(45, 118, 232));
        fundamentalsOfDSP.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        fundamentalsOfDSP.setText("5. Fundamentals of Digital Signal Processing");
        fundamentalsOfDSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundamentalsOfDSPActionPerformed(evt);
            }
        });

        roboticsAndAutomation.setBackground(new java.awt.Color(45, 118, 232));
        roboticsAndAutomation.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        roboticsAndAutomation.setText("6. Robotics and Automation");
        roboticsAndAutomation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roboticsAndAutomationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InnerContentLayout = new javax.swing.GroupLayout(InnerContent);
        InnerContent.setLayout(InnerContentLayout);
        InnerContentLayout.setHorizontalGroup(
            InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerContentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roboticsAndAutomation)
                    .addComponent(fundamentalsOfDSP)
                    .addComponent(mobileComputing)
                    .addComponent(infoSecurity)
                    .addComponent(infoCodingTeq)
                    .addComponent(dataAnalytics)))
        );
        InnerContentLayout.setVerticalGroup(
            InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerContentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(dataAnalytics)
                .addGap(18, 18, 18)
                .addComponent(infoSecurity)
                .addGap(18, 18, 18)
                .addComponent(infoCodingTeq)
                .addGap(18, 18, 18)
                .addComponent(mobileComputing)
                .addGap(18, 18, 18)
                .addComponent(fundamentalsOfDSP)
                .addGap(18, 18, 18)
                .addComponent(roboticsAndAutomation)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Oregon LDO", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Semester VI Syllabus");

        javax.swing.GroupLayout SubHeadingLayout = new javax.swing.GroupLayout(SubHeading);
        SubHeading.setLayout(SubHeadingLayout);
        SubHeadingLayout.setHorizontalGroup(
            SubHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubHeadingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
        );
        SubHeadingLayout.setVerticalGroup(
            SubHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Footer_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SubHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InnerContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addComponent(SubHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(InnerContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49)
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
    
    //2. Changing color on mouse enter
    void setColor(JLabel p){
        p.setOpaque(true);
        p.setBackground(new Color(45,118,232));
    }
    
    void resetColor(JLabel p){
        p.setBackground(new Color(240,240,240));
        p.setOpaque(false);
    }
    private void MainPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseReleased
        setOpacity((float)1.0);
    }//GEN-LAST:event_MainPanelMouseReleased

    
    // Code for opening PDF file using acrobat jar starts
    private void dataAnalyticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataAnalyticsActionPerformed
        try {
            JFrame frame = new JFrame("Data Analytics Syllabus");
            Viewer viewer = new Viewer();
            frame.setLayout(new BorderLayout());
            frame.add(viewer,BorderLayout.CENTER);
            
          
            FileInputStream fis = new FileInputStream(new File("Data Analytics.pdf"));
            viewer.setDocumentInputStream(fis);
            viewer.activate();
            frame.setSize(500,400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.show();
        }catch(Exception e){

        }

    }//GEN-LAST:event_dataAnalyticsActionPerformed

    private void mobileComputingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileComputingActionPerformed
        try {
            JFrame frame = new JFrame("Mobile Computing Syllabus");
            Viewer viewer = new Viewer();
            frame.setLayout(new BorderLayout());
            frame.add(viewer,BorderLayout.CENTER);
            
          
            FileInputStream fis = new FileInputStream(new File("Mobile Computing.pdf"));
            viewer.setDocumentInputStream(fis);
            viewer.activate();
            frame.setSize(500,400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.show();
        }catch(Exception e){

        }
    }//GEN-LAST:event_mobileComputingActionPerformed

    private void infoSecurityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoSecurityActionPerformed
        try {
            JFrame frame = new JFrame("Mobile Computing Syllabus");
            Viewer viewer = new Viewer();
            frame.setLayout(new BorderLayout());
            frame.add(viewer,BorderLayout.CENTER);
            
          
            FileInputStream fis = new FileInputStream(new File("Mobile Computing.pdf"));
            viewer.setDocumentInputStream(fis);
            viewer.activate();
            frame.setSize(500,400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.show();
        }catch(Exception e){

        }
    }//GEN-LAST:event_infoSecurityActionPerformed

    private void infoCodingTeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoCodingTeqActionPerformed
        try {
            JFrame frame = new JFrame("Mobile Computing Syllabus");
            Viewer viewer = new Viewer();
            frame.setLayout(new BorderLayout());
            frame.add(viewer,BorderLayout.CENTER);
            
          
            FileInputStream fis = new FileInputStream(new File("Mobile Computing.pdf"));
            viewer.setDocumentInputStream(fis);
            viewer.activate();
            frame.setSize(500,400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.show();
        }catch(Exception e){

        }
    }//GEN-LAST:event_infoCodingTeqActionPerformed

    private void fundamentalsOfDSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundamentalsOfDSPActionPerformed
        try {
            JFrame frame = new JFrame("Mobile Computing Syllabus");
            Viewer viewer = new Viewer();
            frame.setLayout(new BorderLayout());
            frame.add(viewer,BorderLayout.CENTER);
            
          
            FileInputStream fis = new FileInputStream(new File("Mobile Computing.pdf"));
            viewer.setDocumentInputStream(fis);
            viewer.activate();
            frame.setSize(500,400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.show();
        }catch(Exception e){

        }
    }//GEN-LAST:event_fundamentalsOfDSPActionPerformed

    private void roboticsAndAutomationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roboticsAndAutomationActionPerformed
        try {
            JFrame frame = new JFrame("Mobile Computing Syllabus");
            Viewer viewer = new Viewer();
            frame.setLayout(new BorderLayout());
            frame.add(viewer,BorderLayout.CENTER);
            
          
            FileInputStream fis = new FileInputStream(new File("Robotics and Automation.pdf"));
            viewer.setDocumentInputStream(fis);
            viewer.activate();
            frame.setSize(500,400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.show();
        }catch(Exception e){

        }
    }//GEN-LAST:event_roboticsAndAutomationActionPerformed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        dispose();
    }//GEN-LAST:event_exitMousePressed

    private void exit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MousePressed
        this.setState(Sem_1_Syllabus.ICONIFIED);
    }//GEN-LAST:event_exit1MousePressed

   
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
            java.util.logging.Logger.getLogger(Sem_1_Syllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sem_1_Syllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sem_1_Syllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sem_1_Syllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sem_1_Syllabus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JPanel Footer_panel;
    private javax.swing.JLabel Footer_txt;
    private javax.swing.JPanel Head;
    private javax.swing.JPanel InnerContent;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SubHeading;
    private javax.swing.JButton dataAnalytics;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JButton fundamentalsOfDSP;
    private javax.swing.JButton infoCodingTeq;
    private javax.swing.JButton infoSecurity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mobileComputing;
    private javax.swing.JButton roboticsAndAutomation;
    // End of variables declaration//GEN-END:variables
}
