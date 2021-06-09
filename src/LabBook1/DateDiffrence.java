package LabBook1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
  
public class DateDifference {

    static void findDifference(LocalDate start_date, LocalDate end_date)
    {

        Period diff = Period.between(start_date,end_date);
  
        System.out.print("Difference " + "between two dates is: ");
  
        System.out.printf( "%d years, %d months"+ " and %d days ",
            diff.getYears(),
            diff.getMonths(),
            diff.getDays());
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the First Date in the format of YYYY/MM/DD");
       String f_date = sc.nextLine();
       DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/M/d");
       LocalDate first_date = LocalDate.parse(f_date, dateFormat);
       
       System.out.println("Enter the Second Date in the format of YYYY/MM/DD");
       String s_date = sc.nextLine();
       DateTimeFormatter dateFormat2 = DateTimeFormatter.ofPattern("yyyy/M/d");
       LocalDate second_date = LocalDate.parse(s_date, dateFormat2);
          
       findDifference(first_date,second_date);
       sc.close();
       
    }
}
