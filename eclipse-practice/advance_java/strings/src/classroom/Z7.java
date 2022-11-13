package classroom;

public class Z7 
{
	public static void main(String[] args) 
	{
		String s1 ="abc xyz";
		//			0123456
		System.out.println(s1.substring(0,3));
		System.out.println(s1.substring(1,5));
		System.out.println(s1.substring(4,7));
		System.out.println(s1);
	}	
}
// substring method take 2 argument = 1st one is inclusive and 2nd one is exclusive
//if two limit are suppling 1st one is inclusive and 2nd exclusive (means from index is inclusive  to index is exclusive)