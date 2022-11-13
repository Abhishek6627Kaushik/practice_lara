package threads;


public class M22 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
			try 
			{
					Thread.sleep(2000, 500);
			} catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("main end");
	}
}

/*
Sleep method is a static method it is taking one argument that arguent  will be long data type
milli sec

sleep method is checked exception statement type  to interpted execption
there are two  overloaded sleep method 1st = one argumet method seconf is two argument method  
 we can supply no of mille second then no of neno second
 when ever we using sleep method we required try catch
*/