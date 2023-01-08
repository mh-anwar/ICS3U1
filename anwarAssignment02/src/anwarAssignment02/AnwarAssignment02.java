/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anwarAssignment02;
import java.util.Scanner;

/**
 *
 * @author s201076699-Mohammad Anwar
 */
public class AnwarAssignment02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int principal;
       int rateofInterest;
       int yearTime;
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to the Simple Interest Calculator!");
       System.out.println("To use the calculator, enter in a number after each "
               + "prompt and then click `Enter`");
       System.out.println("");
       System.out.println("Please enter in the Principal Amount:");
       principal = input.nextInt();
       System.out.println("Please enter in the Rate of Interest:");     
       rateofInterest = input.nextInt();
       System.out.println("Please enter in the Time (in years):");     
       yearTime = input.nextInt();
       int simpleInterest = (principal*rateofInterest*yearTime)/100;
       System.out.println("The simple interest is: "+ simpleInterest);
    }
    
}
