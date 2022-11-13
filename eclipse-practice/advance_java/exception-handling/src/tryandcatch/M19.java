package tryandcatch;

public class M19
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int  i = 100/0;
			System.out.println(2);
		} 
		catch (ArithmeticException ex) 
		{//to handle an exception catch body use try block in catch body
			System.out.println("catch begin ");
			try 
			{
				System.out.println(3);
				int i = 100/0; 
				System.out.println(4);
			}
			catch (ArithmeticException ex2)
			{
				System.out.println(5);
			}
		
			System.out.println("catch end");
		}
		System.out.println("main end");
	}
}

// we can gave try catch anywhere were you find any abnormal condition you gave try catch any where
