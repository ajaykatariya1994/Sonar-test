package pil;


import java.util.Scanner;

import bean.Employee;
import service.EmployeeService;

public class ServicesOffered implements EmployeeService{

@Override	
public Employee getEmpDetails()	
{
	
	String designation;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter id of emp");
	int id=scan.nextInt();
	
	System.out.println("enter name of emp");
	String name=scan.next();
	
	System.out.println("ente1r salary of emp");
	int salary=scan.nextInt();
	String insuranceScheme=null;
	
	
	if(salary>5000 && salary<20000)
	{
		designation="System Associate";
		
	}
	else if(salary>=20000 && salary<40000)
	{
		designation="Programmer";
	}
	else if(salary>=40000)
	{
		designation="Manager";
	}
	else
	{
		designation="Clerk";
	}
	
	Employee e=new Employee(id, name, designation, insuranceScheme, salary);
	return e;
	
	
	
}
@Override
public String InsuranceScheme(String designation, double salary) {
	// TODO Auto-generated method stub
	String scheme;
	if(designation=="System Associate")
	{
		scheme="Scheme C";
	}
	else if(designation=="Programmer"){
		scheme="Scheme B";
	}
	else if(designation=="Manager"){
		scheme="Scheme B";
	}
	else
	{
		scheme="No Scheme";
		}
	return scheme;
}
	


@Override
public void EmpDetails(Employee emp) {
	// TODO Auto-generated method stub
	
 System.out.println("Employee ID"+emp.id);
 System.out.println("Employee Name"+emp.name);
 System.out.println("Employee Designation"+emp.designation);
 System.out.println("Employee Insurance Scheme"+emp.insuranceScheme);
 System.out.println("Employee salary"+emp.salary);
 
	
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   ServicesOffered so=new ServicesOffered();
	   Employee e =so.getEmpDetails();
	   String s=so.InsuranceScheme(e.designation,e.salary);
	   e.insuranceScheme=s;
	   Employee person = new Employee(e.id,e.name,e.designation,e.insuranceScheme,e.salary);
	   so.EmpDetails(person);
	   System.out.println(s);
		
		
	

}

}
