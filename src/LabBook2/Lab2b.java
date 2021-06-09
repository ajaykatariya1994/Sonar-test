package LabBook2;



import java.util.concurrent.atomic.AtomicInteger;

class Accounts 
{
	private long accNum;
	protected double balance;
	private Human accHolder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Human getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Human accHolder) {
	this.accHolder = accHolder;
	}
	
	
	void deposit(double amount)
	{
		double newBalance = balance + amount;
        balance = newBalance;
	}
	void withdraw(double amount)
	{

	    
	      //System.out.println ("Withdrawl from account " + account);
	      System.out.println ("Amount: " + amount);

	      if (amount > balance)
	         System.out.println ("Insufficient funds.");
	      else {
	         balance -= amount;
	         System.out.println ("New balance: " + balance);
	      //   result = true;
	      }
	    //  return result;
	}
	public Accounts(long accNum, double balance, Human accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + ", getAccNum()="
				+ getAccNum() + ", getBalance()=" + getBalance() + ", getAccHolder()=" + getAccHolder() + "]";
	}
	
	
}



class SavingsAccount extends Accounts
{
	public final int minBalance=1000;
      
		
	
	public SavingsAccount(long accNum, double balance, Human accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}
	@Override
	void withdraw(double amount)
	{
		//boolean result=false;

	      if (minBalance>balance-amount)
	         System.out.println ("Insufficient funds.");
	      else {
	         balance -= amount;
	         System.out.println ("New balance: " + balance);
	      //   result = true;
	      }
	      //return result;
		
		
	}
	
	
	
}

class CurrentAccount extends Accounts
{
   public int overdraftLimit=3;
   public final int minBalance=100;
   static int counter=1;
   
	public CurrentAccount(long accNum, double balance, Human accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}
	@Override
	
	void withdraw (double amount) {
		boolean result=false;
		if(counter>overdraftLimit && minBalance>balance-amount)
		{
			System.out.println ("Insufficient funds.");
		}
		      else {
		         balance -= amount;
		         System.out.println ("New balance: " + balance);
		         result = true;
		         counter++;
		      }
	
		    //  return result;
	}


		   
	}
	

public class Lab2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AtomicInteger count = new AtomicInteger(0);																																																					
		Human h1=new Human("Smith",24);
		
		SavingsAccount a1=new SavingsAccount(count.incrementAndGet(), 5000, h1);
		a1.withdraw(6000);
		
		Human h2=new Human("Kathy",22);
		CurrentAccount a2=new CurrentAccount(count.incrementAndGet(), 5000, h2);
		a2.withdraw(2000);
		
	
		
		
		
		
		
		
		System.out.println(a1.getAccHolder().getName()+" Balance "+ a1.getBalance());

		System.out.println(a2.getAccHolder().getName()+ " Balance "+ a2.getBalance());
		
		//Human h1=new Human();
	//	h1.setName("Smith");
		
		//a1.setAccHolder(h1);
		
		
		
		//a1.setName("Smith");
		//a1.setBalance(2000);
		
	//	Account a2=new Account();
		//a2.setName("Kathy");
		//a2.setBalance(3000);
		
		
		//a1.deposit(2000);
		//a2.withdraw(2000);
		
		//System.out.println("Smith Balance is" +a1.getBalance());
	//	System.out.println("Kathy Balance is" +a2.getBalance());
		
		
	}

}

