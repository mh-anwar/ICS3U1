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
// There is a separate class for Label and HeaderLabel, even though they both extend JLabel. 
// This is done to customize each of them
public class Label extends javax.swing.JLabel{
    public Label(String text) {
        setFont(new java.awt.Font("Dialog", 0, 20));
        setText(text);
      }
}