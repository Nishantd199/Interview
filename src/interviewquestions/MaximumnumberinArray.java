package interviewquestions;

public class MaximumnumberinArray {
	public static void main(String[] args) {
		int a[]= {10,15,45,778,49,56,12};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}System.out.println(max);
	}

}
