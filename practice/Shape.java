package practice;

public class Shape {
  public int length;
  public int breadth;

  public Shape(int length, int breadth){
    this.length = length;
    this.breadth = breadth;
  }

  public void setLength(int length){
    this.length = length;
  }
  public void setBreadth(int breadth){
    this.breadth = breadth;
  }

  public int getLength(){
    return length;
  }

  public int getBreadth(){
    return breadth;
  }

  public int area(){
    return length*breadth;
  }

  public int perimeter(){
    return 2*(length+breadth);
  }
  
}
