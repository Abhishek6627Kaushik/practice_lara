package classpack1;

class Child implements Runnable
{
	public void run()
	{
		for (int i = 1; i <50; i++)
		{
			System.out.println(i);
		}
	}

}
public class C 
{
	public static void main(String[] args) 
	{
		Child c1 = new Child();
		
		Thread t1  = new Thread(c1);
		
		t1.start();
		for (int i = 1; i <50; i++)
		{
			System.out.println(i);
		}
	}
}
