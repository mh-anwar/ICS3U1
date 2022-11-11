/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsixteenanwar;
// Initially I was going to use JSON, but it works better with Web Languages
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
import java.io.*;
/*
 *
 * @author s201076699
 */
public class AssignmentSixteenAnwar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] names = new String [100];
        String line = "";   
        try {
            BufferedReader br = new BufferedReader(new FileReader("U:\\Documents\\NetBeansProjects\\assignmentSixteenAnwar\\src\\assignmentsixteenanwar\\data.csv"));  
            while ((line = br.readLine()) != null){  
                String[] data = line.split(","); 
                String name = data[0];
                String userName = data[1];
                String email = data[2];
                String post = data[3];
                Double verified = Double.parseDouble(data[4]); //this is a funny variable
                System.out.println(name+" "+ verified);
                
            }  
        } catch (IOException e){  
            e.printStackTrace();  
        }  
    }
}
