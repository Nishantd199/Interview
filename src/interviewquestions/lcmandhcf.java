package interviewquestions;

import java.util.Scanner;

public class lcmandhcf {
	public static void main(String[] args) {
	int a,b;
	int bigger,smaller;
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter the number");
	a=Sc.nextInt();
	b=Sc.nextInt();
	if(a>b)
	{
		bigger=a;
		smaller=b;
	}
	else
	{
		smaller=a;
		bigger=b;
	}
	for(int i=1;i<=bigger;i++)
	{
		if(((bigger*i)%smaller)==0)
		{
			int lcm=bigger*i;
			System.out.println("the LCM is" +(lcm));
			break;
		}
	}
	}
	}
