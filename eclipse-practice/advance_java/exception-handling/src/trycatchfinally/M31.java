package trycatchfinally;

import java.util.Scanner;

public class M31 
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
		catch (NullPointerException ex) 
		{
			System.out.println(4);
		}
		finally 
		{
			System.out.println(5);
		}
		System.out.println(6);	
	}
}


//finally block is execute gaaruntee to some thing no matter any
// one handle to  this or not 

// if you have any mandtory satement to excute then finally block is excute
// there is condition to excute finally block
// control should goto  try body then finally block is excute

// if something hapnned before try then finally block is not excute
// if before somthing condition to terminate the flow(system.exit) then finally block is not excte
// even though return satement in the try  that time also finally block is excute


