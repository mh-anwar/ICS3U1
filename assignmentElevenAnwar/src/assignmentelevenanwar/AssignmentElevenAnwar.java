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
    
    static void stayAtHome(){
        System.out.println("Will you wake up at 10 AM or 12PM? (10/12)");
        //ArrayList<Object> cars = new ArrayList<Object>({"The questions":{"sol1", "nextquestionnumber"},{                                                                                                                                                                                                                                                                                                         }});
        int decision  = input.nextInt();
        while(true){
            if(decision == 10){
                
            } else if(decision == 12){
            
            }
        }
    }
    
    static void leaveForMordor(){
        
    }
    
    static void leaveWithCompany(){
        
    }
    
    public static void main(String[] args) {
        HashMap<String, Object[]> questionMap = new HashMap<String, Object[]>();
        questionMap.put("Do you fight? ", new Object[]{"Yes", 1, "No", 3});
        System.out.println(Arrays.toString(questionMap.get("Do you fight? "))); 
        for (String i : questionMap.keySet()) {
            System.out.println(i);
            Object[] answers = (questionMap.get(i));
            System.out.println(answers[0]);
           
        }
        /*
        while(true){
            System.out.println("Welcome to: The Hobbit");
            String decision = input.nextLine();
            switch(decision){
                case "A":
                    leaveWithCompany();
                    break;
                case "B":
                    stayAtHome();
                    break;
                case "C":
                    leaveForMordor();
                    break;   
            }
            
        }*/
    }
    
}
