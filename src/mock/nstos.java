package mock;
class disp
{
	int add(int a,int b)
	{
		System.out.println("hello");
		return a;
	}
}
public class nstos 
{
	public static void main(String [] args)
	{
		disp a=new disp();
		System.out.println(a.add(10,24));	
	}

}
