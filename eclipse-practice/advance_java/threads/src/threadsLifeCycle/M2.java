package threadsLifeCycle;

class A extends Thread
{
		@Override
		public void run() 
		{
				for (int i = 1; i <=100; i++) 
				{
					System.out.println(i);
				}
		}
}
public class M2
{
	public static void main(String[] args) throws InterruptedException
	{
		A a1 = new A();
		System.out.println("a:"+a1.getState());
		a1.start();
		System.out.println("b:"+a1.getState());
		Thread.sleep(7);
		System.out.println("c:"+a1.getState());
		Thread.sleep(1000);
		System.out.println("d:"+a1.getState());
		System.out.println("d:"+a1.getState());
		
	}
}
/*
	every thred by defaoult going  3state  new runnable and terminated
	
*/