package interviewquestions;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the year");
		year=Sc.nextInt();
		if(year%400==0)
		{
			System.out.println("It is leap year");
		}
		else if(year%100==0)
		{
			System.out.println("It is not leap year");
		}
		else if(year%4==0)
		{
			System.out.println("It is leap year");
		}
		else
		{
			System.out.println("It is not leap year");
		}
	}

}
