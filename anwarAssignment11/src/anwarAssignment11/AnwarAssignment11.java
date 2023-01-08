/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anwarAssignment11;
import java.util.Scanner;
import java.util.HashMap;

// @author Mohammad Anwar

/*
    Note: This code is a much more efficient implementation of how the assignment should have been done 
    (with hundreds of if-else statements). I think that I can make it even more efficient and this is evident 
    because there is too much repitition within my nextDecision() functions (especially since I am overloading 
    them, I hope to learn how to fix this). To solve this I can reduce the amount of if-statements and use 
    functions for redundant code. However, I am mostly satisfied with this code as it is itself is quite efficient.

    Random cool things about this assignment:
        - I used objects within HashMaps to overcome the fact that hashmaps can _technically_ only hold two peices of information
            - I think this is a custom data structure that I made...
        - I used a recursive function, instead of looping through a data-structure (all to prevent me from writing 100 if-statements)
        - I overloaded my recursive function and had a good use case for it (showing the ending message)
        - (One more time) I made giant hashmaps!
*/

public class AnwarAssignment11 {
 // Declare scanner for input
 static Scanner input = new Scanner(System.in);
    
    // The initial function, does not accept an ending message
    static void nextDecision(Integer nextPos, HashMap map){
        // Keep looping to ensure that wrong input doesn't break the program
        while(true){
                // If the program should just be ended into a happy ending, display message and end
                if(nextPos == 0){
                   System.out.println("You lived life happily ever after. Bye bye.");
                   System.exit(0);
                } 
                // Otherwise, display next question prompt and ask for input
                else{
                    // Retrieve details about the next object in hashmap
                    Object[] actions = (Object[]) map.get(nextPos);
                    //Breaker (for formatting)
                    System.out.println("");
                    // Display prompt
                    System.out.println(actions[0] + ": "); //The question
                    System.out.print("[Your Input (Y/N/R)] ~ ");
                    // Request input
                    String decision = input.nextLine();
                    // If the decision has an endMessage send it to the next function (you can tell if it has an endMessage based on it's length)
                    if(actions.length>4){
                        // Depending on decision, send next position, the hashmap and ending message
                        if (decision.equalsIgnoreCase("Y")) {
                            nextDecision((Integer) actions[1], map, (String) actions[4]);
                        } else if (decision.equalsIgnoreCase("N")) {
                            nextDecision((Integer) actions[2], map, (String) actions[4]);
                        } else if (decision.equalsIgnoreCase("R")){
                            nextDecision((Integer) actions[3], map, (String) actions[4]);
                        }
                    }
                    // Otherwise simply call the next function with normal arguments
                    else{
                        // Depending on decision, send next position and the hashmap
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
 // The overloading function, that accepts and displays an end message
 static void nextDecision(Integer nextPos, HashMap map, String endMessage){
        // Keep looping to ensure that wrong input doesn't break the program
        while(true){
                // If there is an end message and the line should be ended then display message and end program
                if(endMessage!=null && nextPos ==0){
                    System.out.println(endMessage);
                    System.exit(0);
                } 
                // If the program should just be ended into a happy ending, display message and end
                else if(nextPos == 0){
                   System.out.println("You lived life happily ever after. Bye bye.");
                   System.exit(0);
                } 
                // Otherwise, display next question prompt and ask for input
                else{
                    // Retrieve details about the next object in hashmap
                    Object[] actions = (Object[]) map.get(nextPos);
                    //Breaker (for formatting)
                    System.out.println("");
                    // Display prompt
                    System.out.println(actions[0] + ": "); //The question
                    System.out.print("[Your Input (Y/N/R)] ~ ");
                    // Request input
                    String decision = input.nextLine();
                    // If the decision has an endMessage send it to the next function
                     if(actions.length>4){
                         // Depending on decision, send next position, the hashmap and ending message
                        if (decision.equalsIgnoreCase("Y")) {
                            System.out.println(endMessage);
                            nextDecision((Integer) actions[1], map, (String) actions[4]);
                        } else if (decision.equalsIgnoreCase("N")) {
                            nextDecision((Integer) actions[2], map, (String) actions[4]);
                        } else if (decision.equalsIgnoreCase("R")){
                            nextDecision((Integer) actions[3], map, (String) actions[4]);
                        }
                     } 
                     // Otherwise simply call the next function with normal arguments
                     else{
                         // Depending on decision, send next position and the hashmap
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
 // Just a function print a break statement
    static void printBreak(){
        System.out.println("--------------------------------------");
    }
    
    public static void main(String[] args) {
        // *****The flowchart shows three maps, but I only needed two to acheive 30 decisions - this can be verified by adding the number of elements in each hashmap******
        
        /*
        The biggest flaw is that I require "dumb decisions" something to end off the current line that the user is on. 
        These decisions, essentially, lead you to the same outcome (generally the end) no matter what choice you choose. 
        (And since they count as decisions, I can game the system and easily get 30 decisions.)

        Common patterns:
        - Last two entries in hashmap should have 0 as both yesPos and noPos
        - Every two entries later, the previousPos should increase
        - Weirdly, using indenting in the entries (similiar to if-statement indenting) helps parse the data (from the eye)
        Sample structure: (position, {prompt, yesPos, noPos, previousPos, (optional) messageToEnd})
        */
        
        // Declare and initialize first hash map
        // Notice that there is indenting, this is me formatting it so that it can be parsed by my eyes - this is a flaw of the program imo, because ideally the data would be in a file and I would parse it into this data structure
        HashMap<Integer, Object[]> teamMap = new HashMap<Integer, Object[]>(){{
            put(1, new Object[]{"You are going to Mordor with the dwarves. Will you ride on horse?", 
                2, 3, 1});
                put(2, new Object[]{"You rode fast to Rivendell, where the elves coaxed you into leaking the dwarves' plan. Will you tell them?", 
                    0, 4, 1, "Why'd you do that, the dwarves don't trust you, the elves didn't give you a bribe and you got sent back home. The mission failed"});
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
                                /*This line displays the essence and beauty of recursive functions. I'm not looping through it, 
                                    two very different decisions can lead to the same next outcome*/
                            put(8, new Object[]{"You attempted to escape and were successfull! Will you venture into *The Mountain*?",
                                11, 0, 7, "Lame hobbit. Got all the way to Laketown and now ye retreat? You live a life of regret and sorrow. The end."});                            
                            put(9, new Object[]{"You didn't escape, but a birdy threw a key into your cell..will you use it to open your cell? Do you give up on life?",
                                0, 10, 7, "Huh, and people thought hobbits were better at living. You gave up, the goblins ate you for lunch. The end,"});
                            put(10, new Object[]{"Good choice, little hobbit. Small yet wise... You successfully escaped the cell and reached laketown, where you met the dwarves. Will you venture into *The Mountain*?",
                                11, 0, 9, "Lame hobbit. Got all the way to Laketown and now ye retreat? You live a life of regret and sorrow. The end."});
                            put(11, new Object[]{"The dwarves have put their trust in you to fight the dragon. Will you complete the mission?",
                                12, 13, 10,""});
                            put(12, new Object[]{"How wise and brave! You managed to retrieve the Arkenstone, but woke up the dragon. Will you save Laketown from it?",
                                14, 0, 11, "Brave? Nevermind that, you're an absolute scumbag! The dragon burn the village to the ground and roasted you along side! You died, the end (and good riddance!)"});
                            put(13, new Object[]{"Eeee, I guess you're called burgular for a reason. You stole all the riches. Will you live in the mountain?",
                                15, 0, 11, "You are the richest hobbit on the planet. You narrowly hid from the dwarves and mostly made it back home. \nUnfortunately, the dragon woke up and is now burning everything in it's path (that includes you!). You will die. The end."});
                            put(14, new Object[]{"The village has been saved! Oh holy Hobbit, slayer of dragons and saviour of the people. Will you reignite the forges and live alongside the dwarves in the mountain?",
                                16, 17, 12});
                            put(15, new Object[]{"Living in the mountain...did you remember that a dragon lives here? Welll...Smaug is awake now. Will you run away?",
                                0, 0, 13, "You couldn't do anything. You couldn't run or hide. Smaug smelled the scent of hobbits, tracked you down and ate you. The end."});
                            put(16, new Object[]{"You live in the mountain, but the elves find out that you have the arkenstone. They wage war upon you, will you offer them the arkenstone?",
                                18, 19, 14});
                            put(17, new Object[]{"You leave, but a 1/2 mile away you meet Gandalf and the elves. They seek the Holy Arkenstone, and they will kill the dwarves for it. Do you offer them the Arkenstone and save the lives of the poor dwarves?",
                                18, 19, 14});
                            put(18, new Object[]{"You give them the Arkenstone. Suddenly (the next day) and army of Goblins appears. The dwarves find out that the elves have the stone, and are confused, but glad when the elves pledge to fight with them? Will you fight? ",
                                20, 0, 16, "The goblins killed all the elves, murdered the dwarves and lay waste to everything in a 5 mile radius. You died as well...the end."});
                            put(19, new Object[]{"You did not offer them the Arkenstone and they conquered the mountain and took you a prisoner. Then an army of goblins appear, will you escape?",
                                21, 0, 16, "The goblins killed you. The end. :("});
                            
                            put(20, new Object[]{"Well done, the bravery and courage you displayed was heroic. The dwarves and elves are at peace. The goblins are dead. You have acheived the greatest honor, you will recieve the 'Goblin Slayer Award'. \n Would you like to return home?",
                                0, 0, 18, "May you enjoy the rest of your life. The end."});
                            put(21, new Object[]{"You fought the goblins with valiant effort and won! Unfortunately, the animosity between dwarves and elves remain, will you give the arkenstone to the elves?",
                                22, 23, 19});
                            put(22, new Object[]{"The elves accepted the arkenstone and the dwarves understood that they were being greedy. Your mission is complete. Well done. Will you return home?",
                                0, 0, 21, "May you live happily ever after! The end."});
                             put(23, new Object[]{"Alas, you gave the dwarves the arkenstone. The elves were not happy, the left and hated the dwarves for eternity. You completed your mission, but not to the best of you ability. Would you like to return home?",
                                0, 0, 21, "Put in more effort next time lad. You lived, just not very happily. The end."});
        }};                
        
        // Declare and initialize second hash map
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
        
        // Continously loop, to ensure that bad input doesn't break the program
        while(true){
            // Display prompts and give a background
            System.out.println("Welcome to The Hobbit Game. You are a hobbit and your mission is to go to the mountain and collect the Arkenstone for the Dwarves, while making sure that Smaug (the dragon under the mountain) doesn't wake up \n (you can also, not do that and still live happily!)");
            printBreak();
            System.out.println("Would you like to \nA. Go to Mordor with the company of 12 \nB. Stay at home");
            System.out.print("[Your Input (A/B)] ~ ");
            // Request first input that let's you go down a map
            String decision = input.nextLine();
            
            // Display instructions
            printBreak();
            System.out.println("Enter in a Y for Yes, an N for No and R to return. You cannot return after this (first) decision.");
            // Accept decison, regardless of case and direct to recursive function that recurses(?) through a hashmap
            // The flowchart shows three maps, but I only needed two to acheive 30 decisions
            if(decision.equalsIgnoreCase("A")){
                nextDecision(1, teamMap);
            } else if(decision.equalsIgnoreCase("B")){
                    nextDecision(1, homeMap);
            }
            
        }
    }
    
}
