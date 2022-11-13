package string;

public class Q1 
{
	public static void main(String[] args)
	{
		String s1= "hello";
		for(int i = s1.length()-1; i>=0; i--)
		{
			char c = s1.charAt(i);
			System.out.println(c);
		}
		
	}
}
