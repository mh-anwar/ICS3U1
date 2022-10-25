/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentelevenanwar;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
// @author Mohammad Anwar


public class AssignmentElevenAnwar {

    static Scanner input = new Scanner(System.in);
    
    static void nextDecision(Integer nextPos, HashMap map){
        while(true){
                if(nextPos == 0){
                   System.out.println("You lived life happily ever after. Bye bye.");
                   System.exit(0);
                } else{
                    Object[] actions = (Object[]) map.get(nextPos);
                    System.out.print(actions[0] + ": "); //The question
                    String decision = input.nextLine();
                    if (actions[1].equals(decision)) {
                        nextDecision((Integer) actions[2], map);
                    } else if (actions[3].equals(decision)) {
                        nextDecision((Integer) actions[4], map);
                    }   
                }
        }
    }
    
    public static void main(String[] args) {
        HashMap<Integer, Object[]> questionMap = new HashMap<Integer, Object[]>(){{
            put(1, new Object[]{"Do you fight?", "Yes", 2, "No", 3});
            put(2, new Object[]{"Will you leave at night", "Yes", 4, "No", 5});
            put(3, new Object[]{"Will you sleep?", "Yes", 0, "No", 0});
            put(4, new Object[]{"The war was over, before you arrived. Would you like to go back home?", "Yes", 0, "No", 0});
            put(5, new Object[]{"You went to sleep instead.", "Yes", 0, "No", 0});
        }};
        
        while(true){
            System.out.println("Welcome to: The Hobbit");
            System.out.print("Enter B to begin your adventure: ");
            String decision = input.nextLine();
            switch(decision){
                case "A":
                    break;
                case "B":
                    System.out.println("Type in Yes/No for you answers.");
                    Object[] actions = questionMap.get(1);
                    System.out.print(actions[0] + ": "); //The question
                    decision  = input.nextLine();
                    if(actions[1].equals(decision)){
                        nextDecision((Integer) actions[2], questionMap);
                    } else if(actions[3].equals(decision)){
                        nextDecision((Integer) actions[4], questionMap);
                    }
                    break;
                case "C":
                    break;   
            }
            
        }
    }
    
}
