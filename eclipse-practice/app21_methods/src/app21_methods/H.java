package app21_methods;

public class H 
{
	static void test1()
	{
		System.out.println("test1 begin");
		System.out.println("test1 end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();

		System.out.println("-------------");
		test2();
		System.out.println("Main end");
	}
	
	static void test2()
	{
		System.out.println("test2 begin");
		System.out.println("test2 end");
	}
}
