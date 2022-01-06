/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom.components;

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
        super(text);
        setPreferredSize(new Dimension(120, 60));
        setBackground(new Color(153, 153, 255));
        setMargin(new Insets(5,5,5,5));
        Border btnBorder = BorderFactory.createLineBorder(Color.BLUE, 1, true);
        setBorder(btnBorder);
      }
    // Method overloading is amazing
    public Button(String text, Boolean increasedMargin) {
        super(text);
        setPreferredSize(new Dimension(120, 60));
        /* The color does not do anything, but is used in combination with 
         *setOpaque to use the background containers' color
        */
        setBackground(new Color(0, 0, 0));
        setOpaque(false);
        // Create an EmptyBorder with 10 pixels of padding on all sides
        Border paddingBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        setBorder(paddingBorder);
      }
}