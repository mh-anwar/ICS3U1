/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsixanwar;
import java.util.Scanner;
/**
 *
 * @author s201076699
 */
public class AssignmentSixAnwar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How much did you spend? ");
        double amountSpent = input.nextDouble();
        
        if(amountSpent >130){
            System.out.println("You saved 35%");
        }
        
    }
    
}
