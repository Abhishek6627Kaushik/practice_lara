import java.util.Scanner;
class Discount 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner (System.in);
		System.out.println("Pls give quantity");

		int i = sc.nextInt();
		  int total ; 

		  total = i*100;
		if ( total > 1000)
		{
			System.out.println("You  Got 10 % discount from "+total+" You'r discount Amount is "+(total*0.1)) ;
			System.out.println("Total Paid Amount is "+(total*0.9)) ;
		}

		else 
			{
				System.out.println("No discount for this Amount "+total);
			}
	}
}
