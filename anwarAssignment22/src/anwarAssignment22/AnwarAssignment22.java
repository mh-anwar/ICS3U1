/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anwarAssignment22;

import java.util.Scanner;

/**
 *
 * @author s201076699
 */
public class AnwarAssignment22 {

    /**
     * @param args the command line arguments
     */
    static Scanner keyedInput = new Scanner(System.in);
    public static void main(String[] args) {
        // GT = Greater Than, LT = Less Than
        boolean userExit = false; // declare variable to start initial while loop
        while(userExit == false){
            // Request input greater than 6 letters
            System.out.println("Enter a string greater than 6 letters");
            String inputLengthGTSix = keyedInput.nextLine();
            
            // Progress and stay in next stage when input is greater than 6 letters
            while(inputLengthGTSix.length() > 6){
                // Request input that contains at last one lowercase `a`
                System.out.println("Enter a string that contains at least one lowercase `a`");
                String inputWithA = keyedInput.nextLine();
                
                // Progress and stay in next stage when input contains at least one `a`
                while(inputWithA.contains("a")){
                    // Request input that is between 5-15 characters long and doesnt contain a `z`
                    System.out.println("Enter a string between 5 and 15 characters long and doesn't contain z");
                    String inputLengthyWithoutZ= keyedInput.nextLine();
                    
                    // Progress and stay in next stage when input is between 5-15 characters long and doesnt contain a `z`
                    while(inputLengthyWithoutZ.length() >= 5 && inputLengthyWithoutZ.length() <= 15 && !inputLengthyWithoutZ.contains("z")){
                        // Request string input that is GT/equal 5 and LT/equal 500
                        System.out.println("Enter an integer between 5 and 500");
                        String inputGTFive = keyedInput.nextLine();
                        // Declare integer version of input,to prevent errors of variable not being initialized
                        int intInputGTFive = 0;
                        // Try to parse an int from the string, if there is a string, then catch, do nothing and re-loop
                        try{
                            intInputGTFive = Integer.parseInt(inputGTFive);
                        } catch (Exception e){}
                        // Progress and stay in next stage when integer input is GT/equal 5 and LT/equal 500
                        while(intInputGTFive >= 5 && intInputGTFive <= 500){
                            // Request string input that is less than 0
                            System.out.println("Enter a negative integer");
                            String inputLTZero = keyedInput.nextLine();
                            // Declare integer version of input,to prevent errors of variable not being initialized
                            int intInputLTZero = 0;
                            // Try to parse an int from the string, if there is a string, then catch, do nothing and re-loop
                            try{
                                intInputLTZero = Integer.parseInt(inputLTZero);
                            } catch (Exception e){}
                            // Progress and stay in next stage when integer input is less than 0
                            while(intInputLTZero < 0){
                                System.out.println("Enter a positive, odd integer");
                                // Variable name based on first condition
                                String inputEven = keyedInput.nextLine();
                                // Declare integer version of input,to prevent errors of variable not being initialized
                                int intInputEven = 0;
                                // Try to parse an int from the string, if there is a string, then catch, do nothing and re-loop
                                try{
                                    intInputEven = Integer.parseInt(inputEven);
                                } catch (Exception e){}
                                // Progress to last stage when integer input is even and greater than 0
                                while(intInputEven %2 == 1 && intInputEven > 0 ){
                                    // Output congratulatory messages
                                    System.out.println("Well done you have passed all the tests!");
                                    // Exit program with System.exit instead of changing userExit to true, because there is nested while loops
                                    System.exit(0);
                                }   
                            }
                        }
                    }
                }
            }
        }
    }
    
}
