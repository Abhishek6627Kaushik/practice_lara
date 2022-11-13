package classpack1;

public class H
{
	static Thread test()
	{
		return new Thread()
		{
			public void run()
			{
				for (int i = 60; i <100; i++)
				{
					System.out.println(i);
				}
			}
			
		};
	}
		public static void main(String[] args)
	
		{
			test().start();
			
			for (int i = 1; i <50; i++)
			{
				System.out.println(i);
			}
		}
}

