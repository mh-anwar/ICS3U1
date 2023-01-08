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
        // Set size of main JFrame and center it
        setSize(MAIN_DIMENSION);
        setLocationRelativeTo(null);
        // Stop the program when the GUI is closed
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // Initialize components
        initComponents();
    }
    
    private void initComponents(){
        // Create the main container and add it to page
        MainContainer MainContainer = new MainContainer(MAIN_DIMENSION, this);
        this.add(MainContainer);
    }

}
