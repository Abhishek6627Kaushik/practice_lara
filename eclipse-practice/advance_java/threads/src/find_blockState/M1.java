package find_blockState;

class Util
{
	static void sleep(long milles)
	{
		try
		{
			Thread.sleep(milles);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		
	}
	
}
class A 
{
	synchronized void test1(A obj)
	{
		Thread t1 = Thread.currentThread();
		
		System.out.println("test1 "+t1.getName());
		Util.sleep(1000);
		obj.test2(this);
	}
	
	synchronized void test2(A obj)
	{
		Thread t2 = Thread.currentThread();
		
		System.out.println("test2 "+t2.getName());
		Util.sleep(1000);
		obj.test1(this);
	}
	
}

class B extends Thread
{
	A a1 ,a2 ;
	B(A a1 , A a2)
	{
		this.a1= a1;
		this.a2 =a2;
	}

	public void run()
	{
		a1.test2(a2);
	}
	
}
class C extends Thread
{
	A  a1 , a2;
	
	C(A a1 , A a2)
	{
		this.a1=a1;
		this.a2= a2;
	}
	public void run()
	{
		a2.test1(a1);
	}
}
public class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
	
		B b1 = new B(a1, a2 );
		b1.start();
		Util.sleep(500);
		C c1 = new C(a1, a2);
		c1.start();
		Util.sleep(1000);
		
		System.out.println(b1.getState());
		System.out.println(c1.getState());
	}
}
