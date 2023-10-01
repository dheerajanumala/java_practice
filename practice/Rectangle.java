package practice;

public class Rectangle extends Shape{
  public int noOfRectangles;

  public Rectangle(int length, int breadth,int count){
    super(length,breadth);
    this.noOfRectangles=count;
  }

  @Override
  public int area(){
    return length*breadth*2;
  }

  @Override
  public int perimeter(){
    return 2*(length+breadth);
  }
  
}
