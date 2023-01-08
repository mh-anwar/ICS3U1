package anwarAssignment14;
import java.util.Scanner;
// @author Mohammad Anwar

public class AnwarAssignment14 {
    // Initialize scanner for user input
    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      while(true){
        // Print out options menu
        System.out.println(
            "1… Find the value of a number squared ( 5^2 = 5 x 5)\n" +
            "2… Find the value of a number cubed (7^3 = 7 x 7 x 7)\n" +
            "3… Find the value of a number, to any power (2^5 = 2 x 2 x 2 x 2 x 2)\n" +
            "4… Exit");
        
        // Prompt and request user choice
        System.out.print("Your choice: ");
        int decision = input.nextInt();
        
        // Apply different power based on decision
        if(decision == 1){
            power(2);
        } else if(decision == 2){
            power(3);
        } else if(decision == 3){
            // The power is not actually 0, but rather 0 notifies the method that something else needs to be done
            power(0);
        } else if(decision == 4) {
          // Break the loop in the even that the user chooses 4
          System.out.println("You are now exiting.");
          break;
        }
      }
    }
    // At this point, I am slightly addicted to using methods
    static void power(int power){
        // Prompt and request for initial number
        System.out.print("What number would you like to use? ");
        int initialNumber = input.nextInt();
        
        // This is the final product of the initial number to the power
        // it starts at 1 to ensure that x^0 = 1 (x being any real number)
        int finalNumber = 1;   
        
        // In the event the user chooses option 3
        if(power == 0){     
            System.out.print("What power would you like to use? ");
            power = input.nextInt();
        } 
        
        // Loop and multiply the initial number for the amount of times (the power) to the final product
        for(int i = 0; i < power; i++ ){
            finalNumber *= initialNumber;
        }
        
        // Provide the results
        System.out.println("The result of " + initialNumber + " to the power of "+ power + " is: " + finalNumber);
        System.out.println("--------------");
    }
    
}
