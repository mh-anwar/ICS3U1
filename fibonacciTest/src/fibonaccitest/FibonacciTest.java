/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccitest;

/**
 *
 * @author s201076699
 */
public class FibonacciTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            int fibonacciPosition = fibonacciNumber(16, 1, 1, 3);
            System.out.println(fibonacciPosition);
    }
    static private int fibonacciNumber(int position, int sLastNum, int lastNum, int myPos){
        int finalNum = sLastNum + lastNum;
        System.out.println(finalNum);
        myPos +=1;
        System.out.println(position + " " + myPos);
        if(myPos == position){
            return finalNum;
        }
        return fibonacciNumber(position, lastNum, finalNum, myPos);
    }
}
