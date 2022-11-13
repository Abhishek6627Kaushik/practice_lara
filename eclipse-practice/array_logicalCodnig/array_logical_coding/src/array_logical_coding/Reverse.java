package array_logical_coding;

import java.util.Arrays;
import java.util.Iterator;

public class Reverse
{
	public static void main(String[] args)
	{
		String [] e={"hello","again"};
	
		//String s1  = "hello";
		//System.out.println(Arrays.toString(s1));
		for (int i = 0; i < e.length; i++) 
		{
			 String s=e[i];
		for (  int j = s.length()-1; j >=0;  j--) 
		{
			System.out.print(s.charAt(j));   
		}
		}
		System.out.print(Arrays.toString(e));
	}
}
