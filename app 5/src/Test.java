class Test 
{
	static void test1()
	{
		System.out.println("test1 run");
	}
	static int test2(int i)
	{
		System.out.println("test2 run"+i);
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(test2(100));
		
		test2(100);
	}
}
