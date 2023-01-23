/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anwarSummative;

/**
 *
 * @author mohammad
 */
import containers.MainContainer;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnwarSummative extends javax.swing.JFrame {

    static final Dimension MAIN_DIMENSION = new Dimension(1000,800);
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnwarSummative().setVisible(true);
                
            }
        });
    }
  
    public AnwarSummative() {
        // Create undecorated, rounded JFrame with preset size in the middle of the screen
        setUndecorated(true);
        setShape(new RoundRectangle2D.Double(0, 0, 1000,800, 50, 50));
        setSize(MAIN_DIMENSION);
        setLocationRelativeTo(null);
        // Stop the program when the GUI is closed
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.RED);
        File fontFile = new File("src/CascadiaCode.ttf");
        Font font;
        try {
             font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
        } catch (IOException|FontFormatException e) {
             font = new Font("Dialog", 0, 20);
        }
        setFont(font);
        
        MainContainer MainContainer = new MainContainer(MAIN_DIMENSION, this){
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(getBackground());
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        MainContainer.setBackground(getBackground());
        add(MainContainer);
    }
    
    private void initComponents(){
        // Create the main container and add it to page
        MainContainer MainContainer = new MainContainer(MAIN_DIMENSION, this);
        this.add(MainContainer);
    }

}
