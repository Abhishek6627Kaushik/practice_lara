package string;

public class Q1 
{
	public static void main(String[] args) 
	{
		String s1= "jekl af";
		//StringBuffer s  =  new StringBuffer(s1);
		System.out.println(s1);
		
		
		for(int i =s1.length()-1; i>0 ; i--)
		{
			char s = s1.charAt(i);
			System.out.print(s);
		}	
		
	}
}
