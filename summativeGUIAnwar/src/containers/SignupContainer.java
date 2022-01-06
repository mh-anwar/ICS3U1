/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

import custom.components.Button;
import custom.components.GridConstraints;
import custom.components.HeaderLabel;
import custom.components.Label;
import custom.components.PasswordContainer;
import custom.components.Textfield;
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
public class SignupContainer extends javax.swing.JPanel{
    public SignupContainer(Dimension MAIN_DIMENSION, Container MainContainer){
        setSize(MAIN_DIMENSION);
        setLayout(new GridBagLayout());
        initComponents(MainContainer);
    }
    private void initComponents(Container MainContainer){
        HeaderLabel PageTitle = new HeaderLabel("Signup for an Account", "h1");
        GridBagConstraints pageTitleConstraints = new GridConstraints(0, 0, 0, 1, false);

        Textfield EmailField = new Textfield("Enter your Email");
        GridBagConstraints emailFieldConstraints = new GridConstraints(0, 1, 0, 1, false);
        
        Textfield FirstNameField = new Textfield("Enter your First Name");
        GridBagConstraints firstNameFieldConstraints = new GridConstraints(0, 2, 0, 1, false);
        
        Textfield LastNameField = new Textfield("Enter your Last Name");
        GridBagConstraints lastNameFieldConstraints = new GridConstraints(0, 3, 0, 1, false);
        
        PasswordContainer PassField = new PasswordContainer("Enter your Password");
        GridBagConstraints passFieldConstraints = new GridConstraints(0, 4, 0, 1, false);
        
        Button SignupBtn = new Button("Login");
        GridBagConstraints signupBtnConstraints = new GridConstraints(0, 5, 0, 1, true);

        Button ReturnBtn = new Button("Return", true);
        GridBagConstraints returnBtnConstraints = new GridConstraints(0, 6, 0, 1, false);
        

        this.add(PageTitle, pageTitleConstraints);
        this.add(EmailField, emailFieldConstraints);
        this.add(FirstNameField, firstNameFieldConstraints);
        this.add(LastNameField, lastNameFieldConstraints);
        this.add(PassField, passFieldConstraints);
        this.add(SignupBtn, signupBtnConstraints);
        this.add(ReturnBtn, returnBtnConstraints );
        
        ReturnBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                MainContainer.setVisible(true);
            }
        });
    }
}
