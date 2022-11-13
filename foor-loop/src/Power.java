import java.util.Scanner;
class Power
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Values");
		int i =sc.nextInt();
		System.out.println("Enter Powers");
		int j =sc.nextInt();
		int tot =1;
		for(int  m =1; m<=j; m++)
		{
			tot  = i*tot;
			System.out.println("Power is "+tot);
		}
	}
}
