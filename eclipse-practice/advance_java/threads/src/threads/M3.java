package threads;

import java.util.Iterator;

class A extends Thread 
{
	
	public void run()
	{
		for (int i =1; i<=1000;i++)
		{
			System.out.println("first loop:" +i);
		}
	}
}
class B extends Thread 
{
	
	public void run()
	{
		for (int i =4000; i<=5000;i++)
		{
			System.out.println("third loop:" +i);
		}
	}
}
public class M3 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
		B b1  = new B();
		b1.start();
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
//we can not pridict how many intration for perticular thread 

/*
 *Thread is a Concrete class availble in java.lang package 
 *Disegn a sub class to thread in the thread  class serverl concrete method avilble
 *all concrete method ovride to a and b class  in a and b class run metho we are override
 *
 * 
 * how to  create a thread disigin a sub class to thread and override a run method and create a task in body of the run method
 * in a main class create an object to a (while create an object to a  thread is creating bcz a is sub class to thread)and called start method 
 * by using a class refreace varible (a1.start) we not directly called run method
 * run method is not created thread we are called start thread ()  
	start method also inherited method to thread calss to sub class
	java api 2 aproch to create a thread  frist is disgn a sub class to thread 
	second is using Runnable
*
*/