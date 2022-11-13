import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the table you want");

		int i =sc.nextInt();
		int j = sc.nextInt();
		for ( int m = 1 ;i <=j ; i++)
		{
			for (int k = 1 ; k <= 10 ; k++ )
			{
				 System.out.println(i+" * "+k+" = "+i*k);
			}
		}
	}
}
