class BankAccount
{
  double accountnumber,balance;
  
  public BankAccount(double myaccount,double mybalance)
  {
   accountnumber = myaccount;
   balance = mybalance;
  
  }
  
  public void deposit(double amount)
  {
  if (amount>0)
  {
  balance+=amount;
  System.out.println("Deposit:"+amount);
  }
  else{
  
  System.out.println("Deposit amount should be positive");
  }
  }
  public void  withdraw(double amount)
  {
  if(amount>0 && amount<=balance)
  {
  balance-=amount;
  System.out.println("withdraw:"+amount);
  }
  else{
  System.out.println("invalid amount");
  
  }
  }
public static void main(String[] args)
{
BankAccount mybankaccount=new BankAccount(70935,4500);
System.out.println("account number is :" +mybankaccount.accountnumber);
System.out.println(" initial nbalance is :" +mybankaccount.balance);
mybankaccount.deposit(500);
mybankaccount.withdraw(1000);
System.out.println(" final nbalance is :" +mybankaccount.balance);
}
}