package test;

public class C
{
	static int i = test1();
	static int j = test2();
	public static void main(String[] args) 
	{
		System.out.println("from main:" + i + ", " + j);
	}
	static int test2()
	{
		System.out.println("from test2:" + i + ", " + j);
		i += i + j + 1;
		j += i + j + 2;
		return i + j + 3;
	}
	static int test1()
	{
		System.out.println("from test1" + i + ", " + j);
		i += i + j + 4;
		j += i + j + 5;
		return i + j + 6;
	}

}
