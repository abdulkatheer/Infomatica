
package gui;

import com.adobe.acrobat.Viewer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Internal_Marks extends javax.swing.JFrame {

    
    public Internal_Marks() {
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
        Internal1_panel = new javax.swing.JPanel();
        Internal1_label = new javax.swing.JLabel();
        Internal2_panel = new javax.swing.JPanel();
        Internal2_label = new javax.swing.JLabel();
        Internal3_panel = new javax.swing.JPanel();
        Internal3_label = new javax.swing.JLabel();

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

        Internal1_label.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Internal1_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Internal1_label.setText("Internal - 1");
        Internal1_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Internal1_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Internal1_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Internal1_labelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Internal1_panelLayout = new javax.swing.GroupLayout(Internal1_panel);
        Internal1_panel.setLayout(Internal1_panelLayout);
        Internal1_panelLayout.setHorizontalGroup(
            Internal1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Internal1_label, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        Internal1_panelLayout.setVerticalGroup(
            Internal1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Internal1_label, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        Internal2_label.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Internal2_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Internal2_label.setText("Internal - 2");
        Internal2_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Internal2_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Internal2_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Internal2_labelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Internal2_panelLayout = new javax.swing.GroupLayout(Internal2_panel);
        Internal2_panel.setLayout(Internal2_panelLayout);
        Internal2_panelLayout.setHorizontalGroup(
            Internal2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Internal2_label, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        Internal2_panelLayout.setVerticalGroup(
            Internal2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Internal2_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Internal3_label.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Internal3_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Internal3_label.setText("Internal - 3");
        Internal3_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Internal3_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Internal3_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Internal3_labelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Internal3_panelLayout = new javax.swing.GroupLayout(Internal3_panel);
        Internal3_panel.setLayout(Internal3_panelLayout);
        Internal3_panelLayout.setHorizontalGroup(
            Internal3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Internal3_label, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        Internal3_panelLayout.setVerticalGroup(
            Internal3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Internal3_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Footer_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(Internal1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(Internal2_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(Internal3_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Internal1_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Internal3_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Internal2_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
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

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        dispose();
    }//GEN-LAST:event_exitMousePressed

    private void exit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MousePressed
        this.setState(Internal_Marks.ICONIFIED);
    }//GEN-LAST:event_exit1MousePressed

    private void Internal1_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Internal1_labelMouseEntered
        setColor(Internal1_label);
    }//GEN-LAST:event_Internal1_labelMouseEntered

    private void Internal1_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Internal1_labelMouseExited
        resetColor(Internal1_label);
    }//GEN-LAST:event_Internal1_labelMouseExited

    private void Internal2_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Internal2_labelMouseEntered
        setColor(Internal2_label);
    }//GEN-LAST:event_Internal2_labelMouseEntered

    private void Internal2_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Internal2_labelMouseExited
        resetColor(Internal2_label);
    }//GEN-LAST:event_Internal2_labelMouseExited

    private void Internal3_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Internal3_labelMouseEntered
        setColor(Internal3_label);
    }//GEN-LAST:event_Internal3_labelMouseEntered

    private void Internal3_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Internal3_labelMouseExited
        resetColor(Internal3_label);
    }//GEN-LAST:event_Internal3_labelMouseExited

   
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
            java.util.logging.Logger.getLogger(Internal_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Internal_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Internal_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Internal_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Internal_Marks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JPanel Footer_panel;
    private javax.swing.JLabel Footer_txt;
    private javax.swing.JPanel Head;
    private javax.swing.JLabel Internal1_label;
    private javax.swing.JPanel Internal1_panel;
    private javax.swing.JLabel Internal2_label;
    private javax.swing.JPanel Internal2_panel;
    private javax.swing.JLabel Internal3_label;
    private javax.swing.JPanel Internal3_panel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
