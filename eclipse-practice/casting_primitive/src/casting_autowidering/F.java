package casting_autowidering;

public class F 
{
	static float test1(short s1)
	{
		return  test2(s1);
	}
	static long test2(int s1)
	{
		return s1;
	}
	public static void main(String[] args) 
	{
		byte b1= 100;
		double d1  =  test1(b1);
		System.out.println("done");
	}
}
/*toatal 5 converston here byte is converting to short then short is converting to int
 *   
 *int is converting to long  and long is converting to float then foat is converting to double
 *
 */