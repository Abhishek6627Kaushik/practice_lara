package test;

public class I 
{
	static	{
		System.out.println("test: " + x);
	}
	static int x = 10;
	public static void main(String[] args) 
	{
		System.out.println("main: " + x);
		test();
	}

}
