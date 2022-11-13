package set2_app7;

public class A 
{
	public static void main(String[] args)
	{
		int i = 45 ;
		String s1 = "1101110";
		System.out.println("binary format of "+i+" is " + Integer.toBinaryString(i));
		System.out.println("decimal format of "+s1 + " is "+Integer.parseInt(s1,2));
	}
}
