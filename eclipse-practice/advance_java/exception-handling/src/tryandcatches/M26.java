package tryandcatches;

import java.util.Scanner;

public class M26 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter some thing");
		String s1 = sc.next();
		
		try 
		{
			System.out.println(1);
			int  i = Integer.parseInt(s1);
			System.out.println(2);
			int k = i / (i-9);
			System.out.println(3);
		} 
		catch (ArithmeticException ex) 
		{
			System.out.println(4);
		}
		catch (NumberFormatException e) 
		{
			System.out.println(5);
		}
		System.out.println(6);
	}
}