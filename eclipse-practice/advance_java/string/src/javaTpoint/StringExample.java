package javaTpoint;

public class StringExample 
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		char[] c = {'s','t','r','i','n','g','s'};
		
		String s2  =  new String(c);
		String s3 = new String ("example");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
