package interviewquestions;

public class stringreverse {
	public static void main(String[] args) {
		String N="Velocity";
		String Rev="";
		int a=N.length();
		for(int i=N.length()-1;i>=0;i--)
		{
			Rev=Rev + N.charAt(i);
		}System.out.println(Rev);
	}

}
