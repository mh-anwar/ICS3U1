/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summativeguianwar;

/**
 *
 * @author mohammad
 */
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import custom.components.Button;
import custom.components.GridConstraints;
import custom.components.HeaderLabel;
import custom.components.Label;
import javax.swing.Box;
import javax.swing.JSeparator;
public class SummativeGUIAnwar extends javax.swing.JFrame {

    static final Dimension MAIN_DIMENSION = new Dimension(1000,800);
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SummativeGUIAnwar().setVisible(true);
                
            }
        });
    }
  
    public SummativeGUIAnwar() {
        // Here, because of it's location, all methods being applied to `this` don't need to start with `this.`
        setSize(MAIN_DIMENSION);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        // I think this is a normal-window-manager thing where it shows a close btn, but I can't see with my window manager
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        initComponents();
    }
    
    private void initComponents(){
        
        HeaderLabel PageTitle = new HeaderLabel("Wilson Chess", "h1");
        GridBagConstraints pageTitleConstraints = new GridConstraints(0, 0, 0, 2, false);
        
        HeaderLabel  PageSecTitle = new HeaderLabel("Tournament Leaderboard", "h2");
        GridBagConstraints pageSecTitleConstraints = new GridConstraints(0, 1, 0, 2, false);
        
        Label Instructions = new Label("Click Login if you have an account and click Signup to make one");
        GridBagConstraints instructionsConstraints = new GridConstraints(0,2, 0, 2, false);
        
        Button LoginBtn = new Button("Login");
        GridBagConstraints loginBtnConstraints = new GridConstraints(0, 4, 0.5, 1, true);
        
        Button SignupBtn = new Button("Signup");
        GridBagConstraints signupBtnConstraints = new GridConstraints(1,4, 0.5, 1, true);

        
        this.add(PageTitle, pageTitleConstraints);
        this.add(PageSecTitle, pageSecTitleConstraints);
        this.add(Instructions, instructionsConstraints);
        this.add(LoginBtn, loginBtnConstraints);
        this.add(SignupBtn, signupBtnConstraints);
    }

}
