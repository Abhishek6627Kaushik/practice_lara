package tryandcatch;

public class M21 
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		try 
		{
			System.out.println(1);
			int i =20; 
			System.out.println(2);
		} 
		catch (ArithmeticException ex)
		{
			System.out.println("catch begin");
			int j =90;
			System.out.println("catch end");
		}
		//System.out.println("main end"+ex);// here i am using catch local member outside the catch
		// ex is local to catch we cant us e local member of catch outside the catch
		//j =100;
	}
}
