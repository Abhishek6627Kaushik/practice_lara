package array_logical_coding;

import java.util.Arrays;

public class Test 
{
	public static void main(String[] args) 
	{
		
		
		String[] s1 = {"hello", "again"};
		String s = "";
		String s2= "";
		for (int i = 0; i < s1.length; i++) 
		{
			s =  s1[i];
			char []ss = new char[s.length()];
			System.out.println();
			for (int j = s.length() ; j >0 ; j--) 
			{
				for (int k = 0; k<ss.length; k++) {
					
					ss[k] = s.charAt(k);}
				}
				 System.out.print(Arrays.toString(ss));			 
			
			
			}
		}
	}

