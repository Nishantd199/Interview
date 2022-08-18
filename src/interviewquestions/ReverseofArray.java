package interviewquestions;

public class ReverseofArray {
	public static void main(String[] args) {
		int a[]={15,47,52,87,66};
		int size=a.length;
		int temp=0;
		for(int i=0;i<=size-1;i++)
		{
			for(int j=i;j<=a.length-1;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<=size;i++)
		{
			System.out.println(+temp);
		}
		
	
	}

}
