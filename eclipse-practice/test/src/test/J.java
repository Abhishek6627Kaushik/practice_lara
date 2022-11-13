package test;

public class J
{
	static int i = 5;
	public static void main(String[] args) 
	{
		System.out.println("@a:" + i);
		int i = 20;
		System.out.println("@b:" + i);
		i = 30;
		System.out.println("@c:" + i);
		J.i = 300;
		System.out.println("@d:" + i);
		System.out.println("@e:" + J.i);
	}

}
