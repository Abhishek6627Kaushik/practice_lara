import java.util.Scanner;
class Store 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner (System.in);
		System.out.println("Give 3 values");

		int i = sc.nextInt();
		int j= sc.nextInt();
		int k = sc.nextInt();

		int sum = i + j + k;

		System.out.println("Sum Of "+ i + " and "+j+" and " + k+" is "+ sum);

	}
}
