/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmenttwentytwoanwar;

import java.util.Scanner;

/**
 *
 * @author s201076699
 */
public class AssignmentTwentyTwoAnwar {

    /**
     * @param args the command line arguments
     */
    static Scanner keyedInput = new Scanner(System.in);
    public static void main(String[] args) {
        boolean userExit = false;
        while(userExit == false){
            System.out.println("Enter a string greater than 6 letters");
            String input = keyedInput.nextLine();
            if(input.length() > 6){
                System.out.println("Enter a string taht contains at least one lowercase `a`");
                input = keyedInput.nextLine();
                // I think I need to while loop every single one....
                if(input.contains("a")){
                    System.out.println("Enter a string between 5 and 15 characters long and doesn't contain z");
                    input = keyedInput.nextLine();

                    if(input.length() >= 5 && input.length() <= 15 && !input.contains("z")){
                        System.out.println("Enter an integer between 5 and 500");
                        int intInput = keyedInput.nextInt();

                        if(intInput >= 5 && intInput <= 500){
                            System.out.println("Enter a negative integer");
                            intInput = keyedInput.nextInt();

                            if(intInput < 0){
                                System.out.println("Enter a positive, odd integer");
                                intInput = keyedInput.nextInt();

                                if(intInput > 0 && intInput%2 == 0){
                                    System.out.println("Well done you have passed all the tests!");
                                    break;
                                }   
                            }
                        }
                    }
                }
            }
        }
    }
    
}
