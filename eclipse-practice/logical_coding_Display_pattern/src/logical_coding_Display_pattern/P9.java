package logical_coding_Display_pattern;

public class P9 
{
	public static void main(String[] args) 
	{
		for(int  i =1; i<=7;i++)
		{
			for (int j = 7 ; j >i; j--) 
			{
				System.out.print("  ");
			}
			for (int k = 1; k <=i; k++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
			for(int i = 6; i>=1;i--)
			{
				for(int m =7; m>i ; m--)
				{
					System.out.print("  ");
				}
				for(int n =1  ;n <=i; n++)
				{
					System.out.print("1 ");
				}
				
				System.out.println();
			}
			
		}
}
