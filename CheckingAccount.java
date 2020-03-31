
public class CheckingAccount extends BankAccount{
	public static double FEE = 0.15;
	private String accountNumber;
	public CheckingAccount(String name, double amount)
	{
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-10";
	}
	public boolean withdraw(double amount)
	{
		amount += FEE;
		return super.withdraw(amount);
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
}
