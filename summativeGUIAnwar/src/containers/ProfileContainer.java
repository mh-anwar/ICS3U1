/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

import custom.components.Button;
import custom.components.GridConstraints;
import custom.components.Label;
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

// Currently not connected to any component, to be shown when user logs in
public class ProfileContainer extends javax.swing.JPanel {
    public ProfileContainer(Dimension MAIN_DIMENSION, Container MainContainer){
        // Set size, layout type of panel, then initialize components
        setSize(MAIN_DIMENSION);
        setLayout(new GridBagLayout());
        initComponents(MainContainer);
    }
    private void initComponents(Container MainContainer){
        // The next few lines: create an element given parameters and set it's pos.
        String userInfo = null; // requires code to read files, etc
        Label lblUserInfo = new Label(userInfo);
        GridBagConstraints lblUserInfoConstraints = new GridConstraints(0, 1, 0, 1, false);
        
        Button btnEditInfo= new Button("Edit profile info", true);
        GridBagConstraints btnEditInfoConstraints = new GridConstraints(1, 1, 0, 1, false);
        
        String userGames = null; // requires code to read files, etc
        Label lblUserGames= new Label(userGames);
        GridBagConstraints lblUserGamesConstraints = new GridConstraints(0, 2, 0, 1, false);

        Button btnReturn = new Button("Return", true);
        GridBagConstraints btnReturnConstraints = new GridConstraints(0, 3, 0, 1, false);
        
        // Add all created elements to page
        this.add(lblUserInfo, lblUserInfoConstraints );
        this.add(btnEditInfo, btnEditInfoConstraints );
        this.add(lblUserGames, lblUserGamesConstraints );
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
