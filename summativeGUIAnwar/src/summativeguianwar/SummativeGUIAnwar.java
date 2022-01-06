/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summativeguianwar;

/**
 *
 * @author mohammad
 */
import containers.MainContainer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class SummativeGUIAnwar extends javax.swing.JFrame {

    static final Dimension MAIN_DIMENSION = new Dimension(1000,800);
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SummativeGUIAnwar().setVisible(true);
                
            }
        });
    }
  
    public SummativeGUIAnwar() {
        // Here, because of it's location, all methods being applied to `this` don't need to start with `this.`
        setSize(MAIN_DIMENSION);
        setLocationRelativeTo(null);
        // I think this is a normal-window-manager thing where it shows a close btn, but I can't see with my window manager
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        initComponents();
    }
    
    private void initComponents(){
        MainContainer MainContainer = new MainContainer(MAIN_DIMENSION, this);
        this.add(MainContainer);
    }

}
