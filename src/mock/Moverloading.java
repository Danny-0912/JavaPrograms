package mock;
class demob
{
	void add()
	{
		System.out.println("herllo");
	}
	void add(int a)
	{
		System.out.println(a);
	}
	void add(int a,String b)
	{
		System.out.println(a+b);
	}
	void add(int a,char b)
	{
		System.out.println(a+b);
	}
}
public class Moverloading 
{
	public static void main(String [] args)
	{
		demob a=new demob();
		a.add();
		a.add(10);
		a.add(10,'g');
		a.add(30,"kavitha");
		
	}

}
