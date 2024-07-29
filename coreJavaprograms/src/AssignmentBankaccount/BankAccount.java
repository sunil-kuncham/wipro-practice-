package AssignmentBankaccount;

public class BankAccount {
	long accountnumber;
	double balance;
	public BankAccount(long accountnumber,double balance) {
		this.accountnumber=accountnumber;
		this.balance=balance;
		}
	public long getAccountNumber() {
		return accountnumber;
	}
	public double getBalance() {
		return balance;
	}
	public double setBalance() {
		return balance;
	}
	
	public void deposit(double amount)
	{
		if(amount>0)
        {
			balance+=amount;
			System.out.println("Deposit :"+amount);
        }
		else {
			System.out.println("Deposit should be greater than zero");
			
		}
		
		
	}
	public void withdraw(double amount)
	{
		if(amount>0)
		{
			if(amount<=balance) {
				balance-=amount;
				System.out.println("withdraw amount:"+amount);
			}
			else {
				try {
					throw new InsufficientFundsException();
				}
				catch (InsufficientFundsException ie)
				{
					System.out.println("Insufficient Funds in account");
				}
			}
		}
		else {
			System.out.println("Amount should be positive");
		}
	}
	
	
}	

