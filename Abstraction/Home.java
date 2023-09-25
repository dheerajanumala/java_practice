package Abstraction;

public class Home {
  public static void main(String[] args){
    GraphicObject go = new Rectangle();
    go.view();
    go.draw();

    GraphicObject go2 = new Circle();
    go2.draw();
    go2.view();
  }
  
}
