import java.util.Scanner;
class T1 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter The no");
		int i = sc.nextInt();
		System.out.println(" TO ");
		int j = sc.nextInt();

		for ( int r =1; r<=10 ; r++ )
		{
			for (int c =i; c<=j ;c++ )
			{
				System.out.print(r*c+" ");
			}
			System.out.println(" ");
		}
		
	}
}
