package tryandcatch;

public class M18
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
			System.out.println("catch begin "); 	 
			int x = 10/0;// this statement is not a part of try
			 // because this is a part of catch  thats because any abnormal condition is handle in try body thats why flow is terminate
			System.out.println("catch end");
		}
		System.out.println("main end");
	}
}
