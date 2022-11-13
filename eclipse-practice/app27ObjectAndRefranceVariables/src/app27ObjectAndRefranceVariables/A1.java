package app27ObjectAndRefranceVariables;

public class A1 
{
	int i;
	
	public static void main(String[] args) 
	{
		A1 a = new A1();
		a.i= 10;
		
		a.test2();
	}
	
	void test2()
	{
		//a.i=10;
		System.out.println("2");
		test1();
	}
	static void test1()
	{
		A1 a1 = new A1();
		a1.i=20;
		System.out.println(a1.i+"tes1");
		System.out.println("test1");
	}
}
