package app21_methods;

public class A1
{
	static int i = test();
	public static void main(String[] args) 
	{
		System.out.println("main begin");
			
			System.out.println("main end "+i);
	}
	
	static int test()
	{
	return 100;
	}
}
