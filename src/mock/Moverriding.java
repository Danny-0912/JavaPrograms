package mock;
class democ
{
	void add()
	{
		System.out.println("herllo");
	}
	void add(int a)
	{
		System.out.println(a);
	}
}
class samplec extends democ
{
	void add(int a,String b)
	{
		System.out.println(a+b);
	}
	void add(int a,char b)
	{
		System.out.println(a+b);
	}
}
public class Moverriding 
{
	public static void main(String [] args)
	{
		samplec a=new samplec();
		a.add();
		a.add(10);
		a.add(10,'g');
		a.add(30,"kavitha");		
	}
}
