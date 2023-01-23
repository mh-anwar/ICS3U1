/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom.components;

import anwarSummative.GlobalData;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;


/**
 *
 * @author mohammad
 */

public class Label extends javax.swing.JLabel{
    
    public Label(String text) {
        if(GlobalData.mode.equals("light")){
            setForeground(new Color(255, 255, 255));
        }
        setForeground(new Color(255, 255, 255));
        setText(text);
        setFont(super.getFont().deriveFont(18f));
    }
    
    public Label(String text, String type) {
        // Set foreground based on mode
        setForeground(new Color(255, 255, 255));
        
        // Set font
        float fontSize = type.equals("h1") ? 48f : 32f;
        Font labelFont = super.getFont().deriveFont(fontSize);
        setFont(labelFont);
        
        setText(text);
    }
}