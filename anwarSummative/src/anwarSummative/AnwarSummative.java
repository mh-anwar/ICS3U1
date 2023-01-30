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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;

public class AnwarSummative extends JFrame {
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
        setUndecorated(false);
        setSize(MAIN_DIMENSION);
        setPreferredSize(MAIN_DIMENSION);
        setLocationRelativeTo(null);
        // Stop the program when the GUI is closed
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // Set Font and aesthetics
        File fontFile = new File("src/CascadiaCode.ttf");
        Font font;
        try {
             font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
        } catch (IOException|FontFormatException e) {
             font = new Font("Dialog", 0, 20);
        }
        setFont(font);
        setBackground(Color.PINK);
        setForeground(Color.BLACK);
        setMode();
        // Create main container and add to frame
        MainContainer MainContainer = new MainContainer(MAIN_DIMENSION, this);
        MainContainer.setBackground(getBackground());
        MainContainer.setForeground(getForeground());
        MainContainer.setFont(getFont());        
        MainContainer.setSize(MAIN_DIMENSION);
        MainContainer.setPreferredSize(MAIN_DIMENSION);
        add(MainContainer);
    }
    public void setMode(){
        // Read file for mode data
        try {
            File programDataFile = new File("src/programData.txt");
            FileReader fileReader = new FileReader(programDataFile);
            BufferedReader fileBuffer = new BufferedReader(fileReader);
            String line;
            // Loop through every line, until the next line is null
            for (int i = 0; (line = fileBuffer.readLine()) != null; i++){
                if(i == 0){
                    System.out.println(line);
                    if(Integer.parseInt(line) == 1){
                        setBackground(new Color(0,4,31));
                        setForeground(new Color(255,255,255));
                    }
                }
            }
            fileBuffer.close();
          } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
          } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
          }
    }
    
    
}
