package mock;
class demoab
{
	int a=29;
	static void add(demoab a1)
	{
		System.out.println("hello");
	}
}
class sampleab extends demoab
{
	static void add(sampleab a2)
	{
		System.out.println("hi");
	}
}
class dispab extends sampleab
{
	void add(dispab a3)
	{
		System.out.println("bye");
	}
}
class stimulation
{
	static void add(stimulation n)
	{
	n.add();
	}}
public class passbyreference 
{
	public static void main(String [] args)
	{
		demoab d=new demoab();
		sampleab s=new sampleab();
		dispab d1=new dispab();
		stimulation a=new stimulation();
		stimulation.add(d);
		stimulation.add(s);
		stimulation.add(d1);		
	}
}
