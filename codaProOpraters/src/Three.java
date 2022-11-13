
//15. Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
import java.util.Scanner;
class Three 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a =sc.nextInt();
		int  one = (a /100);
			int b =(a % 100);
			int	two = (b / 10);
			int three = ( b % 10);
			int t = one+two+three;
		System.out.println(t);
	}
}