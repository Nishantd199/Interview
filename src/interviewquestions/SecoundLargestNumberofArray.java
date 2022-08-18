package interviewquestions;

public class SecoundLargestNumberofArray {
	public static int main(String[] args) {
		int a[]= {12,43,5,56,76,23,44,94,37};
		int temp;
		int size=a.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Secound largest of array" +a[size-2]);
		return size;
		
	}

}
