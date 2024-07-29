package AssignmentBankaccount;

public class Operation {
	public static void main(String[] args)
	{
		BankAccount account=new BankAccount(709358545,5000);
		System.out.println("Account number is:"+account.getAccountNumber());
		System.out.println("Balance is"+account.getBalance());
		account.deposit(6000);
		System.out.println("Balance after deposit:"+account.getBalance());
		account.withdraw(5000);
		System.out.println("Balance after withdraw:"+account.getBalance());
		
	}

}
