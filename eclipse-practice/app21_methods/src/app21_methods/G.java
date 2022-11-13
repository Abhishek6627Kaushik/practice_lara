package app21_methods;

public class G
{
	static void test1()
	{
		System.out.println("From test1");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		test1();
		System.out.println("-------------");
		test2();
		System.out.println("Main end");
	}
	
	static void test2()
	{
		System.out.println("From test2");
	}
}
