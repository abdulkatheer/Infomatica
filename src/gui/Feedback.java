
package gui;

import drivers.feedbackupload;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Feedback extends javax.swing.JFrame {

    
    public Feedback() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Head = new javax.swing.JPanel();
        MEC = new javax.swing.JLabel();
        Autonomous = new javax.swing.JLabel();
        exit2 = new javax.swing.JLabel();
        exit3 = new javax.swing.JLabel();
        minimize = new javax.swing.JPanel();
        SubHeading = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        InnerContent = new javax.swing.JPanel();
        Name_txt = new javax.swing.JLabel();
        reg_no_txt = new javax.swing.JLabel();
        feedback_txt = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        reg_no_field = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedback_field = new javax.swing.JTextArea();
        Submit_button = new javax.swing.JButton();
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

        exit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_No_20px.png"))); // NOI18N
        exit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit2MousePressed(evt);
            }
        });

        exit3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Iconified.png"))); // NOI18N
        exit3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit3MousePressed(evt);
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
                .addComponent(exit3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit2))
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addGroup(HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeadLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(MEC))
                    .addComponent(exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(Autonomous)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        MainPanel.add(Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 110));

        minimize.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Oregon LDO", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Feedback");

        javax.swing.GroupLayout SubHeadingLayout = new javax.swing.GroupLayout(SubHeading);
        SubHeading.setLayout(SubHeadingLayout);
        SubHeadingLayout.setHorizontalGroup(
            SubHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubHeadingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(337, 337, 337))
        );
        SubHeadingLayout.setVerticalGroup(
            SubHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        InnerContent.setBackground(new java.awt.Color(255, 255, 255));

        Name_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Name_txt.setText("Name                           :");

        reg_no_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        reg_no_txt.setText("Register Number       :");

        feedback_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        feedback_txt.setText("Enter Your Feedback :");

        name_field.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        name_field.setForeground(new java.awt.Color(204, 204, 204));
        name_field.setText("Enter Your Name");
        name_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name_fieldFocusGained(evt);
            }
        });

        reg_no_field.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        reg_no_field.setForeground(new java.awt.Color(204, 204, 204));
        reg_no_field.setText("Enter Your Register Number");
        reg_no_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reg_no_fieldFocusGained(evt);
            }
        });

        feedback_field.setColumns(20);
        feedback_field.setFont(new java.awt.Font("Sitka Small", 0, 13)); // NOI18N
        feedback_field.setForeground(new java.awt.Color(204, 204, 204));
        feedback_field.setRows(5);
        feedback_field.setText("Enter Your Feedback.");
        feedback_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                feedback_fieldFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(feedback_field);

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
                .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InnerContentLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(InnerContentLayout.createSequentialGroup()
                                .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(reg_no_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Name_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(feedback_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reg_no_field)
                                    .addComponent(name_field)))))
                    .addGroup(InnerContentLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(Submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        InnerContentLayout.setVerticalGroup(
            InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerContentLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(InnerContentLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InnerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg_no_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reg_no_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(feedback_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout minimizeLayout = new javax.swing.GroupLayout(minimize);
        minimize.setLayout(minimizeLayout);
        minimizeLayout.setHorizontalGroup(
            minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(minimizeLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(InnerContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
            .addComponent(Footer_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        minimizeLayout.setVerticalGroup(
            minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minimizeLayout.createSequentialGroup()
                .addComponent(SubHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InnerContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(Footer_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainPanel.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 860, 430));

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
    

    private void Submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_buttonActionPerformed
        feedbackupload f = new feedbackupload(name_field.getText(),reg_no_field.getText(),feedback_field.getText());
        f.upload();
    }//GEN-LAST:event_Submit_buttonActionPerformed

    //Text Inside Box
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
    
    void set(JTextArea ta){
        initialText = ta.getText();
        ta.setText("");
        ta.setForeground(Color.BLACK);
    }
    void reSet(JTextArea tf){
        tf.setForeground(Color.LIGHT_GRAY);
        tf.setText(initialText);
    }
    private void name_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_fieldFocusGained
        set(name_field);
    }//GEN-LAST:event_name_fieldFocusGained

    private void reg_no_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reg_no_fieldFocusGained
        set(reg_no_field);
    }//GEN-LAST:event_reg_no_fieldFocusGained

    private void feedback_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_feedback_fieldFocusGained
        set(feedback_field);
    }//GEN-LAST:event_feedback_fieldFocusGained

    private void exit2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit2MousePressed
        dispose();
    }//GEN-LAST:event_exit2MousePressed

    private void exit3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit3MousePressed
        this.setState(Feedback.ICONIFIED);
    }//GEN-LAST:event_exit3MousePressed
   
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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autonomous;
    private javax.swing.JPanel Footer_panel;
    private javax.swing.JLabel Footer_txt;
    private javax.swing.JPanel Head;
    private javax.swing.JPanel InnerContent;
    private javax.swing.JLabel MEC;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel Name_txt;
    private javax.swing.JPanel SubHeading;
    private javax.swing.JButton Submit_button;
    private javax.swing.JLabel exit2;
    private javax.swing.JLabel exit3;
    private javax.swing.JTextArea feedback_field;
    private javax.swing.JLabel feedback_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel minimize;
    private javax.swing.JTextField name_field;
    private javax.swing.JTextField reg_no_field;
    private javax.swing.JLabel reg_no_txt;
    // End of variables declaration//GEN-END:variables
}
