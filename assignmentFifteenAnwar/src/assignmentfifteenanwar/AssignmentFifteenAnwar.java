/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfifteenanwar;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author s201076699
 */
public class AssignmentFifteenAnwar {
    
    static Scanner input = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare and initalize Scanner for input
        Scanner keyedInput = new Scanner (System.in);
        
/* Program 1 */
        // Declare and initialize array to store input numbers
        int [ ] numbers = new int [20];
        // Declare and initialize variable to store total (of all numbers added up)
        int total = 0;
        // Prompt user for input
        System.out.println("Enter twenty integers:");
        // Request input twenty times
        for (int i = 0; i <= 19; i = i + 1){
             numbers[i] = keyedInput.nextInt();
        }
        // Loop through array of input and add inputs to total
        for (int i = 0; i <= 19; i = i + 1){
             total = total + numbers[i];
        }
        // Display total
        System.out.println("The sum of those numbers is:");
        System.out.println(total);

/* Program 2 */
        // Declare and initiliaze string to hold input strings
        String [ ] friends = new String [5];    
        // Prompt user for input
        System.out.println("Enter the names of five friends:"); 
        // Request input 5 times
        for (int i = 0; i <= 4; i = i + 1){ 
             friends[i] = keyedInput.next(); 
        }    	  
        // Display 2nd, 3rd and 4th friends
        System.out.println("The second, third and fourth names were:"); 
        System.out.println("First: " + friends[0]); 
        System.out.println("Second: " + friends[1]); 
        System.out.println("Third: " + friends[2]);
        System.out.println("Fourth: " + friends[3]); 
        
/* Program 3 */
        // Declare and initialize double array of all marks
        double [ ] marks = {33.7, 55.1, 32.8, 97.6, 41.6, 49.2, 65.2, 44.6, 88.4}; 
        
        // the code provided had this as total, but that causes an error
        // Declare and initalize total to add all averages together
        double total2 = 0;
        
        // Declare average (to store average later)
        double average; 
        
        System.out.println("These are the marks:"); 
        // Loop through marks array and display all marks
        for (int i = 0; i<=8; i= i + 1){ 
             System.out.println(marks[i]);
        } 
        
        // Loop through marks array and add all marks (this could have been done in the last step)
        for (int i = 0; i<=8; i= i + 1){ 
             total2 += marks[i];
        }
        
        // Divide sum of marks by number of elements
        average = total2/9; 
        
        // Multiply average by 10 (this preserves accuracy)
        average = average * 10; 
        
        // Round average
        average = Math.round(average);
        
        // Divide average by 10
        average = average/10; 
        
        // Display final mark
        System.out.println("The average mark is:"); 
        System.out.println(average);    
    }
}
