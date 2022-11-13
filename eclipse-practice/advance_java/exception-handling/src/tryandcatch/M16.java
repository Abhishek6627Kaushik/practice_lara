package tryandcatch;

public class M16
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
		catch (NullPointerException ex) // this is handle only null pointer exception 
		{// not handle arithmetic exception
			System.out.println("from catch "+ex);
	
		}
		System.out.println("main end");
	}
}
