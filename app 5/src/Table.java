import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		for (int i =1 ; i<=10 ;i++ )
		{
			 int tab =j*i;
			System.out.println(tab);
		}
	}
}
