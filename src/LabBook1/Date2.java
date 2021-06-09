package LabBook1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
  
public class Date2 {
    static void findDifference(LocalDate start_date, LocalDate end_date)
    {
        Period diff = Period.between(start_date,end_date);

        System.out.print( "Difference "+ "between two dates is: ");

        System.out.printf(
            "%d years, %d months"
                + " and %d days ",
            diff.getYears(),
            diff.getMonths(),
            diff.getDays());
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Date in the format of YYYY/MM/DD");
       String c_date = sc.nextLine();
       sc.close();
       DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/M/d");
       LocalDate current_date = LocalDate.parse(c_date, dateFormat);
       LocalDate system_date = LocalDate.now();    
       findDifference(current_date,system_date);
    }
}
