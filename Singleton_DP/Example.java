package Singleton_DP;

import java.lang.reflect.Constructor;

public class Example {

  public void setAccessible() throws Exception{

  }
  public static void main(String[] args) throws NoSuchMethodException, SecurityException {
    
    
    
    Samosa samosa1 = Samosa.getSamosa();
    System.out.println(samosa1.hashCode());

    Samosa samosa2 = Samosa.getSamosa();
    System.out.println(samosa2.hashCode());

    // Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
    // constructor.setAccessible(true);
    // Samosa s2 = constructor.newInstance();


    


  }

  
}

/*
 * 1. Constructor should be private because you cant make the constructor call to create an object
 * 2. create object with method 
 * 3. Create field to store object which is private
 * 4. We should not use method synchronization we should use block synchronization
 * 5. 
 * 
 * 
 * 1. Using Reflection API to break Singleton pattern
 * 2. 
 */
