package classpack1;
// Thread implemnt runnable method in announnmous class
public class E 
{
	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable() 
		{
			
			@Override
			public void run()
			{
				for (int i = 60; i <100; i++)
				{
					System.out.println(i);
				}
			}
		};
		Thread t1 = new Thread(r1);
		
		t1.start();
		for (int i = 1; i <50; i++)
		{
			System.out.println(i);
		}
		
	}
}
