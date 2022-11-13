package syncro;

class Shared
{
	synchronized void test()
	{
		Thread t1= Thread.currentThread();
		System.out.println(t1.getName()+"test1 begin");
		for(int i=0; i<10 ;i++)
		{
			System.out.println(t1.getName()+" : "+i);
		}
	}
	
	void test2()
	{
		Thread t2 = Thread.currentThread();
		
		System.out.println( t2.getName()+"test2 beging");
		for(int i =20; i< 50;i++)
		{
			System.out.println(t2.getName()+":"+i);
		}
	}
}

class A extends  Thread
{
	Shared s1;
	
	A(Shared s1 )
	{
		this.s1 =s1;
	}
	public void run()
	{
		s1.test();
	}
}

class B extends Thread
{
	Shared s1;
	
	B(Shared s1)
	{
		this.s1=  s1;
	}
	
	public void run()
	{
		s1.test();
	}
}
public class M1 
{
	public static void main(String[] args) 
	{
		Shared s1 = new Shared();
		//Shared s2 = new Shared();
		A a1 = new A(s1);
		B b1 = new B(s1);
		
	a1.start();
	b1.start();
	
	
	}
}
