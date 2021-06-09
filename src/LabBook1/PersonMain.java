package LabBook1;
 
class Person
{
	String Firstname;
	String LastName;
	char Gender;
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
	Person()
	{
		
	}
	Person(String f,String l,char g)
	{
		this.Firstname=f;
		this.LastName=l;
		this.Gender=g;
	}
	
	void display()
	{
		System.out.println("First name : "+this.Firstname+" \nLast name : "+this.LastName+ "\nGender : "+this.Gender);
	}
}

public class PersonMain {
	

	public static void main(String[] args) {
		Person a=new Person("Aakash","Katariya",'m');
		a.display();
		
		

	}

}
