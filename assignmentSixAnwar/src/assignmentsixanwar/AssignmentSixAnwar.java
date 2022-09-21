 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsixanwar;
import java.util.Scanner;
import  java.text.DecimalFormat;
/**
 *
 * @author s201076699 - Mohammad Anwar
 */
public class AssignmentSixAnwar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare the decimal format
        DecimalFormat df = new DecimalFormat("#.00");
        //Declare the scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to provide input
        System.out.print("How much did you spend? ");
        
        /*  Declare and initialize the amount spent, which requests an input
             since it will never change, it is a final value double*/
        final double amountSpent = input.nextDouble();
        
        //Declare and initialize the percent saved, the amount saved and the final price
        double percentSaved = 0;
        double amountSaved;
        double finalPrice;
        
        // Declare the percentage of money saved, based on the amount spent
        if(amountSpent >130){
            percentSaved = 0.35;
        }
        else if(amountSpent >90.01){
            percentSaved = 0.25;
        }
        else if(amountSpent >50.01){
            percentSaved = 0.20;
        }
        else if(amountSpent >0.001){
            percentSaved = 0.15;
        }
        
        // Calculate the amount of money saved
        amountSaved = amountSpent * percentSaved;
        
        // Subtract the amount of money saved from the amount of money spent
        finalPrice = amountSpent - amountSaved;
        
        // Fun fact: Netbeans doesn't support emoji's...😊
        // Print empty statements to keep it looking clean
        // Then print the amount spend, percentage saved, amount saved and final price (all formatted with the decimalFormat)
        System.out.println("");
        System.out.println("You spent: $"+ df.format(amountSpent));
        System.out.println("");
        System.out.println("You will save: " + percentSaved*100 + "% which is: $" + df.format(amountSaved));
        System.out.println("Your final price is:  $" + df.format(finalPrice));
    }
    
}
