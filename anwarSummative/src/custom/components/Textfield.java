/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package custom.components;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
/**
 *
 * @author mohammad
 */
public class Textfield extends javax.swing.JTextField {
    public Textfield(String text){
        // Set dimensions, border, opacity and font
        setPreferredSize(new Dimension(400,60));        
        setBackground(super.getBackground());
        setForeground(super.getForeground());
        setOpaque(false);
        Font textFont = super.getFont();
        setFont(textFont.deriveFont(20f));
        Border fieldBorder = BorderFactory.createTitledBorder(null, 
                text, TitledBorder.LEFT, TitledBorder.TOP, 
                textFont.deriveFont(15f), super.getForeground());
        setBorder(fieldBorder);
    }
}
