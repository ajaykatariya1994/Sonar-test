package LabBook1;
import java.util.Scanner;
public class StringOperation {
	
	

		public static void main(String[] args) {
			
			
			System.out.println("Enter String");
			Scanner sc= new Scanner(System.in);
			String name= sc.nextLine();
			System.out.println("Orignal String is: "+name);
			System.out.println("1.After adding to itself String is: "+name.concat(name)+"\n");
			StringBuffer sb= new StringBuffer(name);
			for(int i=0;i<name.length();i++){
				if(i%2!=0){
					sb.setCharAt(i,'#');
				}
				
			}
			System.out.println("After replacement String will be: "+sb);
			
			
			StringBuffer sb2= new StringBuffer(name);
			for(int i =0;i<name.length();i++){
				
				if(i%2!=0){
					sb2.setCharAt(i,Character.toUpperCase(name.charAt(i)));
				}
			}
			System.out.println("After second  replacement String will be: "+sb2);
			
			String  name2="";
			for(int i=0;i<name.length();i++){
				
			Boolean found = false;
				for(int j=0;j<name2.length();j++){
					if(name.charAt(i)==name2.charAt(j)){
						found=true;
						break;
					}
				}
				if(found==false){
					name2=name2.concat(String.valueOf(name.charAt(i)));
				}
			}
			System.out.println("final String: "+name2);
	sc.close();
	}}



