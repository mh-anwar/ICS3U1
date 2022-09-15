/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mohammadanwar.assignmenttwo;

import java.util.Scanner;

/**
 *
 * @author mohammad
 */
public class MohammadAnwarAssignmentTwo {

    public static void main(String[] args) {
       double principal;
       double rateofInterest;
       double yearTime;
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to the Simple Interest Calculator!");
       System.out.println("To use the calculator, enter in a number after each "
               + "prompt and then click `Enter`");
       System.out.println("");
       System.out.println("Please enter in the Principal Amount:");
       principal = input.nextDouble();   
       System.out.println("Please enter in the Rate of Interest:");     
       rateofInterest = input.nextDouble();
       System.out.println("Please enter in the Time (in years):");     
       yearTime = input.nextDouble();
       double simpleInterest = (principal*rateofInterest*yearTime)/100;
       System.out.println("The simple interest is: "+ Math.round(simpleInterest));
    }
}
