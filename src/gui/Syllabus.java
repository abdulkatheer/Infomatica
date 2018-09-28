
package gui;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Syllabus extends javax.swing.JFrame {

    
    public Syllabus() {
        initComponents();
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
        SubHeading = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Sem1_panel = new javax.swing.JPanel();
        Sem1_txt = new javax.swing.JLabel();
        Sem2_panel = new javax.swing.JPanel();
        Sem2_txt = new javax.swing.JLabel();
        Sem3_panel = new javax.swing.JPanel();
        Sem3_txt = new javax.swing.JLabel();
        Sem4_panel = new javax.swing.JPanel();
        Sem4_txt = new javax.swing.JLabel();
        Sem5_panel = new javax.swing.JPanel();
        Sem5_txt = new javax.swing.JLabel();
        Sem6_panel = new javax.swing.JPanel();
        Sem6_txt = new javax.swing.JLabel();
        Sem7_panel = new javax.swing.JPanel();
        Sem7_txt = new javax.swing.JLabel();
        Sem8_panel = new javax.swing.JPanel();
        Sem8_txt = new javax.swing.JLabel();
        Seperator = new javax.swing.JSeparator();
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
                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel1.setFont(new java.awt.Font("Oregon LDO", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Syllabus");

        javax.swing.GroupLayout SubHeadingLayout = new javax.swing.GroupLayout(SubHeading);
        SubHeading.setLayout(SubHeadingLayout);
        SubHeadingLayout.setHorizontalGroup(
            SubHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubHeadingLayout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SubHeadingLayout.setVerticalGroup(
            SubHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        Sem1_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Sem1_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sem1_txt.setText("Semester I");
        Sem1_txt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Sem1_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sem1_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sem1_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sem1_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Sem1_panelLayout = new javax.swing.GroupLayout(Sem1_panel);
        Sem1_panel.setLayout(Sem1_panelLayout);
        Sem1_panelLayout.setHorizontalGroup(
            Sem1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem1_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        Sem1_panelLayout.setVerticalGroup(
            Sem1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem1_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        Sem2_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Sem2_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sem2_txt.setText("Semester II");
        Sem2_txt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Sem2_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sem2_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sem2_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sem2_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Sem2_panelLayout = new javax.swing.GroupLayout(Sem2_panel);
        Sem2_panel.setLayout(Sem2_panelLayout);
        Sem2_panelLayout.setHorizontalGroup(
            Sem2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem2_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        Sem2_panelLayout.setVerticalGroup(
            Sem2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem2_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Sem3_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Sem3_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sem3_txt.setText("Semester III");
        Sem3_txt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Sem3_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sem3_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sem3_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sem3_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Sem3_panelLayout = new javax.swing.GroupLayout(Sem3_panel);
        Sem3_panel.setLayout(Sem3_panelLayout);
        Sem3_panelLayout.setHorizontalGroup(
            Sem3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem3_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        Sem3_panelLayout.setVerticalGroup(
            Sem3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem3_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Sem4_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Sem4_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sem4_txt.setText("Semester IV");
        Sem4_txt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Sem4_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sem4_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sem4_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sem4_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Sem4_panelLayout = new javax.swing.GroupLayout(Sem4_panel);
        Sem4_panel.setLayout(Sem4_panelLayout);
        Sem4_panelLayout.setHorizontalGroup(
            Sem4_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem4_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        Sem4_panelLayout.setVerticalGroup(
            Sem4_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem4_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Sem5_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Sem5_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sem5_txt.setText("Semester V");
        Sem5_txt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Sem5_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sem5_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sem5_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sem5_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Sem5_panelLayout = new javax.swing.GroupLayout(Sem5_panel);
        Sem5_panel.setLayout(Sem5_panelLayout);
        Sem5_panelLayout.setHorizontalGroup(
            Sem5_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem5_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        Sem5_panelLayout.setVerticalGroup(
            Sem5_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem5_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Sem6_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Sem6_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sem6_txt.setText("Semester VI");
        Sem6_txt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Sem6_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sem6_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sem6_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sem6_txtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Sem6_txtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Sem6_panelLayout = new javax.swing.GroupLayout(Sem6_panel);
        Sem6_panel.setLayout(Sem6_panelLayout);
        Sem6_panelLayout.setHorizontalGroup(
            Sem6_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem6_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        Sem6_panelLayout.setVerticalGroup(
            Sem6_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem6_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Sem7_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Sem7_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sem7_txt.setText("Semester VII");
        Sem7_txt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Sem7_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sem7_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sem7_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sem7_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Sem7_panelLayout = new javax.swing.GroupLayout(Sem7_panel);
        Sem7_panel.setLayout(Sem7_panelLayout);
        Sem7_panelLayout.setHorizontalGroup(
            Sem7_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem7_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        Sem7_panelLayout.setVerticalGroup(
            Sem7_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem7_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Sem8_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Sem8_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sem8_txt.setText("Semester VIII");
        Sem8_txt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Sem8_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sem8_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sem8_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sem8_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Sem8_panelLayout = new javax.swing.GroupLayout(Sem8_panel);
        Sem8_panel.setLayout(Sem8_panelLayout);
        Sem8_panelLayout.setHorizontalGroup(
            Sem8_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem8_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        Sem8_panelLayout.setVerticalGroup(
            Sem8_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sem8_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        Seperator.setForeground(new java.awt.Color(45, 118, 232));

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
            .addComponent(SubHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addComponent(Sem5_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Sem6_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Sem7_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(Sem8_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addComponent(Sem1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Sem2_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Sem3_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(Sem4_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
            .addComponent(Footer_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addComponent(SubHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Sem1_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sem2_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sem3_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sem4_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Sem5_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sem6_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sem7_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sem8_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
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

    private void Sem1_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem1_txtMouseEntered
        setColor(Sem1_txt);
    }//GEN-LAST:event_Sem1_txtMouseEntered

    private void Sem1_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem1_txtMouseExited
        resetColor(Sem1_txt);
    }//GEN-LAST:event_Sem1_txtMouseExited

    private void Sem2_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem2_txtMouseEntered
        setColor(Sem2_txt);
    }//GEN-LAST:event_Sem2_txtMouseEntered

    private void Sem2_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem2_txtMouseExited
        resetColor(Sem2_txt);
    }//GEN-LAST:event_Sem2_txtMouseExited

    private void Sem3_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem3_txtMouseEntered
        setColor(Sem3_txt);
    }//GEN-LAST:event_Sem3_txtMouseEntered

    private void Sem3_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem3_txtMouseExited
        resetColor(Sem3_txt);
    }//GEN-LAST:event_Sem3_txtMouseExited

    private void Sem4_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem4_txtMouseEntered
        setColor(Sem4_txt);
    }//GEN-LAST:event_Sem4_txtMouseEntered

    private void Sem4_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem4_txtMouseExited
        resetColor(Sem4_txt);
    }//GEN-LAST:event_Sem4_txtMouseExited

    private void Sem5_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem5_txtMouseEntered
        setColor(Sem5_txt);
    }//GEN-LAST:event_Sem5_txtMouseEntered

    private void Sem5_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem5_txtMouseExited
        resetColor(Sem5_txt);
    }//GEN-LAST:event_Sem5_txtMouseExited

    private void Sem6_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem6_txtMouseEntered
        setColor(Sem6_txt);
    }//GEN-LAST:event_Sem6_txtMouseEntered

    private void Sem6_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem6_txtMouseExited
        resetColor(Sem6_txt);
    }//GEN-LAST:event_Sem6_txtMouseExited

    private void Sem7_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem7_txtMouseEntered
        setColor(Sem7_txt);
    }//GEN-LAST:event_Sem7_txtMouseEntered

    private void Sem7_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem7_txtMouseExited
        resetColor(Sem7_txt);
    }//GEN-LAST:event_Sem7_txtMouseExited

    private void Sem8_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem8_txtMouseEntered
        setColor(Sem8_txt);
    }//GEN-LAST:event_Sem8_txtMouseEntered

    private void Sem8_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem8_txtMouseExited
        resetColor(Sem8_txt);
    }//GEN-LAST:event_Sem8_txtMouseExited

    private void Sem6_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sem6_txtMousePressed
        new Sem_6_Syllabus().show();
    }//GEN-LAST:event_Sem6_txtMousePressed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        dispose();
    }//GEN-LAST:event_exitMousePressed

    private void minimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMousePressed
        this.setState(Syllabus.ICONIFIED);
    }//GEN-LAST:event_minimizeMousePressed
    //2. Change color ends
    //3. Maximize button
    static boolean g_maximized = true;    
    
    
   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Syllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Syllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Syllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Syllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Syllabus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autonomous;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel Footer_panel;
    private javax.swing.JLabel Footer_txt;
    private javax.swing.JPanel Head;
    private javax.swing.JLabel MEC;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Sem1_panel;
    private javax.swing.JLabel Sem1_txt;
    private javax.swing.JPanel Sem2_panel;
    private javax.swing.JLabel Sem2_txt;
    private javax.swing.JPanel Sem3_panel;
    private javax.swing.JLabel Sem3_txt;
    private javax.swing.JPanel Sem4_panel;
    private javax.swing.JLabel Sem4_txt;
    private javax.swing.JPanel Sem5_panel;
    private javax.swing.JLabel Sem5_txt;
    private javax.swing.JPanel Sem6_panel;
    private javax.swing.JLabel Sem6_txt;
    private javax.swing.JPanel Sem7_panel;
    private javax.swing.JLabel Sem7_txt;
    private javax.swing.JPanel Sem8_panel;
    private javax.swing.JLabel Sem8_txt;
    private javax.swing.JSeparator Seperator;
    private javax.swing.JPanel SubHeading;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
