/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmenttwelvemohammad;

import java.util.Scanner;

/**
 *
 * @author s201076699
 */
public class AssignmentTwelveMohammad {
    static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter your choice:\n" +
                            "1... Count from 0 to 10 by 1\n" +
                            "2... Count from 100 to 0 by 10\n" +
                            "3... Count from 50 to 500 by 50\n" +
                            "4... Count from 6000 to 1000 by 1000");
        int decision = input.nextInt();
        
        if(decision == 1){
            countLoop(0, 10, 1);
        } else if(decision == 2){
            countLoop(100, 0, 10);
        } else if(decision == 3){
            countLoop(50, 500, 50);
        } else if(decision == 4){
            countLoop(6000, 1000, 1000);
        }
    }
    
    static void countLoop(int initialNum, int finalNum, int step){
        if(initialNum < finalNum){
            for(int i = initialNum; i <= finalNum; i += step){
                System.out.println(i);
            }    
        } else{
            for(int i = finalNum; i >= initialNum; i += step){
                System.out.println(i);
            }
        }

    }
    
}
