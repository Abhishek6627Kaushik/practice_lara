package app27ObjectAndRefranceVariables;

public class C 
{
	int i ;
	
	int k ;
	static void test1(C c1 , C c2)
	{
		System.out.println(c1.i +":"+c2.k);

	}
	public static void main(String[] args)
	{
	
		C c1 = new C();
		c1.i= 100;
		C c2 = new C();
		c2.k=200;
		test1(c1 , c2);
		System.out.println();
	}
}
