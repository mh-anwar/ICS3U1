/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

import anwarSummative.AnwarSummative;
import custom.components.Button;
import custom.components.GridConstraints;
import custom.components.Label;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mohammad
 */
public class MainContainer extends javax.swing.JPanel {
    public MainContainer(Dimension MAIN_DIMENSION, javax.swing.JFrame MainFrame){  
        // Set size, layout type of panel, then initialize components
        setLayout(new GridBagLayout());
        initComponents(MAIN_DIMENSION, MainFrame);
    }

    private void initComponents(Dimension MAIN_DIMENSION, javax.swing.JFrame MainFrame){
        // The next few lines: create an element given parameters and set it's pos. on the page with GBC 
        // GBC - Grid Bag Constraints
        
        Label lblPageTitle = new Label("Wilson Chess", "h1");
        GridBagConstraints lblPageTitleConstraints = new GridConstraints(0, 0, 0, 3, false);
        
        Label lblPageSecTitle = new Label("Tournament Leaderboard", "h2");
        GridBagConstraints lblPageSecTitleConstraints = new GridConstraints(0, 1, 0, 3, false);
        
        Label lblInstructions = new Label("Click Login if you have an account and click Signup to make one");
        GridBagConstraints lblInstructionsConstraints = new GridConstraints(0,2, 0, 3, false);
        
        Button btnLogin = new Button("Login");
        GridBagConstraints btnLoginConstraints = new GridConstraints(0, 4, 0.5, 1, true);
        
        Button btnSignup = new Button("Signup");
        GridBagConstraints btnSignupConstraints = new GridConstraints(0,5, 0.5, 1, true);
        
        Button btnLeaderboard = new Button("Leaderboard");
        GridBagConstraints btnLeaderboardConstraints = new GridConstraints(0,6, 0.5, 1, true);
        
        
        Button btnDarkMode = new Button("Change Mode (Restart for Effect)", 350, 60);
        GridBagConstraints btnDarkModeConstraints = new GridConstraints(2,4, 0.5, 1, true);
        
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
        
        btnDarkMode.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Read the current mode, then set it
                int programMode = 0;
                String programFirstName = "";
                try {
                    File programDataFile = new File("src/programData.txt");
                    FileReader fileReader = new FileReader(programDataFile);
                    BufferedReader fileBuffer = new BufferedReader(fileReader);
                    String line;
                    // Loop through every line, until the next line is null
                    for (int i = 0; (line = fileBuffer.readLine()) != null; i++){
                        if(i == 0){
                            programMode = Integer.parseInt(line);
                        } else if(i == 1){
                            programFirstName = line;
                        }
                    }
                    fileBuffer.close();
                  } catch (FileNotFoundException err) {
                    System.out.println("File not found: " + err.getMessage());
                  } catch (IOException err) {
                    System.out.println("Error reading file: " + err.getMessage());
                  }
                // Switch to opposite mode
                if(programMode == 0){
                    programMode = 1;
                } else{
                    programMode = 0;
                }
                // Write new mode
                try {
                    File programDataFile = new File("src/programData.txt");
                    FileWriter fileWriter = new FileWriter(programDataFile);
                    BufferedWriter fileBuffer = new BufferedWriter(fileWriter);
                    fileBuffer.write(Integer.toString(programMode));
                    fileBuffer.newLine();
                    fileBuffer.write(programFirstName);
                    fileBuffer.close();
              } catch (IOException err) {
                    err.printStackTrace();
              }
            }
        });
        // Add all created elements to page
        this.add(lblPageTitle, lblPageTitleConstraints);
        this.add(lblPageSecTitle, lblPageSecTitleConstraints);
        this.add(lblInstructions, lblInstructionsConstraints);
        this.add(btnLogin, btnLoginConstraints);
        this.add(btnSignup, btnSignupConstraints);
        this.add(btnLeaderboard, btnLeaderboardConstraints);
        this.add(btnDarkMode, btnDarkModeConstraints);
    }

}