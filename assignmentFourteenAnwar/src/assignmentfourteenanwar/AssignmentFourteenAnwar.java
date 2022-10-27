/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfourteenanwar;

import java.util.Scanner;

/**
 *
 * @author s201076699
 */
public class AssignmentFourteenAnwar {
    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      while(true){
        System.out.println("1… Find the value of a number squared ( 5^2 = 5 x 5)\n" +
          "2… Find the value of a number cubed (7^3 = 7 x 7 x 7)\n" +
          "3… Find the value of a number, to any power (2^5 = 2 x 2 x 2 x 2 x 2)\n" +
          "4… Exit");
        System.out.print("Your choice: ");
        int decision = input.nextInt();
        
        // 2^0=1
        if(decision == 1){
            power( 2);
        } else if(decision == 2){
            power(3);
        } else if(decision ==3){
            power(0);
        } else {
          System.out.println("You are now exiting.");
          break;
        }
      }
    }
    // At this point, I am slightly addicted to using methods
    static void power(int power){
        System.out.print("What number would you like to use? ");
        int initialNumber = input.nextInt();
        int finalNumber = 1;   
        if(power == 0){     
            System.out.print("What power would you like to use? ");
            power = input.nextInt();
        } 
        for(int i = 0; i < power; i++ ){
            finalNumber *= initialNumber;
        }
        System.out.println("Your result is: " + finalNumber);
        System.out.println("--------------");
    }
    
}
