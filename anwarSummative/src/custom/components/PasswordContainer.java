/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package custom.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author mohammad
 */
public class PasswordContainer extends javax.swing.JPanel {
    PasswordField passField;
    public PasswordContainer(String text){
        // Create elements
        passField = new PasswordField(text);
        ShowPasswordBtn showPassword = new ShowPasswordBtn(passField);
        setBackground(super.getBackground());
        setForeground(super.getForeground());
        setOpaque(false);   
        Font textFont = super.getFont();
        setFont(textFont.deriveFont(20f));
        // Add all created elements
        this.add(passField);
        this.add(showPassword);
    }
    
    public char[] getPassword(){
        return passField.getPassword();
    }
    /* Generally, custom components are in their own class/file
     * However, in this case, this components will always be together
     * component. Therefore, it makes sense to have them in one class/file.
    */
    class PasswordField extends javax.swing.JPasswordField{
        public PasswordField(String text){
            // Set dimensions of passfield, set border, set opacity and font
            setPreferredSize(new Dimension(400,60));
            setBackground(super.getBackground());
            setForeground(super.getForeground());
            setOpaque(false);        
            Font textFont = super.getFont();
            setFont(textFont);
            Border fieldBorder = BorderFactory.createTitledBorder(null, 
                text, TitledBorder.LEFT, TitledBorder.TOP, 
                textFont.deriveFont(15f), super.getForeground());
            setBorder(fieldBorder);
        }
    }
    class ShowPasswordBtn extends javax.swing.JToggleButton{
        public ShowPasswordBtn(PasswordField passField){
            // Set dimensions, border
            setPreferredSize(new Dimension(60,60));
            Border fieldBorder = BorderFactory.createTitledBorder("Show");
            setBorder(fieldBorder);
            
            // Get image icon for button
            ImageIcon eyeOpenIcon = new ImageIcon(getClass().getResource("images/eyeOpenEmoji.png"));
            // TODO: this can probably be optimized
            // Get the image from the Image Icon
            Image eyeOpenInitialImage = eyeOpenIcon.getImage();
            
            //Scale the image smoothly to 40x40
            Image eyeOpenResized = eyeOpenInitialImage.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH);
            
            // Set the eyeOpenIcon to the resized image
            eyeOpenIcon = new ImageIcon(eyeOpenResized);
                
            // Set the icon, background, opacity and whether it is selected
            setIcon(eyeOpenIcon);
            setBackground(new Color(0, 0, 0));
            setOpaque(false);
            setSelected(false); // unnecessary
            
            // Listen for clicks and show password based on state
            this.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    // Apparently, since this is inside this class, it doesn't need to use this
                    boolean showPassword = isSelected();
                    if(showPassword){
                        passField.setEchoChar((char)0); 
                    } else{
                        passField.setEchoChar('•');
                    }
                }
            });
        }
    }
}
