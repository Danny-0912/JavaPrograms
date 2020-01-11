package mock;
class demo
{
	void add()
	{
		System.out.println("hi");
	}
}
class sample extends demo
{
	void add()
	{
		System.out.println("hello");
	}
}
class map extends demo
{
	void add()
	{
		System.out.println("bye");
	}
}
class std
{
	static void sub(demo a)
	{
		a.add();
	}
}
public class rtp
{
	public static void main(String [] args)
	{
		map m=new map();
		sample s=new sample();		
		std.sub(m);
		std.sub(s);
	}
}

