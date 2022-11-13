package tryandcatch;

public class M17 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		try
		{
			System.out.println(1);
			int  i = 100/0; // if abnormal condition is not there in ttrh then catch is not responsible
			System.out.println(2);
		} 
		catch (ArithmeticException ex) 
		{
			System.out.println("from catch "+ex);
	
		}
		System.out.println("main end");
	}
}
