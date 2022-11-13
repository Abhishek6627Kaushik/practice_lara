package rough;
class A  extends Thread
{
	
	@Override
	public void run() 
	{
		for (int i = 200; i <=300; i++) 
		{
			System.out.println("for loop A "+i);
		}
	}
}


public class A1 
{
	public static void main(String[] args)
	{
		
		A a1 = new A();
		
		a1.start();
		for (int i = 1; i <=100; i++) 
		{
			System.out.println("for loop main"+i);
		}
		
	}
}
