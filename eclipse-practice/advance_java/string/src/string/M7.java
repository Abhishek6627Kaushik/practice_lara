package string;

public class M7 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		System.out.println(s1);
		
		char[] c =s1.toCharArray();
		char c1 ;
		
		for (int i = 0;  i<c.length; i++) 
		{
				c1 =s1.charAt(i);
				System.out.println(c1);
		}
	}
}
