// 4 . Java Program to Compute Quotient and Remainder
package programiz_example;
import java.util.*;
public class ComuteQuanReminder 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner (System.in);
		System.out.println("Enter The Value fo r dividend");
		double n1 = sc.nextDouble();
		System.out.println("Enter The Value for divisor");
		double n2  = sc.nextDouble();
		
		double total =  n1/n2;
		
		double rim = n1 % n2;
		System.out.println("compute is " +total+" and  reminder is "+rim );
		
	}
}
