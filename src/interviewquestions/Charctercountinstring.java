package interviewquestions;

import java.util.Scanner;

public class Charctercountinstring {
	public static void main(String[] args) {
		int num;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=Sc.nextInt();
		if(num%2==0)
		{
			System.out.println("num. is even" + num);
		}
		else
		{
			System.out.println("num. is odd" +num);
		}
	}
}
