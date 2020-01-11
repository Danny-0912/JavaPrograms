package mock;
class add
{
	 add()
	{
		 this(45,'g');
		System.out.println("herllo");
	}
	 add(int a)
	{
		System.out.println(a);
	}
	add(int a,String b)
	{
		this(10);
		System.out.println(a+b);
	}
	add(int a,char b)
	{
		this(10,"kavitha");
		System.out.println(a+b);
	}
}
public class Coverloading 
{
	public static void main(String [] args)
	{
		new add();
	}
}