/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

import anwarSummative.GlobalData;
import custom.components.Button;
import custom.components.GridConstraints;
import custom.components.Label;
import custom.components.PasswordContainer;
import custom.components.Textfield;
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
public class SignupContainer extends javax.swing.JPanel{
    public SignupContainer(Dimension MAIN_DIMENSION, Container MainContainer){
        // Set size, layout type of panel, then initialize components
        setBackground(GlobalData.backgroundColor);
        setForeground(GlobalData.foregroundColor);
        setFont(super.getFont());
        setSize(MAIN_DIMENSION);
        setLayout(new GridBagLayout());
        initComponents(MainContainer);
    }
    private void initComponents(Container MainContainer){
        // The next few lines: create an element given parameters and set it's pos.
        Label lblPageTitle = new Label("Signup for an Account", "h1");
        GridBagConstraints lblPageTitleConstraints = new GridConstraints(0, 0, 0, 1, false);

        Textfield txtEmail = new Textfield("Enter your Email");
        GridBagConstraints txtEmailConstraints = new GridConstraints(0, 1, 0, 1, false);
        
        Textfield txtFirstName = new Textfield("Enter your First Name");
        GridBagConstraints txtFirstNameConstraints = new GridConstraints(0, 2, 0, 1, false);
        
        Textfield txtLastName = new Textfield("Enter your Last Name");
        GridBagConstraints txtLastNameConstraints = new GridConstraints(0, 3, 0, 1, false);
        
        PasswordContainer txtPass = new PasswordContainer("Enter your Password");
        GridBagConstraints txtPassConstraints = new GridConstraints(0, 4, 0, 1, false);
        
        Button btnSignup = new Button("Login");
        GridBagConstraints btnSignupConstraints = new GridConstraints(0, 5, 0, 1, true);

        Button btnReturn = new Button("Return", true);
        GridBagConstraints btnReturnConstraints = new GridConstraints(0, 6, 0, 1, false);
        
        // Add all created elements to page
        this.add(lblPageTitle, lblPageTitleConstraints);
        this.add(txtEmail, txtEmailConstraints);
        this.add(txtFirstName, txtFirstNameConstraints);
        this.add(txtLastName, txtLastNameConstraints);
        this.add(txtPass, txtPassConstraints);
        this.add(btnSignup, btnSignupConstraints);
        this.add(btnReturn, btnReturnConstraints );
        
        // Copied from LoginContainer - maybe this should be its own component
        // Listen for click on on ReturnBtn to display Main Container
        btnReturn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                MainContainer.setVisible(true);
            }
        });
    }
}
