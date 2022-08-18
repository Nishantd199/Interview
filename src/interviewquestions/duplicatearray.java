package interviewquestions;

public class duplicatearray {
	public static void main(String[] args) {
	int[]arr=new int[] {15,89,45,89,20,45};
	System.out.println("duplicate number in array");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
				System.out.println(arr[j]);
		}
	}
	}
}
