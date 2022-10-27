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
    static void nextDecision(Integer nextPos, HashMap map){
        while(true){
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
                    
                    if (decision.equals("Y")) {
                        nextDecision((Integer) actions[1], map);
                    } else if (decision.equals("N")) {
                        nextDecision((Integer) actions[2], map);
                    } else if (decision.equals("R")){
                        nextDecision((Integer) actions[3], map);
                    }
                    
                }
        }
    }
    
    static void printBreak(){
        System.out.println("--------------------------------------");
    }
    
    public static void main(String[] args) {
        HashMap<Integer, Object[]> teamMap = new HashMap<Integer, Object[]>(){{
            put(1, new Object[]{"Do you fight?", 2, 3, 1});
            put(2, new Object[]{"Will you leave at night", 4, 5, 1});
            put(3, new Object[]{"Will you sleep?", 0, 0, 1});
            put(4, new Object[]{"The war was over, before you arrived. Would you like to go back home?", 0, 0, 2});
            put(5, new Object[]{"You went to sleep instead.", 0, 0, 2});
        }};
        
        HashMap<Integer, Object[]> homeMap = new HashMap<Integer, Object[]>(){{
            put(1, new Object[]{"Do you fight?", 2, 3, 1});
            put(2, new Object[]{"Will you leave at night", 4, 5, 1});
            put(3, new Object[]{"Will you sleep?", 0, 0, 1});
            put(4, new Object[]{"The war was over, before you arrived. Would you like to go back home?", 0, 0, 2});
            put(5, new Object[]{"You went to sleep instead.", 0, 0, 2});
        }};
        
        HashMap<Integer, Object[]> soloMap = new HashMap<Integer, Object[]>(){{
            put(1, new Object[]{"Do you fight?", 2, 3, 1});
            put(2, new Object[]{"Will you leave at night", 4, 5, 1});
            put(3, new Object[]{"Will you sleep?", 0, 0, 1});
            put(4, new Object[]{"The war was over, before you arrived. Would you like to go back home?", 0, 0, 2});
            put(5, new Object[]{"You went to sleep instead.", 0, 0, 2});
        }};
        
        while(true){
            System.out.println("Welcome to The Hobbit");
            printBreak();
            System.out.println("Would you like to \nA. Go to Mordor with the company of 12 \nB. Leave by yourself \nC. Stay at home");
            System.out.print("[Your Input (A/B/C)] ~ ");
            String decision = input.nextLine();
            
            switch(decision){
                case "A":
                    nextDecision(1, teamMap);
                    break;
                case "B":
                    nextDecision(1, soloMap);
                    break;
                case "C":
                    nextDecision(1, homeMap);
                    break;   
            }
        }
    }
    
}
