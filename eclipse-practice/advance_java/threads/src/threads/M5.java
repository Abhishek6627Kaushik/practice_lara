package threads;


class E extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 200; i <=300; i++) 
		{
			System.out.println(getName()+":"+i);	
		}
	}
}

public class M5 
{
	public static void main(String[] args)
	{
		E e1 = new E();
		e1.start();
		
		E e2 = new E();
		
		e2.start();
		
		for (int i = 1; i <=100; i++) 
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}



/*thread class containg  getname method
 * 
 *in m5 we need to get one thread refrance in currnet thread  
 * 
 * m5 thread is not a sub class to thread
 * 
 * in order to get current thread refrence go for Thread.currentthread() method
 */
