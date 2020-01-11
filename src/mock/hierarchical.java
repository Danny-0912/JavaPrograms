package mock;
class demoa
{
	void add()
	{
		System.out.println("hi");
	}
}
class samplea extends demoa
{
	void sub()
	{
		System.out.println("hello");
	}
}
class dispa extends demoa
{
	void mul()
	{
		System.out.println("bye");
	}
}

public class hierarchical
{
	public static void main(String [] args)
	{
		dispa a=new dispa();
		a.add();
		a.mul();
		samplea b=new samplea();
		b.add();
		b.sub();
	}
}
