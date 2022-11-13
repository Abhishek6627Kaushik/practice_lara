package classpack1;
// Thread extend thread with announymous class
public class D
{
	public static void main(String[] args) 
	{
		Thread t2 = Thread.currentThread();
		Thread t1= new Thread()
		{
			public void run()
			{
				for (int i = 60; i <100; i++)
				{
					System.out.println(i+" t1: "+t2);
				}
			}
		};
		
		t1.start();
		for (int i = 1; i <50; i++)
		{
			System.out.println(i+ " main:  "+t2);
		}
		
	}
}
