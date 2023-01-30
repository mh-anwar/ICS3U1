/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom.components;

import java.awt.Dimension;

/**
 *
 * @author mohammad
 */
public class RadioBtn extends javax.swing.JRadioButton{
    public RadioBtn(String text) {
        // Set text, dimensions of btn, margin and border
        super(text);
        setPreferredSize(new Dimension(150, 40));
        setBackground(super.getBackground());
        setOpaque(false);
        setForeground(super.getForeground());
        setFont(super.getFont().deriveFont(18f));
      }
}