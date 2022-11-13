package rough;

class B implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 200; i <= 300; i++) 
		{
			System.out.println("run B "+i);
		}
	}

}
public class B2
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		Thread t1 = new Thread(b1);
		t1.start();
		
		for (int i = 1; i <=100; i++) 
		{
			System.out.println("main thread:"+i);
		}
	}
}
