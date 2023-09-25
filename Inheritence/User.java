package Inheritence;

public class User {
  public static void main(String[] args){
    Bank bank = new Bank(1234, 1000, "Savings", "Dheeraj");
    bank.debit(100);
    System.out.println(bank.getbalance());
    System.out.println(bank.getAccType());
    System.out.println(bank.getAccountNumber());
    System.out.println(bank.getName());
  }
  
}
