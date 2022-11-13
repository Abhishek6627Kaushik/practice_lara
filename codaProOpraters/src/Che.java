//Java Program to Check Whether a Character is Alphabet or Not
import java.util.Scanner;
class  Che
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		  char c = sc.next().charAt(0);
			
		if ( c >= 'A' && c <='z')
		{
			System.out.println("This Is Alpabet");
		}
		else  
		{
			System.out.println("Not Alphaber");
		}

	}
}
