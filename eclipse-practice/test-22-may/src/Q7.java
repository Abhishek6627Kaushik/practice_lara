// develop a sub class to A and override test method

class A1
{
	A1 (int  k  , int l)
	{
		System.out.println("from a Constructor");
	}
	void test()
	{
		System.out.println("from A.test");
	}
}
public class Q7 extends A1
{
	Q7(int  i  , int j)
	{
		super(10 ,110);
		System.out.println("from B construtor");
	}
	void test()
	{
		System.out.println("from B test");
	}
	public static void main(String[] args) 
	{
		Q7  a1 = new Q7(10 , 90);
		System.out.println("done");
	}
	
}
