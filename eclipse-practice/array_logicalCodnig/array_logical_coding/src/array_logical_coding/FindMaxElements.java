package array_logical_coding;

import java.util.Arrays;

// FIND THE MAXIMUM ELEMENT OF GIVEN ARRAY
public class FindMaxElements 
{
	public static void main(String[] args)
	{
		int[] array =  {10 , 50 , 85 , 60 , 46 , 32 , 5 , 54};
		//              0  , 1  , 2  , 3  , 4  , 5  , 6 , 7
		
		System.out.println(Arrays.toString(array));
		
		
		int max = Integer.MIN_VALUE;//we can develop this program from 2 logic 1st logic is this 
		//int max = array[0];// this is second logic
		for (int i= 0; i<array.length;i++)
		{
			if (array[i]> max)
			{
				max = array[i];
				
			}
		}
		System.out.println();
		System.out.println(max);
	}
}