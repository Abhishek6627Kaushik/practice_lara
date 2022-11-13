//Java Program to Swaping Two Numbers without using three variables
package programiz_example;
import java.util.*;
public class SwapIng 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Two Numbers ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
			n1 = n1 + n2 ;
			n2 = n1  - n2 ;
			n1 = n1  - n2;
			
			System.out.println(n1);
			System.out.println(n2);
	}
}
