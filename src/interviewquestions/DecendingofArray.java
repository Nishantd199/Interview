package interviewquestions;

public class DecendingofArray {
	public static void main(String[] args) {
		int a[]= {10,54,59,78,12,45};
		int size=a.length;
		int temp;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
				
		}
		   for(int i=0;i<size;i++) 
		{
			System.out.println(a[i]);
		}
	}
	

}
