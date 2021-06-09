package LabBook1;


class Person1
{
	String Firstname;
	String LastName;
	char Gender;
	long mno;
	
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	Person1()
	{
		
	}
	Person1(String f,String l,char g,long no)
	{
		this.Firstname=f;
		this.LastName=l;
		this.Gender=g;
		this.mno=no;
	}
	
	void personDetails()
	{
		System.out.println("First name : "+this.Firstname+" \nLast name : "+this.LastName+ "\nGender : "+this.Gender+"\nMobile number:"+this.mno);
	}
}

public class Personmain1 {
	

	public static void main(String[] args) {
		Person1 a=new Person1("Aakash","Katariya",'m',964416);
		a.personDetails();
		
		

	}

}

