package mock;
public class duplicates
{
	public static void main(String[] args) 
	{
		String a[]={"hi","hello","bye","hi","bye"};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=null)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						a[j]=null;
					}
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]!=null)
			{
				System.out.println(a[i]);				
			}		
		}
	}
}
