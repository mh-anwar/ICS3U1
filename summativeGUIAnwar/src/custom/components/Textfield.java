/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package custom.components;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author mohammad
 */
public class Textfield extends javax.swing.JTextField {
    public Textfield(String text){
        // Set dimensions, border, opacity and font
        setPreferredSize(new Dimension(400,60));
        Border fieldBorder = BorderFactory.createTitledBorder(text);
        setBorder(fieldBorder);
        setOpaque(false);
        Font textFont = new Font("Dialog", 0, 30);
        setFont(textFont);
    }
}
