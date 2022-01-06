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
        setSize(MAIN_DIMENSION);
        setLayout(new GridBagLayout());
        initComponents(MAIN_DIMENSION, MainFrame);
    }
    private void initComponents(Dimension MAIN_DIMENSION, javax.swing.JFrame MainFrame){
        
        HeaderLabel PageTitle = new HeaderLabel("Wilson Chess", "h1");
        GridBagConstraints pageTitleConstraints = new GridConstraints(0, 0, 0, 3, false);
        
        HeaderLabel  PageSecTitle = new HeaderLabel("Tournament Leaderboard", "h2");
        GridBagConstraints pageSecTitleConstraints = new GridConstraints(0, 1, 0, 3, false);
        
        Label Instructions = new Label("Click Login if you have an account and click Signup to make one");
        GridBagConstraints instructionsConstraints = new GridConstraints(0,2, 0, 3, false);
        
        Button LoginBtn = new Button("Login");
        GridBagConstraints loginBtnConstraints = new GridConstraints(0, 4, 0.5, 1, true);
        
        Button SignupBtn = new Button("Signup");
        GridBagConstraints signupBtnConstraints = new GridConstraints(1,4, 0.5, 1, true);
        
        Button LeaderboardBtn = new Button("Leaderboard");
        GridBagConstraints leaderboardBtnConstraints = new GridConstraints(2,4, 0.5, 1, true);
        
        LoginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Component component = (Component)e.getSource();
                Container ParentContainer = component.getParent();
                LoginContainer LoginCont = new LoginContainer(MAIN_DIMENSION, ParentContainer);
                MainFrame.add(LoginCont);
            }
        });
        
        SignupBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Component component = (Component)e.getSource();
                Container ParentContainer = component.getParent();
                SignupContainer SignupCont = new SignupContainer(MAIN_DIMENSION, ParentContainer);
                MainFrame.add(SignupCont);
            }
        });
        
        LeaderboardBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Component component = (Component)e.getSource();
                Container ParentContainer = component.getParent();
                LeaderboardContainer LeaderboardCont = new LeaderboardContainer(MAIN_DIMENSION, ParentContainer);
                MainFrame.add(LeaderboardCont);
            }
        });
        
        this.add(PageTitle, pageTitleConstraints);
        this.add(PageSecTitle, pageSecTitleConstraints);
        this.add(Instructions, instructionsConstraints);
        this.add(LoginBtn, loginBtnConstraints);
        this.add(SignupBtn, signupBtnConstraints);
        this.add(LeaderboardBtn, leaderboardBtnConstraints);
    }
}