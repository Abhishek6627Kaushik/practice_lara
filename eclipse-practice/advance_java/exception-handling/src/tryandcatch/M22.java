package tryandcatch;

public class M22 
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int i  =20;
		// if there are requiredment to use local member naywhere decalere in main method
	
		
		try 
		{
			System.out.println(1); 
			i +=30;
			System.out.println(2);
		} 
		catch (ArithmeticException ex)
		{
			System.out.println("catch begin");
				i +=90;	
			System.out.println("catch end");
		}
		System.out.println("main end"+i);
	}
}
// we got output as 50 bcz no exception in the try body
// thats why catch is not excute

// if try excute sucefully catch wont excute
