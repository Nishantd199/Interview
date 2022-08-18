package interviewquestions;

public class MinimumnoinArray {
	public static void main(String[] args) {
		int c[]= {13,56,74,89,17};
		int size=c.length;
		int min=c[0];
		for(int i=0;i<c.length;i++)
		{
			if(c[i]<min)
			{
				min=c[i];
			}
		}System.out.println(min);
	}

}
