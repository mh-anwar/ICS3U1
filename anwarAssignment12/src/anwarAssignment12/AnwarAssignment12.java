/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anwarAssignment12;

import java.util.Scanner;

// @author Mohammad Anwar
public class AnwarAssignment12 {
    // Declare and initialize static class
    static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Print/provide information to user
        System.out.println("-----Mohammad's Cool Counting Program------");
        System.out.println("");
        System.out.println("Please enter your choice:\n" +
                            "1... Count from 0 to 10 by 1\n" +
                            "2... Count from 100 to 0 by 10\n" +
                            "3... Count from 50 to 500 by 50\n" +
                            "4... Count from 6000 to 1000 by 1000");
        
        // Ask user for their number
        System.out.print("Your choice: ");
        int decision = input.nextInt();
        
        //Filler print statements to format properly
        System.out.println("");
        System.out.println("------------------------------");
        
        // Call countLoop based on decision number and provide with parameters
        if(decision == 1){
            countLoop(0, 10, 1);
        } else if(decision == 2){
            countLoop(100, 0, 10);
        } else if(decision == 3){
            countLoop(50, 500, 50);
        } else if(decision == 4){
            countLoop(6000, 1000, 1000);
        }
        
        //Filler print statement to format properly
        System.out.println("------------------------------");
    }
    /* technically this is more efficient than having four for-loops, 
       for the sole reason that this method reduces the amount of print statements
       without the method I would have 22 lines of for-loops and print statements (including a line for the bracket)
       with the method I have 16'ish lines of for-loops and print statemnts
    */
    static void countLoop(int initialNum, int finalNum, int step){
        // Prints out required information, about the initial number, final number and step
        System.out.println("You have chosen to count from " + initialNum + " to " + finalNum + " by " + step);
        
        if(initialNum < finalNum){
            // This condition lets you count up to the final number
            for(int i = initialNum; i <= finalNum; i += step){
                System.out.println(i);
            }    
        } else{
            //This condition lets you count down from the initial number
            for(int i = initialNum; i>= finalNum; i -= step){
                System.out.println(i);
            }
        }
    }
    
}
