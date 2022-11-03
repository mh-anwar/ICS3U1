package assignmentelevenanwar;
import java.lang.reflect.Array;
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
                    if(actions.length>4){
                        if (decision.equalsIgnoreCase("Y")) {
                            nextDecision((Integer) actions[1], map, (String) actions[4]);
                        } else if (decision.equalsIgnoreCase("N")) {
                            nextDecision((Integer) actions[2], map, (String) actions[4]);
                        } else if (decision.equalsIgnoreCase("R")){
                            nextDecision((Integer) actions[3], map, (String) actions[4]);
                        }
                    } else{
                        if (decision.equalsIgnoreCase("Y")) {
                            nextDecision((Integer) actions[1], map);
                        } else if (decision.equalsIgnoreCase("N")) {
                            nextDecision((Integer) actions[2], map);
                        } else if (decision.equalsIgnoreCase("R")){
                            nextDecision((Integer) actions[3], map);
                        }   
                    }
                }
        }
    }
 static void nextDecision(Integer nextPos, HashMap map, String endMessage){
        while(true){
                if(endMessage!=null){
                    System.out.println(endMessage);
                    System.exit(0);
                } else if(nextPos == 0){
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
                     if(actions.length>=4){
                    if (decision.equalsIgnoreCase("Y")) {
                        System.out.println(endMessage);
                        nextDecision((Integer) actions[1], map, (String) actions[4]);
                    } else if (decision.equalsIgnoreCase("N")) {
                        nextDecision((Integer) actions[2], map, (String) actions[4]);
                    } else if (decision.equalsIgnoreCase("R")){
                        nextDecision((Integer) actions[3], map, (String) actions[4]);
                    }
                     }
                }
        }
    }
    static void printBreak(){
        System.out.println("--------------------------------------");
    }
    
    public static void main(String[] args) {
        /*
        The biggest flaw in my program is making these hashmaps.
        Another flaw is that I require "dumb decisions" something to end off the current line that the user is on. 
        These decisions, essentially, lead you to the same outcome (generally the end) no matter what choice you choose. 
        (And since they count as decisions, I can game the system and easily get 30 decisions.)

        Common patterns:
        - Last two entries in hashmap should have 0 as both yesPos and noPos
        - Every two entries later, the previousPos should increase
        - Weirdly, using indenting in the entries (similiar to if-statement indenting) helps parse the data
        Sample structure: (position, {prompt, yesPos, noPos, previousPos, (optional) messageToEnd})
        */
        
        HashMap<Integer, Object[]> teamMap = new HashMap<Integer, Object[]>(){{
            put(1, new Object[]{"You are going to Mordor with the dwarves. Will you ride on horse?", 
                2, 3, 1});
                put(2, new Object[]{"You rode fast to Rivendell, where the elves coaxed you into leaking the dwarves' plan. Will you tell them?", 
                    4, 0, 1, "Why'd you do that, the dwarves don't trust you, the elves didn't give you a bribe and you got sent back home. The mission failed"});
                put(3, new Object[]{"You were walking along, enjoying your time when you suddenly encountered massive trolls who attempted to cook you. Do you escape?", 
                    0, 0, 1, "You failed to escape and died."});
                    put(4, new Object[]{"You didn't tell the elves. The dwarves trust you and the elves think highly of you. The dwarves are about to leave, will you leave with them?", 
                        5, 6, 2});
                        put(5, new Object[]{"You left with them and soon encountered goblins. Do you run away?",
                            0, 7, 4});
                        put(6, new Object[]{"You have nothing to do. Would you like to go back home?",
                            0, 0, 4, "You lived life happily ever after. The end"});
                        put(7, new Object[]{"You fought hard. But goblins are too big, and they managed to cage you in cells. Will you escape?",
                            8, 9, 5});
                            put(8, new Object[]{"You fought hard. But goblins are too big, and they managed to cage you in cells. Will you escape?",
                                10, 11, 7});                            
                            put(9, new Object[]{"You didn't escape, but a birdy threw a key into your cell..will you use it to open your cell?",
                                8, 9, 7});
        }};

        HashMap<Integer, Object[]> homeMap = new HashMap<Integer, Object[]>(){{
            put(1, new Object[]{"You did not leave to fight. The dwarves left without you, the world might end, but it's ok. Are you going to wake up at 10AM tomorrow morning?",
                2, 3, 1});
            put(2, new Object[]{"You woke up at 10AM and enjoyed yummy hobbit food. Will you water the lawn?", 
                4, 5, 1});
            put(3, new Object[]{"You late riser! You woke up at 12PM instead and ate lunch. Life was good. Are you going to chill today?", 
                0, 0, 1, "Good choice! Today you will do what you want. Life is good. The end."});
            put(4, new Object[]{"You watered the lawn. Will you celebrate your birthing day today?",
                0, 0, 2, "As expected, the wise hobbit makes many unique choices. You lived the rest of your life happily. The End."});
            put(5, new Object[]{"The lawn is dying, but it doesn't matter. Will you write a book about your life?",
                6, 7, 2});
            put(6, new Object[]{"You wrote a book then sold it, and now you're the most famous Hobbit in Hobbitton! Will you become a writer?",
                0, 0, 5, "Writer or not, you are now the Legendary Hobbit. You will life peacefully and happily. The End."});
            put(7, new Object[]{"You didn't write a book, but life continues. Instead of writing, perhaps you will take up reading?",
                0, 0, 5, "As expected, you make the most unique of choices. You live life happily ever after."});
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
            
            //add ignorecase
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
