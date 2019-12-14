package carrace;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Menu_Page extends javax.swing.JFrame {

    int width = 580;
    int height = 735;
    GetPlayersName names;
    String Player1_Name;
    String Player2_Name;
    int Sound_State;
    Clip clip;
    AudioInputStream inputStream;
    int state = 0;
    private long clipTime;
    public Menu_Page() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        initComponents();
        //size of the frame , panel , and label
        setSize(width, height);
        jPanel1.setSize(width, height);
        jLabel1.setSize(width, height);
        Play_Btn.setSize(330, 60);
        setTitle("Main Menu");
        music();
        //frame appeare in the center
        centerWindow(this);
    }

    public void centerWindow(Component frame) {
        Dimension screenSize
                = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        frame.setLocation(
                (screenSize.width - frameSize.width) >> 1,
                (screenSize.height - frameSize.height) >> 1
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Play_Btn = new javax.swing.JButton();
        HowToPlay_Btn = new javax.swing.JButton();
        Levels_Btn = new javax.swing.JButton();
        HightScores_Btn = new javax.swing.JButton();
        Exit_Btn = new javax.swing.JButton();
        Mute_Btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 700));

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 700));
        jPanel1.setLayout(null);

        Play_Btn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Play_Btn.setForeground(new java.awt.Color(0, 0, 0));
        Play_Btn.setText("PLAY");
        Play_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Play_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Play_Btn);
        Play_Btn.setBounds(122, 93, 310, 60);

        HowToPlay_Btn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        HowToPlay_Btn.setForeground(new java.awt.Color(0, 0, 0));
        HowToPlay_Btn.setText("How To Play");
        HowToPlay_Btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HowToPlay_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HowToPlay_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HowToPlay_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(HowToPlay_Btn);
        HowToPlay_Btn.setBounds(160, 280, 240, 60);

        Levels_Btn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Levels_Btn.setForeground(new java.awt.Color(0, 0, 0));
        Levels_Btn.setText("Levels");
        Levels_Btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Levels_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Levels_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Levels_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Levels_Btn);
        Levels_Btn.setBounds(170, 380, 220, 60);

        HightScores_Btn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        HightScores_Btn.setForeground(new java.awt.Color(0, 0, 0));
        HightScores_Btn.setText("High Scores");
        HightScores_Btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HightScores_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HightScores_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HightScores_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(HightScores_Btn);
        HightScores_Btn.setBounds(180, 480, 200, 60);

        Exit_Btn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Exit_Btn.setForeground(new java.awt.Color(0, 0, 0));
        Exit_Btn.setText("EXIT");
        Exit_Btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Exit_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Exit_Btn);
        Exit_Btn.setBounds(370, 640, 190, 60);

        Mute_Btn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Mute_Btn.setForeground(new java.awt.Color(0, 0, 0));
        Mute_Btn.setText("Mute");
        Mute_Btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mute_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mute_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mute_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Mute_Btn);
        Mute_Btn.setBounds(410, 10, 150, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CarRace.GUI/menu.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 700));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -40, 570, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HowToPlay_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HowToPlay_BtnActionPerformed
        // TODO add your handling code here:
        Menu_Page.this.setVisible(false);
        HowToPlay_Page howtoplay_page = new HowToPlay_Page();
        howtoplay_page.setVisible(true);
    }//GEN-LAST:event_HowToPlay_BtnActionPerformed

    private void Exit_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_BtnActionPerformed
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit ?", "", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_Exit_BtnActionPerformed

    private void Play_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play_BtnActionPerformed
        names = new GetPlayersName();
        if (names.close) {
            Menu_Page.this.setVisible(false);
        }
    }//GEN-LAST:event_Play_BtnActionPerformed

    private void HightScores_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HightScores_BtnActionPerformed
        // TODO add your handling code here:
        Menu_Page.this.setVisible(false);
        HighScore_Page highscore_page = new HighScore_Page();
        highscore_page.setVisible(true);
    }//GEN-LAST:event_HightScores_BtnActionPerformed

    private void Levels_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Levels_BtnActionPerformed
        // TODO add your handling code here:
        Menu_Page.this.setVisible(false);
        Levels_Page levels_page = new Levels_Page();
        levels_page.setVisible(true);
    }//GEN-LAST:event_Levels_BtnActionPerformed

    private void Mute_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mute_BtnActionPerformed
        // TODO add your handling code here:
        if (state == 0) {
            Mute();
            state = 1;
            Mute_Btn.setText("UnMute");
        } else if (state == 1) {
            UnMute();
            state = 0;
            Mute_Btn.setText("Mute");
        }

    }//GEN-LAST:event_Mute_BtnActionPerformed
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
            java.util.logging.Logger.getLogger(Menu_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu_Page().setVisible(true);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(Menu_Page.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Menu_Page.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(Menu_Page.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    public void music() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        inputStream = AudioSystem.getAudioInputStream(new File("CarRace_Menu.wav").getAbsoluteFile());
        clip = AudioSystem.getClip();
        clip.open(inputStream);
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    //Resume Music
    public void UnMute()
    {
        clipTime = clip.getMicrosecondPosition();
        clip.stop();
        clip.setMicrosecondPosition(clipTime);
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    //pause music
    public void Mute()
    { 
        clip.stop();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit_Btn;
    private javax.swing.JButton HightScores_Btn;
    private javax.swing.JButton HowToPlay_Btn;
    private javax.swing.JButton Levels_Btn;
    private javax.swing.JButton Mute_Btn;
    private javax.swing.JButton Play_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
