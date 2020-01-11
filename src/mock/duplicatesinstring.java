package mock;
public class duplicatesinstring
{
	public static void main(String [] args)
	{
		String a="java is programming";
		char b[]=a.toCharArray();
		int n=b.length;
		for(int i=0;i<n;i++)
		{
			if(b[i]!=0)
			{
				for(int j=i+1;j<n;j++)
				{
					if(b[i]==b[j])
					{
						b[j]=0;
					}
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(b[i]!=0)
			{
				System.out.println(b[i]);				
			}		
		}		
	}
}
