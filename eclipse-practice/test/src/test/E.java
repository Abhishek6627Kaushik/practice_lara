package test;

public class E
{
	static int i = test1();
	static
	{
		System.out.println("SIB1:" + i);
		i += 1;
	}
	static
	{
		System.out.println("SIB2 begin:" + i);
		i += 2;
		i += test1();
		 i = i + test1();
		System.out.println("SIB2 end:" + i);
	}
	public static int test1()
	{
		System.out.println("from test1:" + i);
		i += 3;
		main(null);
		return i + 4;
	}
	public static void main(String[] args) 
	{
		System.out.println("from main:" + i);
		i += 5;
	}

}
