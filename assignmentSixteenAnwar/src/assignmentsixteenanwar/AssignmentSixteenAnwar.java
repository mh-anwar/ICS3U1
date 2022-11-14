/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsixteenanwar;
// Initially I was going to use JSON, but it works better with Web Languages
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  

import java.util.ArrayList;
import java.util.Scanner;
/*
 *
 * @author s201076699
 */
public class AssignmentSixteenAnwar {

    /**
     * @param args the command line arguments
     */
    
    // Declare and initalize Scanner for input
    static Scanner keyedInput = new Scanner (System.in);
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> userNames = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<String> posts = new ArrayList<>();
        ArrayList<Boolean> verifiedUser = new ArrayList<>();
        
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("U:\\Documents\\NetBeansProjects\\assignmentSixteenAnwar\\src\\assignmentsixteenanwar\\data.csv"));  
            while ((line = br.readLine()) != null){  
                String[] data = line.split(","); 
                String name = data[0];
                String userName = data[1];
                String email = data[2];
                String post = data[3];
                Double verificationChance = Double.parseDouble(data[4]); //this is a funny variable
                Boolean verified = false;
                if(verificationChance >100){
                    verified = true;
                }
                names.add(name);
                userNames.add(userName);
                emails.add(email);
                posts.add(post);
                verifiedUser.add(verified);
            }  
        } catch (IOException e){  
            e.printStackTrace();  
        }
        Boolean userExit = false;
        while(userExit == false){
            System.out.println("Welcome to the Twitter CLI");
            System.out.println("----------");
            System.out.println("Loading content...");
            System.out.println("Generating curated feed...");
            System.out.println("Your special feed, curated just for you");
            System.out.println("1.Vew your feed \n2.Edit settings \n3.Delete account \n4.Exit the CLI");
            System.out.println("----------");
            System.out.print("(1/2/3/4)>>>  ");
            int option = keyedInput.nextInt();
            System.out.println("");
            if(option == 1){
                displayFeed(names, userNames, emails, posts, verifiedUser);
            } else if(option == 2){
                changeAccountSettings();
            }
        }
    }
    
    static void displayFeed(ArrayList names, ArrayList userNames, ArrayList emails, ArrayList posts, ArrayList verifiedUser){
        System.out.println("Welcome to your curated feed:");
        System.out.println("To move to the next post, press Enter");
        System.out.println("To stop, type in 'No' ");
        for(int i = 0; i<names.size(); i++){
            System.out.println("----------");
            String verificationStatus = ((Boolean) verifiedUser.get(i))==false ? "" : "(⌐■_■) Verified";
            System.out.println(verificationStatus);
            System.out.println(names.get(i) + " - " + userNames.get(i));
            System.out.println("Contact me at: " + emails.get(i));
            System.out.println("Post: " + posts.get(i));
            System.out.println("----------");
            System.out.print("(Y/N)>>>  ");
            String showNextPost = keyedInput.next();
            if(showNextPost.equalsIgnoreCase("n")){
                System.exit(0);
            }
        }
        
    }
    static void changeAccountSettings(){
        
        ArrayList<String> userInfo = new ArrayList<>();
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("U:\\Documents\\NetBeansProjects\\assignmentSixteenAnwar\\src\\assignmentsixteenanwar\\user.csv"));  
            while ((line = br.readLine()) != null){  
                String[] data = line.split(","); 
                Double verificationChance = Double.parseDouble(data[4]); //this is a funny variable
                Boolean verified = false;
                if(verificationChance >100){
                    verified = true;
                }
                userInfo.add(data[0]);
                userInfo.add(data[1]);
                userInfo.add(data[2]);
                userInfo.add(data[3]);
                userInfo.add(Boolean.toString(verified));
            }  
        } catch (IOException e){  
            e.printStackTrace();  
        }
        System.out.println("What account settings would you like to change?");
        System.out.println("1. Name \n2.Username \n3. Email \n4. Verification Status");
        int option = keyedInput.nextInt();
        if(option ==1){
            System.out.println("Your current name is: " + userInfo.get(1));
            System.out.println("What would you like to change your name to?");
            String newName = keyedInput.nextLine();
        } else if(option ==2){
            System.out.println("Your current user name is: " + userInfo.get(2));
            System.out.println("What would you like to change your username to?");
            String newUserName = keyedInput.nextLine();
        } else if(option ==3){
            System.out.println("Your current email is: " + userInfo.get(3));
            System.out.println("What would you like to change your email to?");
            String newEmail = keyedInput.nextLine();
        } else if(option ==4){
            System.out.println("Would you like to be verified?");
            String wantVerification = keyedInput.nextLine();
            if(wantVerification.equalsIgnoreCase("yes")){
                long verificationChance = (long) Math.round(Math.random()*200);
                if(verificationChance > 100){
                    System.out.println("Twitter has approved your verification. You are now verified. Congratulations");
                } else{
                    System.out.println("Twitter has decided not to verify you. Remain a peasant.");
                }
            }
        }
    }
    
    static void createAccount(){
        
    }
}
