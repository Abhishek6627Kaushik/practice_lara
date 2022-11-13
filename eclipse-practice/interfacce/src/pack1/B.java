package pack1;

abstract class A
{
		abstract void test1();
		abstract void test2();
		abstract void test3();
		abstract void test4();
		
}
class B extends A
{
	
	public static void main(String[] args) 
	{
		B b1 = new B();
		
		b1.test1();
		b1.test2();
		b1.test3();
		b1.test4();
	}

	@Override
	void test1() 
	{
		System.out.println("from test1");
	}

	@Override
	void test2() {
		// TODO Auto-generated method stub
		System.out.println("from test2");
	}

	@Override
	void test3() {
		// TODO Auto-generated method stub
		System.out.println("from test3");
	}

	@Override
	void test4() {
		// TODO Auto-generated method stub
		System.out.println("from test4");
	}
}
