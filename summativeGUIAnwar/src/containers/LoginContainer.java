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
        setSize(MAIN_DIMENSION);
        setLayout(new GridBagLayout());
        initComponents(MainContainer);
    }
    private void initComponents(Container MainContainer){
        HeaderLabel PageTitle = new HeaderLabel("Login to Your Account", "h1");
        GridBagConstraints pageTitleConstraints = new GridConstraints(0, 0, 0, 1, false);

        Textfield EmailField = new Textfield("Enter your Email");
        GridBagConstraints emailFieldConstraints = new GridConstraints(0, 1, 0, 1, false);
        
        PasswordContainer PassField = new PasswordContainer("Enter your Password");
        GridBagConstraints passFieldConstraints = new GridConstraints(0, 2, 0, 1, false);
        
        Button LoginBtn = new Button("Login");
        GridBagConstraints loginBtnConstraints = new GridConstraints(0, 3, 0, 1, true);

        Button ReturnBtn = new Button("Return", true);
        GridBagConstraints returnBtnConstraints = new GridConstraints(0, 5, 0, 1, false);
        

        this.add(PageTitle, pageTitleConstraints);
        this.add(EmailField, emailFieldConstraints);
        this.add(PassField, passFieldConstraints);
        this.add(LoginBtn, loginBtnConstraints);
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
