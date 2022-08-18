package interviewquestions;

import java.util.Scanner;

class ArmstrongNo{
	public static void main(String[] args) {
		int sum;
		int num;
		int i=0;
		int n=0;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=Sc.nextInt();
		sum=0;
		i=num;
		while(num>0)
		{
			n=num%10;
			num=num/10;
			sum=sum +(n*n*n);
		}
		if(num==i)
		{
			System.out.println("Arm");
		}
		else
		{
			System.out.println("not Arm");
		}
	}
	
}
