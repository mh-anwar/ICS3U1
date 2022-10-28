/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfifteenanwar;

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
        // Program 1
        Scanner keyedInput = new Scanner (System.in);   
        int [ ] numbers = new int [20];
        int total = 0;   	 
        System.out.println("Enter twenty integers:");
        for (int i = 0; i <= 19; i = i + 1){
             numbers[i] = keyedInput.nextInt();
        }   	 
        for (int i = 0; i <= 19; i = i + 1){
             total = total + numbers[i];
        }   	 
        System.out.println("The sum of those numbers is:");
        System.out.println(total);

        // Program 2
        // this part is MESSED UP
        String [ ] friends = new String [5];    	  
        System.out.println("Enter the names of five friends:"); 
        for (int i = 0; i <= 4; i = i + 1)
        { 
             friends[i] = keyedInput.nextLine(); 
        }    	  
        System.out.println("The second, third and fourth names were:"); 
        System.out.println("Second: " + friends[1]); 
        System.out.println("Third: " + friends[2]);
        System.out.println("Fourth: " + friends[3]); 
        
        // Program 3
        double [ ] marks = {33.7, 55.1, 32.8, 97.6, 41.6, 49.2, 65.2, 44.6, 88.4}; 
        double total2 = 0; 
        double average; 
        System.out.println("These are the marks:"); 
        for (int i = 0; i<=8; i= i + 1){ 
             System.out.println(marks[i]);} 
        for (int i = 0; i<=8; i= i + 1){ 
             total2 = total2 + marks[i];} 
        average = total2/9; 
        average = average * 10; 
        average = Math.round(average); 
        average = average/10; 
        System.out.println("The average mark is:"); 
        System.out.println(average);    
    }
}
