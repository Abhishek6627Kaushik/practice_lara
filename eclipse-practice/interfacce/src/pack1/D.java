package pack1;



interface C
{
	int i  =10;
	String s1 = "abc";
	double j = 5.5;
	
	void test1();
}

class D implements C
{
	
	public void test1()
	{
		System.out.println("from test1"); 
	}
	public static void main(String[] args) 
	{
		D  d1 = new D();
		d1.test1();
		System.out.println(d1.i);
		System.out.println(d1.s1);
		System.out.println(d1.j);
		
	}
}


