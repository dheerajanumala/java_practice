package Inheritence;

public class Bank extends Account{
  private String name;

  public Bank(int ac, int b, String ty, String n){
    super(ac,b,ty);
    super.credit(b/10);
    super.debit(b/10);
    name = n;
  } 
  public int getbalance(){
    return balance;
  }

  public int getAccountNumber(){
    return ac_number;
  }

  public String getAccType(){
    return type;
  }

  public String getName(){
    return name;
  }
  
}
