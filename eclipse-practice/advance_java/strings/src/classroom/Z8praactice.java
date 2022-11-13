package classroom;

public class Z8praactice
{
	public static void main(String[] args) 
	{
		String s1 = "abc xyz hello";
		for (int i = 0; i<s1.length() ;i++) 
		{
			int  k = s1.indexOf(' ');
			
			if (i == k) 
			{
				String firstWord = s1.substring(0, k);
				System.out.println(firstWord);
			}
			int j =s1.indexOf(' ',k+1);
			if (i == j) 
			{
				String secondWord = s1.substring(k+1, j);
				System.out.println(secondWord);
				int l = s1.indexOf(' ' ,k+1);
				String thirdWord = s1.substring(l+1,s1.length());
				System.out.println(thirdWord);
			}
			
			
//			int l =s1.indexOf(' ',k+1);
//			String secondWord = s1.substring(k+1, l);
//			String thirdWord = s1.substring(l+1 ,i);
//			System.out.println(secondWord);
//			System.out.println(thirdWord);
		}
		
		
	}
}
