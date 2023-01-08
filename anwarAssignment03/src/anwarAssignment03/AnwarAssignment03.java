package anwarAssignment03;
import java.util.Scanner;

// @author s201076699 Mohammad Anwar
public class AnwarAssignment03 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       final double TAX_RATE = 0.13;
       final double SHIPPING_COST = 5;
       final double ECO_TAX = 0.09;
       final String BREAKER = "----------------------";
       double subTotal = 0;
       double totalAmount = 0;
       String[] fruits = {"Apples", "Oranges", "Banana's", "Pomegranates", "Dragon Fruit", "Mango"};
       double[] fruitsPrice = {1.50, 2.00, 1.25, 3.00, 6.16, 3.50};
       String shipItem;
       
       System.out.println("Welcome to Mohammad's Fruit Shop!");
       System.out.println(BREAKER);
       // looping is much more efficient than writing out each variable
       // I can cut the amount of code need in half
        for (int i = 0; i < fruits.length;i++) {
            System.out.println("How many " + fruits[i] +" ($"+ fruitsPrice[i] +") would you like to buy?");
            subTotal += input.nextInt() * fruitsPrice[i];
        }
        System.out.println(BREAKER);
        System.out.println("Would you like the item to be shipped to you (shipping cost of $5 will apply)? (yes/no)");
        shipItem = input.next();
        
        if(shipItem.toLowerCase().equals("yes")){
            subTotal = (subTotal + SHIPPING_COST);
        }
        System.out.println(BREAKER);
        System.out.println("Your subtotal amount comes to: $" + subTotal);
        System.out.println(BREAKER);
        System.out.println("The General Tax: "+ TAX_RATE+"% and the Eco Tax: "+ ECO_TAX +"% will be applied to your order.");
        totalAmount = (subTotal + (subTotal*TAX_RATE)+ (subTotal*ECO_TAX));
        System.out.println("Your total rounded amount (with tax) is: $" + Math.round(totalAmount));
    }
}
