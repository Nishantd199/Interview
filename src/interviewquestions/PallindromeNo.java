package interviewquestions;

import java.util.Scanner;

public class PallindromeNo {
	 public static void main(String args[]){  
		 int r;
		 int sum=0;
		 int temp;
		 int n;
		 Scanner Sc=new Scanner(System.in);
		 System.out.println("Enter the Number");
		 n=Sc.nextInt();
		 temp=n;
		 while(n>0)
		 {
			 r=n%10;
			 n=n/10;
			 sum=(sum*10)+r;
		 }
		 if(temp==sum)
		 {
			 System.out.println("No. is pallindrom");
		 }
		 else
		 {
			 System.out.println("No. is not pallindrome");
		 }
		
	}
}

