package pack1date7_5_22;

public class T
{
	static class A extends Thread
	{
		Thread t1;
		A (Thread t1)
		{
			this.t1 =t1;
		}
		
		public void run()
		{
			try 
			{
				sleep(1000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println(t1.getState());
		}
	}
	
	public static void main(String[] args)  
	{
		Thread t1 = Thread.currentThread();
		A a1 = new A(t1);//t1 is main thread refrece variable the refrance varible we senidng this to constructor
		a1.start();	
			try
			{
				a1.join();
			} 
			catch (InterruptedException ex) 
			{
				ex.printStackTrace();
			}
	}
}
