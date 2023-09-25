package Dheeraj;

public class HelloWorld {
  void printer(){
    System.out.println("Dheeraj is accessing this method");
    print();
  }
  private void print(){
    System.out.println("accesssing private method from public inside class");
  }
}
