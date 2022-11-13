package classpack1;
class Thrread extends Thread
{
	public void run()
	{
		for (int i = 60; i <100; i++)
		{
			System.out.println(i);
		}
	}
}
 
public class B
{
	public static void main(String[] args)
	{
		
	Thrread t1 = new Thrread();
	t1.start();
		
		for (int i = 1; i <50; i++)
		{
			System.out.println(i);
		}
	}
}
