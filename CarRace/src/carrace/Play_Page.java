package carrace;

import com.sun.opengl.util.Animator;
import com.sun.opengl.util.FPSAnimator;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.io.IOException;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Play_Page extends JFrame implements ActionListener
{
    Menu_Page menu_page;
    JPanel jpanel;
    JButton jbutton_Esc, jbutton_Sound, jbutton_Back, jbutton_Start, jbutton_Pause, jbutton_Resume;
    public JLabel Timer, Score, Lives;
    JTextField Timer_jtf, Score_jtf, Lives_jtf;
    private Timer timer;
    private int count;
    private static int score;
    //int Sound_State = menu_page.Sound_State;
    
    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Play_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        new Play_Page();
//        if (score == 1000) {
//            //level up
//        }
    }
    public Play_Page() throws LineUnavailableException, IOException, UnsupportedAudioFileException
    {
        this.menu_page = new Menu_Page();
        //creat panel
        jpanel = new JPanel();
        //creat buttons
        jbutton_Esc = new JButton("Exit");
        jbutton_Sound = new JButton("Mute");
        jbutton_Back = new JButton("Back");
        jbutton_Start = new JButton("Start");
        jbutton_Pause = new JButton("Pause");
        jbutton_Resume = new JButton("Resume");
        //creat labels
        Timer = new JLabel("Timer: ");
        Score = new JLabel("Score: ");
        Lives = new JLabel("Lives: ");
        //creat textfields
        Timer_jtf = new JTextField("0", 3);
        Score_jtf = new JTextField("0", 5);
        Lives_jtf = new JTextField("3", 3);
        //add all things on the panel with order
        jpanel.add(jbutton_Esc);
        jpanel.add(Box.createHorizontalStrut(50));
        jpanel.add(Timer);
        jpanel.add(Timer_jtf);
        jpanel.add(Box.createHorizontalStrut(50));
        jpanel.add(Score);
        jpanel.add(Score_jtf);
        jpanel.add(Box.createHorizontalStrut(50));
        jpanel.add(Lives);
        jpanel.add(Lives_jtf);
        jpanel.add(Box.createHorizontalStrut(50));
        jpanel.add(jbutton_Back);
        jpanel.add(Box.createHorizontalStrut(50));
        jpanel.add(jbutton_Sound);
        jpanel.add(Box.createHorizontalStrut(50));
        jpanel.add(jbutton_Start);
        jpanel.add(jbutton_Pause).setVisible(false);
        jpanel.add(jbutton_Resume).setVisible(false);
        //add the listener to buttons
        jbutton_Esc.addActionListener(this);
        jbutton_Sound.addActionListener(this);
        jbutton_Back.addActionListener(this);
        jbutton_Start.addActionListener(this);
        jbutton_Pause.addActionListener(this);
        jbutton_Resume.addActionListener(this);
        GLCanvas glcanvas;
        Animator animator;
        Play_Page_Listener listener = new Play_Page_Listener();
        glcanvas = new GLCanvas();
        //glcanvas.addGLEventListener((GLEventListener) listener);
        //glcanvas.addKeyListener((KeyListener) listener);
        getContentPane().add(glcanvas, BorderLayout.CENTER);
        getContentPane().add("North", jpanel);
        animator = new FPSAnimator(15);
        animator.add(glcanvas);
        animator.start();
        setTitle("Car Race");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 750);
        setLocationRelativeTo(null);
        setVisible(true);
        setFocusable(true);
        glcanvas.requestFocus();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbutton_Esc)
        {
            int reply = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit ?","", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
        }
        else if (e.getSource() == jbutton_Back)
        {
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit game ?","", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION)
            {
                Play_Page.this.setVisible(false);
                menu_page.setVisible(true);
                //play_page.dispose();
            }
        }
//        else if (e.getSource() == jbutton_Sound)
//        {
//            if (Sound_State == 0)
//            {
//                //menu_page.Mute();
//                Sound_State = 1;
//                jbutton_Sound.setText("UnMute");
//            }
//            else if (Sound_State == 1)
//            {
//                //menu_page.UnMute();
//                Sound_State = 0;
//                jbutton_Sound.setText("Mute");
//            }
//        }
        if (e.getSource() == jbutton_Start) {
            //let's start the huner games

            StartGame();
            jbutton_Start.setVisible(false);
            jbutton_Pause.setVisible(true);
            jbutton_Resume.setVisible(true);
        } else if (e.getSource() == jbutton_Pause) {
            PauseGame();
        }
        if (e.getSource() == jbutton_Resume) {
            ResumeGame();
        }
    }

    private void StartGame() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //start counter in the text field
                count++;
                Timer_jtf.setText(Integer.toString(count));
            }
        });
        timer.start();
    }

    //Pause Game
    private void PauseGame() {
        timer.stop();
        //start_page.Mute();
    }

    //Resume Game
    private void ResumeGame() {
        timer.start();
        //start_page.UnMute();
    }

    //Game Over
    private void GameOver() {
        timer.stop();
//        obj.add(txt.getText()); //array containing scores
        //new Game_Over_Page().setVisible(true);
    }

}
