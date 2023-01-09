/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package custom.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.border.Border;

/**
 *
 * @author mohammad
 */
public class Challenge extends javax.swing.JFrame{
    public Challenge(){
        // Set size of JFrame, set layout type, center it and make it visible
        setSize(new Dimension(500,600));
        setLayout(new GridBagLayout());
        this.getContentPane().setBackground(Color.BLUE);
        setLocationRelativeTo(null);
        initComponents();
        setVisible(true);
    }
    private void initComponents(){        
        // The next few lines: create an element given parameters and set it's pos. on the page with GBC
        JComboBox<String> comboBoxChallenge = new JComboBox<>(new String[]{"Challenge", "Mohammad Anwar", "Reese Chong"}); // Data will come from file reading
        GridBagConstraints comboBoxChallengeConstraints = new GridConstraints(0, 1, 0, 1, false);
        
        Textfield txtGameResult = new Textfield("Enter Game Result");
        GridBagConstraints txtGameResultConstraints = new GridConstraints(0, 2, 0, 1, false);
        
        // Add all created elements to page
        this.add(comboBoxChallenge, comboBoxChallengeConstraints);
        this.add(txtGameResult, txtGameResultConstraints);
    }
}
