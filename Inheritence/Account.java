package Inheritence;

public class Account {
  protected int ac_number;
  protected int balance;
  protected String type;

  public Account(int ac, int b, String ty){
    ac_number = ac;
    balance = b;
    type = ty;
  }
  public void debit(int amount){
    this.balance-=amount;
  }
  public void credit(int amount){
    this.balance+=amount;
  }
}
  

