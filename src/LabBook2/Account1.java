package LabBook2;



public class Account1 {
	
	private long AccountNumber;
	private double balance;
	private Personz AccHolder;
	
	public Account1(long AccountNumber,double balance,Personz AccHolder)
	{
		super();
		this.AccountNumber = AccountNumber;
		this.balance = balance;
		this.AccHolder = AccHolder;
	}

	public long getAccountNumber() 
	{
	return AccountNumber;
	}

	
	public void setAccountNumber(long AccountNumber) 
	{
	this.AccountNumber = AccountNumber;
	}

	
	public Personz getAccHolder() 
	{
	return AccHolder;
	}

	public void setAccHolder(Personz accHolder) 
	{
	this.AccHolder = accHolder;
	}

	public void setBalance(double balance) 
	{
	this.balance = balance;
	}
	public void deposit(double amount)
	{
	balance+=amount;
	}
	public void withdraw(double amount)
	{
	balance-=amount;
	}
	public void getBalance()
	{
	System.out.println(balance);
	}
	
	
	@Override
	public String toString() 
	{
	return "Account [accountnumber= " + AccountNumber + ", balance= " + balance
				+ ", accHolder= " + AccHolder + "]";
	}
	
	
}

