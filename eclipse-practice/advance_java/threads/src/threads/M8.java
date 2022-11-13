package threads;

import java.util.Iterator;

class H implements Runnable
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
public class M8 
{	
	public static void main(String[] args)
	{
		H h1 = new H();
		Thread t1 = new Thread(h1);
		
		//t1.start();
		t1.run();
		for (int i = 100; i <= 200; i++) 
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

/*
this is the second way of creating thread
t1.run = now main thread is going to run method excuting run method 
even though child thread is created it is not allocted to excute run method it is not register in thread sheduler
bcz we are not call start method thats why we get sequnce wise flow
 by calling ru metod of t1 its going to h1 class	  
*/