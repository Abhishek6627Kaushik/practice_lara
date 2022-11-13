package excepptionCondtionWithFinally;

import java.util.Scanner;

public class M37
{
	public static void main(String[] args) 
	{
		
		System.out.println(1);
		int i = 10/0;		
		try 
		{
			System.out.println(2);	
		} 
		catch (NullPointerException ex) 
		{
			System.out.println(3);
		}
		finally 
		{
			System.out.println(4);
		}
		System.out.println(6);	
	}
}
