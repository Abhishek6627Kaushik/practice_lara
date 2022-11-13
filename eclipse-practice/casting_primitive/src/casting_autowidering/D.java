package casting_autowidering;

public class D 
{

	static byte test()
	{
		System.out.println("test");
		return 10;
	}
	public static void main(String[] args)
	{
		byte b1 =  test();
		short s1 = test();//short s1 = (short) test();
		int i =  test();
		long lon = test();
		double d1 = test();
		System.out.println("done");
	}
}
