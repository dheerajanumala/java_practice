package Interface;

class MountainBike implements Bycycle{
  private int seatheight;
  private int speed;
  private int gears;
  
  @Override
  public void applybrake(int speed){
    this.speed-=speed;
    System.out.println(this.speed);
  }
  
  @Override
  public void applypedak(int speed){
    this.speed+=speed;
    System.out.println(this.speed);
  }

  public MountainBike(int seatheight, int speed, int gears){
    this.seatheight = seatheight;
    this.speed = speed;
    this.gears = gears;
  }

  public int getseatHeight(){
    return this.seatheight;
  }

  public int getspeed(){
    return this.speed;
  }
  public int getgears(){
    return this.gears;
  }

  public void setseatHeight(int value){
    seatheight = value;
  }

  public void setspeed(int speed){
    this.speed = speed;
  }

  public void setgears(int gears){
    this.gears = gears;
  }
}
