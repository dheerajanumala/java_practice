package Singleton_DP;

public class Samosa {
  private static Samosa samosa ;
  private Samosa(){

  }
  public static Samosa getSamosa(){
    // creates object of this class
    if(samosa==null){
      synchronized (Samosa.class){
        if(samosa==null){
          samosa = new Samosa();
        }
      }
    }
    return samosa;
  }
  
}
