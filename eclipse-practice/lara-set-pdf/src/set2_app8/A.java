package set2_app8;

public class A
{
	public static void main(String[] args)
	{
		int i = 25;
		int j = 45;
		System.out.println("binary represtation of "+i+" is "+Integer.toBinaryString(i));
		System.out.println("binary represtation of "+j+" is "+Integer.toBinaryString(j));
		System.out.println(25|45);//bitwise or
		System.out.println(25&45);//bitwise and
		System.out.println(25^45);//bitwise Xor
		
	}
}
