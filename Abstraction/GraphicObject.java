package Abstraction;

public abstract class GraphicObject {
  int x;
  int y;

  void moveTo(int x, int y){
    System.out.println("printing out the values of x:" + x + " y: "+ y);
  }

  abstract void draw();
  abstract void view();
  
}
