package pack;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String year1 = null;
       System.out.println("Enter the year");
       year1 = sc.next();
       int n = year1.length();
       int year = 0;
       if(n==4)
       {
    	   year = Integer.parseInt(year1);
    	   Boolean isPrime = ((year % 4==0)|| (year % 100 ==0) || (year % 400 ==0));
    	   if(isPrime)
    	   {
    		   System.out.println("Its Leap Year");
    	
    	   }
    	   else
    	   {
    		   System.out.println("It is not leap year");
    	   }
       }
       else
       {
    	   System.out.println("Please enter proper input");
       }
	}
	}


