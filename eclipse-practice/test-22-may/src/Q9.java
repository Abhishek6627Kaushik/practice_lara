// write a program to demonstrate co-variant?
class I
{
	
}
class J  extends I
{
	
}
class K extends J
{
	I test ()
	{
		return null;
	}
	
}
public class Q9 extends K 
{
	I test()
	{
		return null;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
