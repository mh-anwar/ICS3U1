/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom.components;

/**
 *
 * @author mohammad
 */
public class HeaderLabel extends javax.swing.JLabel{
    public HeaderLabel(String text, String type) {
        // Set font based on wehther h1 (Header 1) is wanted or not, then set text
        if(type.equals("h1")){
            setFont(new java.awt.Font("Dialog", 0, 48));
        } else if(type.equals("h2")){
            setFont(new java.awt.Font("Dialog", 0, 30));
        }
        setText(text);
      }
}