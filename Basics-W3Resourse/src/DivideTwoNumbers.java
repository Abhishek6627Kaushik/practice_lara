//3. Write a Java program to divide two numbers and print on the screen.
/*class DivideTwoNumbers 
{
	public static void main(String[] args) 
	{	
		double n1 = 150 , n2 = 19;
		double tot = n1+n2;
		System.out.println(tot);
	}
}
*/

import java.util.Scanner;

class Div2NumUinpt
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("give 2 number for divission");
		double n1 =sc.nextDouble();
		double n2 =sc.nextDouble();
		double tot = n1 / n2;
		System.out.println("Divi of "+n1+" and "+n2+" is "+tot);
		
	}
}