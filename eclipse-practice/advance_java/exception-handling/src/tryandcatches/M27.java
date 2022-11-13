package tryandcatches;

import java.util.Scanner;

public class M27
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
//while keeping multiple catches you are provide both are not have same exceptuion classes

// even though they have difrance refrance but you get error