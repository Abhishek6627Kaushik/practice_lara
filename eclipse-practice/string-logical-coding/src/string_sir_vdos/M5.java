package string_sir_vdos;
// read string elements on by one
public class M5
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		char c;
		for(int i=0; i<s1.length();i++)
		{
			c = s1.charAt(i);
			System.out.println(c);
		}
	}
}
