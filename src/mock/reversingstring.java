package mock;
public class reversingstring
{
	public static void main(String [] args)
	{
		String s="the java";
		int n=s.length();
		for(int i=n-1;i<=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}
}
