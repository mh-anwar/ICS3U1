/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

import custom.components.Button;
import custom.components.GridConstraints;
import custom.components.HeaderLabel;
import custom.components.Label;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mohammad
 */
public class MainContainer extends javax.swing.JPanel {
    public MainContainer(Dimension MAIN_DIMENSION, javax.swing.JFrame MainFrame){  
        // Set size, layout type of panel, then initialize components      
        setSize(MAIN_DIMENSION);
        setLayout(new GridBagLayout());
        initComponents(MAIN_DIMENSION, MainFrame);
    }
    private void initComponents(Dimension MAIN_DIMENSION, javax.swing.JFrame MainFrame){
        // The next few lines: create an element given parameters and set it's pos. on the page with GBC 
        // GBC - Grid Bag Constraints
        HeaderLabel lblPageTitle = new HeaderLabel("Wilson Chess", "h1");
        GridBagConstraints lblPageTitleConstraints = new GridConstraints(0, 0, 0, 3, false);
        
        HeaderLabel  lblPageSecTitle = new HeaderLabel("Tournament Leaderboard", "h2");
        GridBagConstraints lblPageSecTitleConstraints = new GridConstraints(0, 1, 0, 3, false);
        
        Label lblInstructions = new Label("Click Login if you have an account and click Signup to make one");
        GridBagConstraints lblInstructionsConstraints = new GridConstraints(0,2, 0, 3, false);
        
        Button btnLogin = new Button("Login");
        GridBagConstraints btnLoginConstraints = new GridConstraints(0, 4, 0.5, 1, true);
        
        Button btnSignup = new Button("Signup");
        GridBagConstraints btnSignupConstraints = new GridConstraints(1,4, 0.5, 1, true);
        
        Button btnLeaderboard = new Button("Leaderboard");
        GridBagConstraints btnLeaderboardConstraints = new GridConstraints(2,4, 0.5, 1, true);
        
        // Listen for clicks on the following buttons
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hide main container
                setVisible(false);
                // Get the the button
                Component component = (Component)e.getSource();
                // Get parent container
                Container contParent = component.getParent();
                // Create and add login container to Main JFrame
                LoginContainer contLogin = new LoginContainer(MAIN_DIMENSION, contParent);
                MainFrame.add(contLogin);
            }
        });
        
        btnSignup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hide main container
                setVisible(false);
                // Get the the button
                Component component = (Component)e.getSource();
                // Get parent container
                Container contParent = component.getParent();
                // Create and add login container to Main JFrame
                SignupContainer contSignup = new SignupContainer(MAIN_DIMENSION, contParent);
                MainFrame.add(contSignup);
            }
        });
        
        btnLeaderboard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hide main container
                setVisible(false);
                // Get the the button
                Component component = (Component)e.getSource();
                // Get parent container
                Container contParent = component.getParent();
                // Create and add login container to Main JFrame
                LeaderboardContainer contLeaderboard = new LeaderboardContainer(MAIN_DIMENSION, contParent);
                MainFrame.add(contLeaderboard);
            }
        });
        
        // Add all created elements to page
        this.add(lblPageTitle, lblPageTitleConstraints);
        this.add(lblPageSecTitle, lblPageSecTitleConstraints);
        this.add(lblInstructions, lblInstructionsConstraints);
        this.add(btnLogin, btnLoginConstraints);
        this.add(btnSignup, btnSignupConstraints);
        this.add(btnLeaderboard, btnLeaderboardConstraints);
    }
}