/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentelevenanwar;
import java.util.Scanner;
import java.util.HashMap;
// @author Mohammad Anwar


public class AssignmentElevenAnwar {

    static Scanner input = new Scanner(System.in);
    
    // I managed to only use TWO if-statements in a project that required 30 if statements
    static void nextDecision(Integer nextPos, HashMap map, Integer oldPos, boolean... stopReturn){
        while(true){
            System.out.println(stopReturn);
                if(nextPos == 0){
                   System.out.println("You lived life happily ever after. Bye bye.");
                   System.exit(0);
                } else if(nextPos == -1){
                   System.out.println("You failed and died. The mission has failed. The end.");
                   System.exit(0);
                } else{
                    Object[] actions = (Object[]) map.get(nextPos);
                    System.out.println("");
                    System.out.println(actions[0] + ": "); //The question
                    System.out.print("[Your Input (Y/N/R)] ~ ");
                    String decision = input.nextLine();
                    
                    // When nextPos is provided to the function, it actually means the current/old position
                    if (decision.equals(actions[1])) {
                        nextDecision((Integer) actions[2], map, nextPos);
                    } else if (decision.equals(actions[3])) {
                        nextDecision((Integer) actions[4], map, nextPos);
                    } else if (decision.equals("R") && stopReturn.equals(null)){
                        nextDecision((Integer) oldPos, map, oldPos, true);
                    }
                    
                }
        }
    }
    
    static void printBreak(){
        System.out.println("--------------------------------------");
    }
    
    public static void main(String[] args) {
        HashMap<Integer, Object[]> teamMap = new HashMap<Integer, Object[]>(){{
            put(1, new Object[]{"Do you fight?", "Y", 2, "N", 3});
            put(2, new Object[]{"Will you leave at night", "Y", 4, "N", 5});
            put(3, new Object[]{"Will you sleep?", "Y", 0, "N", 0});
            put(4, new Object[]{"The war was over, before you arrived. Would you like to go back home?", "Y", 0, "N", 0});
            put(5, new Object[]{"You went to sleep instead.", "Y", 0, "N", 0});
        }};
        
        HashMap<Integer, Object[]> homeMap = new HashMap<Integer, Object[]>(){{
            put(1, new Object[]{"Do you fight?", "Y", 2, "N", 3});
            put(2, new Object[]{"Will you leave at night", "Y", 4, "N", 5});
            put(3, new Object[]{"Will you sleep?", "Y", 0, "N", 0});
            put(4, new Object[]{"The war was over, before you arrived. Would you like to go back home?", "Y", 0, "N", 0});
            put(5, new Object[]{"You went to sleep instead.", "Y", 0, "N", 0});
        }};
        
        HashMap<Integer, Object[]> soloMap = new HashMap<Integer, Object[]>(){{
            put(1, new Object[]{"Do you fight?", "Y", 2, "N", 3});
            put(2, new Object[]{"Will you leave at night", "Y", 4, "N", 5});
            put(3, new Object[]{"Will you sleep?", "Y", 0, "N", 0});
            put(4, new Object[]{"The war was over, before you arrived. Would you like to go back home?", "Y", 0, "N", 0});
            put(5, new Object[]{"You went to sleep instead.", "Y", 0, "N", 0});
        }};
        
        while(true){
            System.out.println("Welcome to The Hobbit");
            printBreak();
            System.out.println("Would you like to \nA. Go to Mordor with the company of 12 \nB. Leave by yourself \nC. Stay at home");
            System.out.print("[Your Input (A/B/C)] ~ ");
            String decision = input.nextLine();
            
            switch(decision){
                case "A":
                    nextDecision(1, teamMap, 1);
                    break;
                case "B":
                    nextDecision(1, soloMap, 1);
                    break;
                case "C":
                    nextDecision(1, homeMap, 1);
                    break;   
            }
        }
    }
    
}
