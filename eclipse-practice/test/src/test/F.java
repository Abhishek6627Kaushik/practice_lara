package test;

public class F 
{
	static	{
		System.out.println("from sib begin");
		System.exit(0);
		//System.exit(2);
		//System.exit(-5);
		System.out.println("from sib end");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
	}

}
