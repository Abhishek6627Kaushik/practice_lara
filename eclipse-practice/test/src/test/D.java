package test;

public class D 
{
	static int i = test1();
	static
	{
		System.out.println("SIB1");
	}
	static int test1()
	{
		System.out.println("from test1");
		return 10;
	}
	static
	{
		System.out.println("SIB2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}

}
