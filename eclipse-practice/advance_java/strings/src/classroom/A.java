package classroom;
/*                      
to represent multiple character we are using string
1.characterArray=>>we need to use for loop
2.String
2.new StringBuffer
4.stringBuilder
*/
public class A 
{
	public static void main(String[] args) 
	{
		char[] chars= {'A', 'B' , 'h','I' ,'S', 'h','E', 'k'};
		
		String  s1= "abc hello  how do you do";
		StringBuffer sb1 = new StringBuffer("Test from StringBuffer");
				StringBuilder sb2=new StringBuilder("test from Stringbuilder");
		for (int i = 0; i < chars.length; i++) 
		{
			System.out.print(chars[i]);
		}
		System.out.println();
		System.out.println(s1);
		System.out.println(sb1 );
		System.out.println(sb2);
	}
}
