
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String [] args) throws Exception {
      
      ArrayList<Integer> bids = new ArrayList<Integer>();
      ArrayList<String> names = new ArrayList<String>();
      
      Scanner in = new Scanner(System.in);
      int lines = in.nextInt();
      
      for(int i = 0; i < lines; i++){
          if(i % 2 == 0 ){
              bids.add(in.nextInt());
          }else{
              names.add(in.nextLine());
          }
      }
      
      int highestBid = 0;
      String highestBidderName = "";
      
      for(int h = 0; h <names.size(); h++){
          if(bids.get(h) > highestBid){
              highestBidderName = names.get(h);
          }
      }
      
    }
}
