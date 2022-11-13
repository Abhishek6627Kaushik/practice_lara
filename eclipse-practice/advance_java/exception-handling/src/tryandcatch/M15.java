package tryandcatch;

public class M15 
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
		{
			ex.printStackTrace();// this is the pre-difine method its order to print every information of exception
		}
		System.out.println("main end");
	}
}
