package LabBook1;

import java.util.Date;
import java.util.Scanner;
public class CalculatingAge {
	
	public int calage(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter date of birth");
		String dob = in.next();
		Date date1 = new Date(dob);
		Date today = new Date();
		int age = today.getYear() - date1.getYear();
		return age;
	}

}
