package interviewquestions;

public class AssendingOrderofArray {
		public static void main(String[] args) {
			for(int i=6;i>=1;i--)
			{
				for(int j=6-1;j>=1;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}System.out.println(" ");
			}
		}
	}


