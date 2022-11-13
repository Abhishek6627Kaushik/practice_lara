package threads;

class C implements Runnable
{
	
	public void run()
	{
		for (int i =1; i<=1000;i++)
		{
			System.out.println("first loop:" +i);
		}
	}
}
class D implements Runnable 
{
	
	public void run()
	{
		for (int i =4000; i<=5000;i++)
		{
			System.out.println("third loop:" +i);
		}
	}
}
public class M4 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		Thread t1 = new Thread(c1);
		t1.start();
		D d1  = new D();
		Thread t2 = new Thread(d1);
		t2.start();
		for (int i =1; i<=1000;i++)
		{
			System.out.println("first loop:" +i);
		}
		
		for (int i =2000; i<=3000;i++)
		{
			System.out.println("second loop:" +i);
		}
		
		for (int i =4000; i<=5000;i++)
		{
			System.out.println("third loop:" +i);
		}
		
	}
}

/*
 * Runnable a funcitnol interface availble in java.lang
 *
 *funcinol interface = single method interface
 *
 *marker interface = interface without member called marker interface
 now c class contanign object class member and interface member
  by  creating  object of c thread is not creating
  
  one we create object of  c  then create a thread now suplly refrence in thread constrctor
  like 
  C c1 = new C();
  Thread t1 = new Thread(c1);
  
  thread class contanig sevrel constructor among them
  one constroter is a runnable type
  
  now child thread is creating
  class class start method newly creaed thread alocating to threadsheduler
 *this aproch is the best aproach
 */