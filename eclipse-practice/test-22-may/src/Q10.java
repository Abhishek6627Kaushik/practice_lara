
class A3 
{
	void test()
	{
		System.out.println("A3.test");
	}
}
public class Q10 extends A3
{
	void test()
	{
		super.test();
		System.out.println("Q10.test");
	}
	public static void main(String[] args) 
	{
		Q10 q1 = new Q10();
		q1.test();
		System.out.println("done");
	}

}
