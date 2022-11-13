//  Find  Number is odd and Even
package programiz_example;
import java.util.*;
public class EvenOdd
{		
	public static void main(String[] args) 
		{
			Scanner sc = new Scanner (System.in);
			int  n1 = sc.nextInt();
			
			if (n1%2 == 0)
			{
				System.out.println("Number Is  even");
			}
			else 
			{
				System.out.println("Number is  Odd");
			}
		}
}
