// WOP to check number positive aur negative
import java.util.Scanner;
class NumberPositiveAurNegative
{
	public static void main(String[] args)
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the Number ");
			int num1 =sc.nextInt();
			if (num1> 0)
			{
				System.out.println(num1+" is a Positive Number");
			}
			else if(num1<0)
			{
				System.out.println(num1+" This is negative Number");
			}
			else
			{
				System.out.println("You Provide Worng Value");
			}
		}
}