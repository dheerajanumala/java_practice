package practice;

import java.util.ArrayList;

public class Person {


  public static void main(String[] args) {
    Drawable d1 = new Circle();
    d1.draw();
    ArrayList<Drawable> drawArr = new ArrayList<>();
    drawArr.add(new Circle());
    drawArr.add(new Square());
    drawArr.add(new Circle());
    for(Drawable i: drawArr){
      i.draw();
    }
    
  }
  
}
