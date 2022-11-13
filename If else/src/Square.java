import java.util.Scanner;
class Square 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		double l = sc.nextDouble();
		System.out.println("Enter the width");
		double w = sc.nextDouble();
		if (l == w)
		{
			System.out.println(" this is Square");
		}

		else
		{
			System.out.println(" this is Rectengle");
		}
	}
}
