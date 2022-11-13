package threads;
class S extends Thread

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
public class M21 
{
	public static void main(String[] args) 
	{
		S s1  = new S();
		s1.start();
		try 
		{
			s1.join();
		} catch (InterruptedException ex) 
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}

/*
	here main thread is keep on waiting to finish on s1 thread 
	till child excution comlete get over  then continuing frutre
	thats why we get done after excution of child thread 
	after excution till child thread execution completelyy get over
	then it is resuming back
	
	main thread calling to child thread finish your execution  i will join after your run
	
	
*
*/