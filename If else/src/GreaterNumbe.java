// WOP to check number positive aur negative
import java.util.Scanner;
class GreaterNumber
{
	public static void main(String[] args)
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the first Number ");
			int num1 =sc.nextInt();
			System.out.println("Enter the second Number ");
			int num2 =sc.nextInt();
			System.out.println("Enter the thrid Number ");
			int num3 =sc.nextInt();
			if (num1> num2 && num1> num3) 
			{
				System.out.println("Greater Number is "+num1 );
			}
			else if(num2 > num1 && num2 > num3) 
			{
				System.out.println("Greater Number is "+num2);
			}
			else if(num3 > num1 && num3 > num2)
			{
				System.out.println("Greater Number is "+num3);
			}
			System.out.println("You Provide Worng Value");
		}
}