package LabBook1;
import java.util.Scanner;
import java.util.Arrays;

public class StringPositive {

	static boolean checkString(String s)
	{
		int n = s.length();
	
	
		char c[] = new char [n];
	
		for (int i = 0; i < n; i++) {
			c[i] = s.charAt(i);
		}
			Arrays.sort(c);
	
		for (int i = 0; i < n; i++)
			if (c[i] != s.charAt(i))
				return false;
			
		return true;	
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter String to check: ");
		Scanner scr = new Scanner(System.in);
		String s = scr.nextLine();
		
		if (checkString(s))
		System.out.println("Yes");
		else
			System.out.println("No");
		scr.close();
		
	}
}
