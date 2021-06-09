package LabBook2;





import java.util.concurrent.atomic.AtomicInteger;

class Human
{
	private String name;
	private float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getAge() {
		return age;
	}
	public void setAge(Float age) {
		this.age = age;
	}
	public Human(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	
	
}
class Account 
{
	private long accNum;
	private double balance;
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
	double newBalance = balance - amount;
    balance = newBalance;
	}
	public Account(long accNum, double balance, Human accHolder) {
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

public class Lab2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtomicInteger count = new AtomicInteger(0);
		Human h1=new Human("Smith",24);
		Account a1=new Account(count.incrementAndGet(),2000,h1);
		
		Human h2=new Human("Kathy",22);
		Account a2=new Account(count.incrementAndGet(),3000,h2);
		
		a1.deposit(2000);
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

