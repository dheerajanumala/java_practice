package current;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Dheeraj {
  public static void main(String[] args){
    
    int i = 10;
    int j = 0;
    int k = 10;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;
    try{
      System.out.println((i+k)/j);
    }
    catch(Exception e){
      System.out.println(e.toString());
      System.out.println(e.getMessage());
    }
    finally{
      System.out.println("Bye");
    }
  }
  
}
