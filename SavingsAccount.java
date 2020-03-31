
public class SavingsAccount extends BankAccount {
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double balance)
	{
		super(name, balance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	public void postInterest()
	{
		double balance = getBalance();
		double interest = balance * (1 + (rate / 12));
		setBalance(interest);
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public SavingsAccount(SavingsAccount account, double balance)
	{
		super(account, balance);
		savingsNumber++;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
}
