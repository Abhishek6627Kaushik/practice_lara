package classpack1;
// Thread without creating r1 object
public class F
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread( new Runnable() 
		{
			@Override
			public void run() 
			{
				for (int i = 60; i <100; i++)
				{
					System.out.println(i);
				}	
			}
		});
		
		t1.start();
		
		for (int i = 1; i <50; i++)
		{
			System.out.println(i);
		}
	}
}
