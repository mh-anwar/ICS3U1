/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

/**
 *
 * @author mohammad
 */
public class TestProject {

public static int secretCalc (int n1, int n2)
{
return n1 + n2;
}
public static void main(String[] args) {

int val1 = 6;
int val2 = 8;
int val3;

val3 = secretCalc (val1, val2);
System.out.println(val3);
}
    
}
