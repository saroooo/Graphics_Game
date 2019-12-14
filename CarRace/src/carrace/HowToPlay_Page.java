package carrace;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

public class HowToPlay_Page extends javax.swing.JFrame {
    int width = 580;
    int height = 440;
    String Player1_text = "1st Player Use Up-Left-Down-Right\narrows to control:\n\n"
            + "^ arrow to move: forward\n\n"
            + "> arrow to move: left\n\n"
            + "v arrow to move: backward\n\n"
            + "< arrow to move: right";
    String Player2_text = "2nd Player Use W-A-S-D\nbuttons to control:\n\n"
            + "W button to move: forward\n\n"
            + "A button to move: left\n\n"
            + "S button to move: backward\n\n"
            + "D button to move: right";
    
    public HowToPlay_Page() {
        initComponents();
        //size of the frame , panel , and label
        setSize(width, height);
        jPanel1.setSize(width, height);
        jLabel1.setSize(width, height);
        
        jTextArea1.setText(Player1_text);
        jTextArea2.setText(Player2_text);
        setTitle("How To Play");
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
        FirstPlayer_pane = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        SecondPlayer_Pane = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Back_Btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(580, 440));

        jPanel1.setLayout(null);

        FirstPlayer_pane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        FirstPlayer_pane.setWheelScrollingEnabled(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextArea1.setRows(5);
        FirstPlayer_pane.setViewportView(jTextArea1);

        jPanel1.add(FirstPlayer_pane);
        FirstPlayer_pane.setBounds(60, 80, 200, 180);

        SecondPlayer_Pane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SecondPlayer_Pane.setWheelScrollingEnabled(false);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextArea2.setRows(5);
        SecondPlayer_Pane.setViewportView(jTextArea2);

        jPanel1.add(SecondPlayer_Pane);
        SecondPlayer_Pane.setBounds(310, 80, 200, 180);

        Back_Btn.setBackground(new java.awt.Color(0, 0, 0));
        Back_Btn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Back_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Back_Btn.setText("Back");
        Back_Btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Back_Btn.setBorderPainted(false);
        Back_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Back_Btn);
        Back_Btn.setBounds(205, 25, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CarRace.GUI/HowToPlay.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -30, 580, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BtnActionPerformed
        try {
            // TODO add your handling code here:
            HowToPlay_Page.this.setVisible(false);
            Menu_Page menu_page = new Menu_Page();
            menu_page.setVisible(true);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(HowToPlay_Page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HowToPlay_Page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(HowToPlay_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Back_BtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(HowToPlay_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HowToPlay_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HowToPlay_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HowToPlay_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HowToPlay_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Btn;
    private javax.swing.JScrollPane FirstPlayer_pane;
    private javax.swing.JScrollPane SecondPlayer_Pane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
