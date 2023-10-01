package Lambda;

public class ThreadDemo {
  public static void main(String[] args) {
    Runnable thread1 = () -> {
      //body of the< thread
      for(int i=1;i<=10;i++){
        System.out.println("Value of I is"+ i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    Thread t = new Thread(thread1);
    t.setName("Dheeraj");
    t.start();
    
  }
  
}
