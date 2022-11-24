/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentnineteenanwar;

import java.util.Scanner;

/**
 *
 * @author s201076699
 */
public class AssignmentNineteenAnwar {
    // Declare and initalize Scanner for input
    static Scanner keyedInput = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        boolean userExit = false;
        while(userExit == false){
            System.out.println("-----------");
            System.out.println("Welcome to the Monkey Math Man");
            System.out.println("Enter the following numbers for different math options");
            System.out.println("1. Area of triangle \n2. Hypotenuse of a triangle \n3. Speed of a vehicle \n4. Midpoint of a line \n5. Missing angle of right triangle\n6. Exit");
            System.out.print(">>> ");
            int input = keyedInput.nextInt();
            if(input==1){
                triangleArea();
            } else if(input==2){
                triangleHypotenuse();
            } else if(input==3){
                vehicleSpeed();
            } else if(input==4){
                lineMidpoint();
            } else if(input==5){
                triangleMissingAngle();
            } else if(input==6){
                userExit = true;
            }
        }
    }
    
    static void triangleArea(){
        // a = bh/2
        System.out.println("Welcome to Triangle Area Calculator");
        System.out.println("What is the base of the triangle?");
        int base = keyedInput.nextInt();
        System.out.println("What is the height of the triangle?");
        int height = keyedInput.nextInt();
        int triangleArea = (base * height)/2;
        System.out.println("The area of the triangle is: " + triangleArea);
    }
    static void triangleHypotenuse(){
        // a^2 + b^2 = c^2
        System.out.println("Welcome to Triangle Hypotenuse Calculator");
        System.out.println("What is side A of the triangle?");
        int sideA = keyedInput.nextInt();
        System.out.println("What is side B of the triangle?");
        int sideB = keyedInput.nextInt();
        Double triangleArea = Math.sqrt((sideA^2) + (sideB^2));
        System.out.println("The hypotenuse of the triangle is: " + triangleArea);
    }
    static void lineMidpoint(){
        // a^2 + b^2 = c^2
        System.out.println("Welcome to Line Segment Midpoint Calculator");
        System.out.println("What is the X co-ordinate of the first point?");
        int firstX = keyedInput.nextInt();
        System.out.println("What is the Y co-ordinate of the first point?");
        int firstY = keyedInput.nextInt();
        System.out.println("What is the X co-ordinate of the second point?");
        int secondX = keyedInput.nextInt();
        System.out.println("What is the Y co-ordinate of the second point?");
        int secondY = keyedInput.nextInt();
        
        int xValues = (firstX + secondX)/2;
        int yValues = (firstY + secondY)/2;
        int midpoint = xValues + yValues;
        System.out.println("The midpoint of the line segment is: " + midpoint);
       
    }
    static void vehicleSpeed(){
        
    }
    static void triangleMissingAngle(){
        
    }
}
