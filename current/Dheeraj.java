package current;

public class Dheeraj {
  public static void main(String[] args){
    
    int i = 10;
    int j = 0;
    int k = 10;

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
