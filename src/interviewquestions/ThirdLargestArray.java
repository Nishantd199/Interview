package interviewquestions;

public class ThirdLargestArray {
public static int getthirdLargest(int[] a, int total){ 
		
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-3];  
		}  
		public static void main(String args[]){  
		int a[]={11,25,54,67,53,24};   
		System.out.println("Second Largest: "+getthirdLargest(a,6));   
		}

}
