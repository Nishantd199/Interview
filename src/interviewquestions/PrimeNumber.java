package interviewquestions;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
	int n;
	int count = 0;
	Scanner Sc=new Scanner(System.in);
	System.out.println("Entet the Number");
	n=Sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("It is prime no.");
	}
	else
	{
		System.out.println("It is not prime Number");
	}
	
	
	
	}
}
