/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

import custom.components.Button;
import custom.components.GridConstraints;
import custom.components.HeaderLabel;
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
public class LoginContainer extends javax.swing.JPanel{
    public LoginContainer(Dimension MAIN_DIMENSION, Container MainContainer){
        // Set size, layout type of panel, then initialize components
        setSize(MAIN_DIMENSION);
        setLayout(new GridBagLayout());
        initComponents(MainContainer);
    }
    private void initComponents(Container MainContainer){
        // The next few lines: create an element given parameters and set it's pos. on the page with GBC
        HeaderLabel lblPageTitle = new HeaderLabel("Login to Your Account", "h1");
        GridBagConstraints lblPageTitleConstraints = new GridConstraints(0, 0, 0, 1, false);

        Textfield txtEmail = new Textfield("Enter your Email");
        GridBagConstraints txtEmailConstraints = new GridConstraints(0, 1, 0, 1, false);
        
        PasswordContainer txtPass = new PasswordContainer("Enter your Password");
        GridBagConstraints txtPassConstraints = new GridConstraints(0, 2, 0, 1, false);
        
        Button btnLogin = new Button("Login");
        GridBagConstraints btnLoginConstraints = new GridConstraints(0, 3, 0, 1, true);

        Button btnReturn = new Button("Return", true);
        GridBagConstraints btnReturnConstraints = new GridConstraints(0, 5, 0, 1, false);
        
        // Add all created elements to page
        this.add(lblPageTitle, lblPageTitleConstraints);
        this.add(txtEmail, txtEmailConstraints);
        this.add(txtPass, txtPassConstraints);
        this.add(btnLogin, btnLoginConstraints);
        this.add(btnReturn, btnReturnConstraints );
        
        // Listen for click on on btnReturn to display Main Container
        btnReturn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                MainContainer.setVisible(true);
            }
        });
    }
}
