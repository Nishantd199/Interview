package Practicle;

import java.util.Arrays;
import java.util.Scanner;

public class Starpattern{
	public static void main(String[] args) 
	{
		//string anagram or not
		String str="abCd";
		String Str="AbcD";
		str=str.toLowerCase();
		Str=str.toLowerCase();
		if(str.length()==Str.length())
		{
			System.out.println("String is anagram");
		}
		else
		{
			char c1[]=str.toCharArray();
			char c2[]=Str.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Anagram string");
			}
			else
			{
				System.out.println("Not anagram string");
			}
		}
	}
}



