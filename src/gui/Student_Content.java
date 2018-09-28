
package gui;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Student_Content extends javax.swing.JFrame {
    
    //Student Reg No
    public static String RegNo;
    
    public Student_Content(String rno){
        RegNo = rno;
    }

    
    public Student_Content() {
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
        content = new javax.swing.JPanel();
        Attendance_label = new javax.swing.JLabel();
        InternalMarks_label = new javax.swing.JLabel();
        ReqLeave_label = new javax.swing.JLabel();
        Syllabus_label = new javax.swing.JLabel();
        Attendance_txt = new javax.swing.JLabel();
        Syllabus_txt = new javax.swing.JLabel();
        InternalMarks_txt = new javax.swing.JLabel();
        ReqLeave_txt = new javax.swing.JLabel();
        SemResult_label = new javax.swing.JLabel();
        SemResult_txt = new javax.swing.JLabel();
        Feedback_label = new javax.swing.JLabel();
        Feedback_txt = new javax.swing.JLabel();
        Footer_panel = new javax.swing.JPanel();
        Footer_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Portal");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        Head.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(45, 118, 232));
        jLabel1.setFont(new java.awt.Font("Quicksand Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MAHENDRA ENGINEERING COLLEGE");

        jLabel2.setFont(new java.awt.Font("Oregon LDO DemiBold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("(Autonomous)");

        exit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_No_20px.png"))); // NOI18N
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
                .addGap(394, 394, 394)
                .addComponent(jLabel2)
                .addContainerGap(385, Short.MAX_VALUE))
            .addGroup(HeadLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit1))
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
        Heading.setText("Student Portal");

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
        content.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Attendance_label.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        Attendance_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Attendance_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student_pics/Attendance.png"))); // NOI18N
        Attendance_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Attendance_label.setIconTextGap(1);
        Attendance_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Attendance_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Attendance_labelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Attendance_labelMousePressed(evt);
            }
        });

        InternalMarks_label.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        InternalMarks_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InternalMarks_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student_pics/Internal Result_1.png"))); // NOI18N
        InternalMarks_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InternalMarks_label.setIconTextGap(1);
        InternalMarks_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InternalMarks_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InternalMarks_labelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InternalMarks_labelMousePressed(evt);
            }
        });

        ReqLeave_label.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        ReqLeave_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReqLeave_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student_pics/Request Leave.png"))); // NOI18N
        ReqLeave_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReqLeave_label.setIconTextGap(1);
        ReqLeave_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReqLeave_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReqLeave_labelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ReqLeave_labelMousePressed(evt);
            }
        });

        Syllabus_label.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        Syllabus_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Syllabus_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student_pics/Syllabus.png"))); // NOI18N
        Syllabus_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Syllabus_label.setIconTextGap(1);
        Syllabus_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Syllabus_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Syllabus_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Syllabus_labelMouseExited(evt);
            }
        });

        Attendance_txt.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        Attendance_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Attendance_txt.setText("Attendance");

        Syllabus_txt.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        Syllabus_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Syllabus_txt.setText("Syllabus");

        InternalMarks_txt.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        InternalMarks_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InternalMarks_txt.setText("Internal Marks");

        ReqLeave_txt.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        ReqLeave_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReqLeave_txt.setText("Request Leave");

        SemResult_label.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        SemResult_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SemResult_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student_pics/Sem Result.png"))); // NOI18N
        SemResult_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SemResult_label.setIconTextGap(1);
        SemResult_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SemResult_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SemResult_labelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SemResult_labelMousePressed(evt);
            }
        });

        SemResult_txt.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        SemResult_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SemResult_txt.setText("Semester Result");

        Feedback_label.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        Feedback_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Feedback_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student_pics/Feedback_1.png"))); // NOI18N
        Feedback_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Feedback_label.setIconTextGap(1);
        Feedback_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Feedback_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Feedback_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Feedback_labelMouseExited(evt);
            }
        });

        Feedback_txt.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        Feedback_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Feedback_txt.setText("Send Feedback");

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
                .addGap(211, 211, 211)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Attendance_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Attendance_label))
                    .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ReqLeave_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ReqLeave_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(75, 75, 75)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Syllabus_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Syllabus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SemResult_label)
                    .addComponent(SemResult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Feedback_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Feedback_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(InternalMarks_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InternalMarks_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
            .addComponent(Footer_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Syllabus_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(Attendance_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InternalMarks_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Attendance_txt)
                    .addComponent(Syllabus_txt)
                    .addComponent(InternalMarks_txt))
                .addGap(18, 18, 18)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(ReqLeave_label, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReqLeave_txt))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(SemResult_label, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SemResult_txt))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(Feedback_label, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Feedback_txt)))
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
     //1. Code for Panel Movement Ends
    
    private void Attendance_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Attendance_labelMouseEntered
        setColor(Attendance_txt);
    }//GEN-LAST:event_Attendance_labelMouseEntered

    private void Attendance_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Attendance_labelMouseExited
        resetColor(Attendance_txt);
    }//GEN-LAST:event_Attendance_labelMouseExited

    private void Syllabus_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Syllabus_labelMouseEntered
        setColor(Syllabus_txt);
    }//GEN-LAST:event_Syllabus_labelMouseEntered

    private void Syllabus_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Syllabus_labelMouseExited
        resetColor(Syllabus_txt);
    }//GEN-LAST:event_Syllabus_labelMouseExited

    private void InternalMarks_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InternalMarks_labelMouseEntered
        setColor(InternalMarks_txt);
    }//GEN-LAST:event_InternalMarks_labelMouseEntered

    private void InternalMarks_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InternalMarks_labelMouseExited
        resetColor(InternalMarks_txt);
    }//GEN-LAST:event_InternalMarks_labelMouseExited

    private void ReqLeave_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReqLeave_labelMouseEntered
        setColor(ReqLeave_txt);
    }//GEN-LAST:event_ReqLeave_labelMouseEntered

    private void ReqLeave_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReqLeave_labelMouseExited
        resetColor(ReqLeave_txt);
    }//GEN-LAST:event_ReqLeave_labelMouseExited

    private void SemResult_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SemResult_labelMouseEntered
        setColor(SemResult_txt);
    }//GEN-LAST:event_SemResult_labelMouseEntered

    private void SemResult_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SemResult_labelMouseExited
        resetColor(SemResult_txt);
    }//GEN-LAST:event_SemResult_labelMouseExited

    private void Feedback_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Feedback_labelMouseEntered
        setColor(Feedback_txt);
    }//GEN-LAST:event_Feedback_labelMouseEntered

    private void Feedback_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Feedback_labelMouseExited
        resetColor(Feedback_txt);
    }//GEN-LAST:event_Feedback_labelMouseExited

    private void MainPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseReleased
        setOpacity((float)1.0);
    }//GEN-LAST:event_MainPanelMouseReleased

    private void Syllabus_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Syllabus_labelMouseClicked
        new Syllabus().show();
    }//GEN-LAST:event_Syllabus_labelMouseClicked

    private void Feedback_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Feedback_labelMouseClicked
        new Feedback().show();
    }//GEN-LAST:event_Feedback_labelMouseClicked

    private void exit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MousePressed
        dispose();
    }//GEN-LAST:event_exit1MousePressed

    private void minimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMousePressed
        this.setState(Student_Content.ICONIFIED);
    }//GEN-LAST:event_minimizeMousePressed

    private void Attendance_labelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Attendance_labelMousePressed
        Attendance a = new Attendance();
        a.setVisible(true);
    }//GEN-LAST:event_Attendance_labelMousePressed

    private void InternalMarks_labelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InternalMarks_labelMousePressed
        Internal_Marks i = new Internal_Marks();
        i.setVisible(true);
    }//GEN-LAST:event_InternalMarks_labelMousePressed

    private void ReqLeave_labelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReqLeave_labelMousePressed
        RequestLeave r = new RequestLeave(RegNo);
        r.show();
    }//GEN-LAST:event_ReqLeave_labelMousePressed

    private void SemResult_labelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SemResult_labelMousePressed
        SemResult r = new SemResult();
        r.setVisible(true);
    }//GEN-LAST:event_SemResult_labelMousePressed
   
 
    //2. Changing color on mouse enter
    void setColor(JLabel p){
        p.setOpaque(true);
        p.setBackground(new Color(45,118,232));
    }
    
    void resetColor(JLabel p){
        p.setBackground(new Color(240,240,240));
        p.setOpaque(false);
    }
    
    
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
            java.util.logging.Logger.getLogger(Student_Content.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Content.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Content.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Content.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Content().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Attendance_label;
    private javax.swing.JLabel Attendance_txt;
    private javax.swing.JLabel Feedback_label;
    private javax.swing.JLabel Feedback_txt;
    private javax.swing.JPanel Footer_panel;
    private javax.swing.JLabel Footer_txt;
    private javax.swing.JPanel Head;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel InternalMarks_label;
    private javax.swing.JLabel InternalMarks_txt;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel ReqLeave_label;
    private javax.swing.JLabel ReqLeave_txt;
    private javax.swing.JLabel SemResult_label;
    private javax.swing.JLabel SemResult_txt;
    private javax.swing.JPanel SubHeading;
    private javax.swing.JLabel Syllabus_label;
    private javax.swing.JLabel Syllabus_txt;
    private javax.swing.JPanel content;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
