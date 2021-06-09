package service;
import LabBook.src.bean.Employee;

public interface EmployeeService
{
	
	public Employee getEmpDetails();
	public String InsuranceScheme(String designation,double salary);
	public void EmpDetails(Employee emp);
	
	
}
