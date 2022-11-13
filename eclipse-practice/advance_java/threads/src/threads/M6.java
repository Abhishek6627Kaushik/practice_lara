package threads;

class F implements Runnable
{
	@Override
	public void run() 
	{
		for (int i = 1; i <=100; i++) 
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
public class M6
{
	public static void main(String[] args) 
	{
		F f1 = new F();
		Thread t1 = new Thread(f1);
		t1.start();
		
		Thread t2 = new Thread (f1);
		t2.start();
		
		for (int i = 5000; i <=6000; i++) 
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

/*
	f implemt runnable is not sub class to thread f class doesnt have getname method
	 we need to use Thread.currentthread();
 we can create multiple thread object by suppling same f1 refrance
 we cant call t1.start two time both are child thread
*/

