package classpack1;
//Thread implement annoynmous without creating Thread object
public class G 
{
	public static void main(String[] args) 
	{
		new Thread (new Runnable() 
		{
			
			@Override
			public void run()
			{
				for (int i = 60; i <100; i++)
				{
					System.out.println(i);
				}
			}
		}).start();
		
		for (int i = 1; i <50; i++)
		{
			System.out.println(i);
		}
	}
}
