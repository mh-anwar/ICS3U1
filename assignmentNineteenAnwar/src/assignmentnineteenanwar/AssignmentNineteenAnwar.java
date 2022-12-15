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
        // Declare a boolean that is used to determine whether the user wants to exit or not
        boolean userExit = false;
        while(userExit == false){
            // Output intro line
            System.out.println("-----------");
            System.out.println("Welcome to the Monkey Math Man");
            // Output menu
            System.out.println("Enter the following numbers for different math options");
            System.out.println("1. Area of triangle \n2. Hypotenuse of a triangle \n3. Speed of a vehicle \n4. Midpoint of a line \n5. Missing angle of right triangle\n6. Exit");
            // Get menu
            System.out.print(">>> ");
            int input = keyedInput.nextInt();
            // Call sub-routine based on choice
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
        // Calculate area of triangle
        // a = bh/2
        System.out.println("Welcome to Triangle Area Calculator");
        // Get the base length of the triangle
        System.out.println("What is the base of the triangle?");
        int base = keyedInput.nextInt();
        // Get the height length of the triangle
        System.out.println("What is the height of the triangle?");
        int height = keyedInput.nextInt();
        // Calculate the area and output it
        int triangleArea = (base * height)/2;
        System.out.println("The area of the triangle is: " + triangleArea);
    }
    static void triangleHypotenuse(){
        // Calculate the triangle hypotenuse
        // a^2 + b^2 = c^2
        System.out.println("Welcome to Triangle Hypotenuse Calculator");
        // Get side a of the triangle
        System.out.println("What is side A of the triangle?");
        int sideA = keyedInput.nextInt();
        // Get side b of the triangle
        System.out.println("What is side B of the triangle?");
        int sideB = keyedInput.nextInt();
        // Calculate the triangle hypotenuse and output it
        Double triangleHypotenuse = Math.sqrt((sideA^2) + (sideB^2));
        System.out.println("The hypotenuse of the triangle is: " + triangleHypotenuse);
    }
    static void lineMidpoint(){
        // Calculate the line midpoint
        // a^2 + b^2 = c^2
        System.out.println("Welcome to Line Segment Midpoint Calculator");
        // Get the first x-coordinate
        System.out.println("What is the X co-ordinate of the first point?");
        int firstX = keyedInput.nextInt();
        // Get the first y-coordinate
        System.out.println("What is the Y co-ordinate of the first point?");
        int firstY = keyedInput.nextInt();
        // Get the second y-coordinate
        System.out.println("What is the X co-ordinate of the second point?");
        int secondX = keyedInput.nextInt();
        // Get the second y-coordinate
        System.out.println("What is the Y co-ordinate of the second point?");
        int secondY = keyedInput.nextInt();
        // Add two x-coordinated and divide by two to get midpoint x-values
        int xValueMid = (firstX + secondX)/2;
        // Add the y-coordinates and divide by two to get midpoint y values
        int yValueMid = (firstY + secondY)/2;
        // Output the midpoint x and y values
        System.out.println("The midpoint of the line segment is: " + xValueMid + " " + yValueMid);
       
    }
    static void vehicleSpeed(){
        // Calculate the vehicle speed
        System.out.println("Welcome to Vehicle Speed Calculator");
        // Get the time the car took to travel
        System.out.println("What was the time it took the car to travel?");
        Double carTime = keyedInput.nextDouble();
        // Get the distance the car travelled
        System.out.println("What was the distance the car travelled?");
        Double carDistance = keyedInput.nextDouble();
        // Calculate the car speed
        Double carSpeed = carDistance/carTime;
        // Display the car speed
        System.out.println("The car speed is: " + carSpeed);
    }
    static void triangleMissingAngle(){
        // Declare the angle total
        final int totalAngle = 180;
        // Calculate the triangle missing missing angle
        System.out.println("Welcome to Triangle Missing Angle Calculator");
        // Get the first angle 
        System.out.println("What is angle A of the triangle?");
        Double angleA = keyedInput.nextDouble();
        // Get the second angle
        System.out.println("What is angle B of the triangle?");
        Double angleB = keyedInput.nextDouble();
        // Calculate the missing angle
        Double missingAngle = totalAngle - angleA - angleB;
        // Display the missing angle
        System.out.println("The missing angle is: " + missingAngle + " degrees");
    }
}
