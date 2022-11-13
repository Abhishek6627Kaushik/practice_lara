package pack1;

public class D 
{
	class B
	{
	
	}
	static class C
	{
		
	}
	public static void main(String[] args)
	{
		B b1 = new D().new B();
		C c1 = new C();
		System.out.println("done");
	}
}
/*
 *B is nonstatic member of D we cant use B to create an in main method bcz Main is static 
 we can use B only to crate a datatype but not object creation
 
 */
