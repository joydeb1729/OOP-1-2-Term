package Creating_Classes;

import java.text.NumberFormat;

public class Account
{
  private final double RATE = 0.035;  // interest rate of 3.5%
  
  private long acctNumber;
  private double balance;
  private String name;
  
  //-----------------------------------------------------------------
  //  Sets up the account by defining its owner, account number,
  //  and initial balance.
  //-----------------------------------------------------------------
  public Account (String owner, long account, double initial)
  {
    name = owner;
    acctNumber = account;
    balance = initial;
  }
//-----------------------------------------------------------------
  //  Deposits the specified amount into the account. Returns the
  //  new balance.
  //-----------------------------------------------------------------
  public double deposit (double amount)  {
    if (amount > 0)
      balance = balance + amount;
    return balance;
  }
  
  //-----------------------------------------------------------------
  //  Withdraws the specified amount from the account and applies
  //  the fee. Returns the new balance.
  //-----------------------------------------------------------------
  public double withdraw (double amount)  {
    if (amount <= balance)
      balance = balance - amount ;
    return balance;
  }
  
//-----------------------------------------------------------------
  //  Returns the current balance of the account.
  //-----------------------------------------------------------------
  public double getBalance ()
  {
    return balance;
  }
  
  //-----------------------------------------------------------------
  //  Returns a one-line description of the account as a string.
  //-----------------------------------------------------------------
  public String toString ()
  {
    
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
  }
}

