package Singleton_DP;

public class Example {
  public static void main(String[] args) {
    Samosa samosa1 = Samosa.getSamosa();
    System.out.println(samosa1.hashCode());

    Samosa samosa2 = Samosa.getSamosa();
    System.out.println(samosa2.hashCode());
  }

  
}

/*
 * 1. Constructor should be private because you cant make the constructor call to create an object
 * 2. create object with method 
 * 3. Create field to store object which is private
 * 4. We should not use method synchronization we should use block synchronization
 * 5. 
 */
