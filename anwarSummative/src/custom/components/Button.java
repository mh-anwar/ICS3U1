/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom.components;

import anwarSummative.GlobalData;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author mohammad
 */
public class Button extends javax.swing.JButton{
    public Button(String text) {
        // Set text, dimensions of btn, margin and border
        super(text);
        setPreferredSize(new Dimension(120, 60));
        setBackground(GlobalData.secBackgroundColor);
        setForeground(GlobalData.foregroundColor);
        setMargin(new Insets(5,5,5,5));
        Border btnBorder = BorderFactory.createRaisedBevelBorder();
        setBorder(btnBorder);
        setFont(super.getFont().deriveFont(15f));
      }
    // Method overloading is amazing
    public Button(String text, Boolean increasedMargin) {
        // Set text, dimensions of btn, bacgkround, opacity and border + padding
        super(text);
        setPreferredSize(new Dimension(120, 60));
        /* The color does not do anything, but is used in combination with 
         *setOpaque to use the background containers' color
        */
        setBackground(new Color(0, 0, 0));
        setOpaque(false);
        setForeground(GlobalData.foregroundColor);
        setFont(super.getFont().deriveFont(15f));
        // Create an EmptyBorder with 10 pixels of padding on all sides
        Border paddingBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        setBorder(paddingBorder);
      }    
    // Method overloading is amazing
    public Button(String text, int width, int height) {
        // Set text, dimensions of btn, margin and border
        super(text);
        setPreferredSize(new Dimension(width, height));
        setBackground(GlobalData.secBackgroundColor);
        setForeground(GlobalData.foregroundColor);
        setMargin(new Insets(5,5,5,5));
        Border btnBorder = BorderFactory.createRaisedBevelBorder();
        setBorder(btnBorder);
        setFont(super.getFont().deriveFont(15f));
      }
}