//2 . Java Program to Add Two Integers
package programiz_example;
import java.util.Scanner;
public class AddTwoValues
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner (System.in);
		System.out.println("Pls Give Two Numbers");
		int  n1 =sc.nextInt();
		int n2 = sc.nextInt();
		int total = n1 + n2 ;
		System.out.println("Total Of " + n1 + " and "+n2+ " is "+total);
	}

}
