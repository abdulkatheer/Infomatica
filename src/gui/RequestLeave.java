
package gui;

import drivers.requestLeave;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.time.LocalDateTime;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RequestLeave extends javax.swing.JFrame {

    private static String RegNo;
    public RequestLeave(String RegNo){
        this.RegNo = RegNo;
    }
    
    public RequestLeave() {
        initComponents();
        RegNo_field.setText(RegNo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Head = new javax.swing.JPanel();
        MEC = new javax.swing.JLabel();
        Autonomous = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        InnerContent = new javax.swing.JPanel();
        Name_txt = new javax.swing.JLabel();
        RegNo_txt = new javax.swing.JLabel();
        Reason_txt = new javax.swing.JLabel();
        Days_txt = new javax.swing.JLabel();
        DateFrom_txt = new javax.swing.JLabel();
        DateTo_txt = new javax.swing.JLabel();
        Name_field = new javax.swing.JTextField();
        RegNo_field = new javax.swing.JTextField();
        Reason_field = new javax.swing.JTextField();
        Days_field = new javax.swing.JTextField();
        DateFrom_field = new javax.swing.JTextField();
        DateTo_field = new javax.swing.JTextField();
        Submit_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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

        MEC.setBackground(new java.awt.Color(45, 118, 232));
        MEC.setFont(new java.awt.Font("Quicksand Bold", 1, 24)); // NOI18N
        MEC.setForeground(new java.awt.Color(255, 255, 255));
        MEC.setText("MAHENDRA ENGINEERING COLLEGE");

        Autonomous.setFont(new java.awt.Font("Oregon LDO DemiBold", 1, 14)); // NOI18N
        Autonomous.setForeground(new java.awt.Color(255, 255, 255));
        Autonomous.setText("(Autonomous)");

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
                .addComponent(Autonomous)
                .addContainerGap(385, Short.MAX_VALUE))
            .addGroup(HeadLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(MEC)
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
                        .addComponent(MEC))
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(Autonomous)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        MainPanel.add(Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 110));

        Content.setBackground(new java.awt.Color(255, 255, 255));

        InnerContent.setBackground(new java.awt.Color(255, 255, 255));

        Name_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Name_txt.setText("Name                     :");

        RegNo_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        RegNo_txt.setText("Register Number :");

        Reason_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Reason_txt.setText("Reason / Purpose :");

        Days_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Days_txt.setText("No of Days            :");

        DateFrom_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        DateFrom_txt.setText("From                      :");

        DateTo_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        DateTo_txt.setText("To  :");

        Name_field.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Name_field.setForeground(new java.awt.Color(204, 204, 204));
        Name_field.setText("Enter Your Name");
        Name_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Name_fieldFocusGained(evt);
            }
        });
        Name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_fieldActionPerformed(evt);
            }
        });

        RegNo_field.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        RegNo_field.setForeground(new java.awt.Color(51, 51, 51));
        RegNo_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegNo_fieldActionPerformed(evt);
            }
        });

        Reason_field.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Reason_field.setForeground(new java.awt.Color(204, 204, 204));
        Reason_field.setText("Enter Reason for Leave");
        Reason_field.setToolTipText("");
        Reason_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Reason_fieldFocusGained(evt);
            }
        });
        Reason_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reason_fieldActionPerformed(evt);
            }
        });

        Days_field.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Days_field.setForeground(new java.awt.Color(204, 204, 204));
        Days_field.setText("How Many Days");
        Days_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Days_fieldFocusGained(evt);
            }
        });
        Days_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Days_fieldActionPerformed(evt);
            }
        });

        DateFrom_field.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        DateFrom_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateFrom_fieldActionPerformed(evt);
            }
        });

        DateTo_field.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        DateTo_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateTo_fieldActionPerformed(evt);
            }
        });

        Submit_button.setBackground(new java.awt.Color(45, 118, 232));
        Submit_button.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Submit_button.setText("Submit");
        Submit_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InnerContentLayout = new javax.swing.GroupLayout(InnerContent);
        InnerContent.setLayout(InnerContentLayout);
        InnerContentLayout.setHorizontalGroup(
            InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerContentLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegNo_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Name_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Reason_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Days_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateFrom_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InnerContentLayout.createSequentialGroup()
                        .addComponent(DateFrom_field, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DateTo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(DateTo_field, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(InnerContentLayout.createSequentialGroup()
                        .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegNo_field, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reason_field, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Days_field, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(21, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InnerContentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        InnerContentLayout.setVerticalGroup(
            InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegNo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegNo_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reason_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reason_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Days_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Days_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateFrom_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateTo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateFrom_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateTo_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(Submit_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Oregon LDO", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Request Leave");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(343, 343, 343))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
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

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(InnerContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
            .addComponent(Footer_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(InnerContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
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
    //2. Change color ends
    
    private void Name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name_fieldActionPerformed

    private void RegNo_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegNo_fieldActionPerformed
        RegNo_field.setText("hello");
    }//GEN-LAST:event_RegNo_fieldActionPerformed

    private void Reason_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reason_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Reason_fieldActionPerformed

    private void Days_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Days_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Days_fieldActionPerformed

    private void DateFrom_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateFrom_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateFrom_fieldActionPerformed

    private void DateTo_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateTo_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateTo_fieldActionPerformed

    private void Submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_buttonActionPerformed
        LocalDateTime currentTime = LocalDateTime.now();
        String today = currentTime.toString();
        requestLeave r = new requestLeave(Name_field.getText(),RegNo_field.getText(),Reason_field.getText(),Days_field.getText(),DateFrom_field.getText(),DateTo_field.getText(),today);
        r.upload();
        JOptionPane.showMessageDialog(null,"Data Submitted..!!");
    }//GEN-LAST:event_Submit_buttonActionPerformed
    
    //Code For Text Filed
    String initialText ="";
    void set(JTextField tf){
        initialText = tf.getText();
        tf.setText("");
        tf.setForeground(Color.BLACK);
    }
    void reSet(JTextField tf){
        tf.setForeground(Color.LIGHT_GRAY);
        tf.setText(initialText);
    }
    private void Name_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Name_fieldFocusGained
        set(Name_field);
    }//GEN-LAST:event_Name_fieldFocusGained

    private void Reason_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Reason_fieldFocusGained
        set(Reason_field);
    }//GEN-LAST:event_Reason_fieldFocusGained

    private void Days_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Days_fieldFocusGained
        set(Days_field);
    }//GEN-LAST:event_Days_fieldFocusGained

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        dispose();
    }//GEN-LAST:event_exitMousePressed

    private void minimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMousePressed
        this.setState(RequestLeave.ICONIFIED);
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
            java.util.logging.Logger.getLogger(RequestLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequestLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequestLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequestLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequestLeave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autonomous;
    private javax.swing.JPanel Content;
    private javax.swing.JTextField DateFrom_field;
    private javax.swing.JLabel DateFrom_txt;
    private javax.swing.JTextField DateTo_field;
    private javax.swing.JLabel DateTo_txt;
    private javax.swing.JTextField Days_field;
    private javax.swing.JLabel Days_txt;
    private javax.swing.JPanel Footer_panel;
    private javax.swing.JLabel Footer_txt;
    private javax.swing.JPanel Head;
    private javax.swing.JPanel InnerContent;
    private javax.swing.JLabel MEC;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField Name_field;
    private javax.swing.JLabel Name_txt;
    private javax.swing.JTextField Reason_field;
    private javax.swing.JLabel Reason_txt;
    private javax.swing.JTextField RegNo_field;
    private javax.swing.JLabel RegNo_txt;
    private javax.swing.JButton Submit_button;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
