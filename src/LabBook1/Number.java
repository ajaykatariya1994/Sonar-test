package LabBook1;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		if(input>0)
			System.out.println("positive");
		else
			System.out.println("negative");

	}

}
