package tryandcatch;

import java.util.Scanner;

public class M13 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int  i = 100/0;
			System.out.println(2);
		} 
		catch (ArithmeticException ex) 
		{
			System.out.println("from catch "+ex);
	
		}
		System.out.println("main end");
	}
}
