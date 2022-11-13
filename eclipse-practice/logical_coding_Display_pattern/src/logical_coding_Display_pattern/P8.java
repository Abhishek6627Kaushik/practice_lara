package logical_coding_Display_pattern;

import java.util.Iterator;

public class P8
{
	public static void main(String[] args) 
	{
		for(int i =1; i<= 6; i++)
		{
			for (int j =6; j>i; j--) 
			{
				System.out.print("  ");
			}
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(1+" ");
			}
			for (int k = 1; k <i; k++) 
				
			{
				System.out.print(1+" ");
			}
			System.out.println();
		}
	}
}
