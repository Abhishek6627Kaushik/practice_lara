package array_logical_coding;

import java.util.Arrays;

// Find second minimum of array
public class Find2ndMinOfArray
{
	public static void main(String[] args) 
	{
		int[] array =  {10 , 50 , 85 , 60 , 46 , 32 , 5 , 54};
		//              0  , 1  , 2  , 3  , 4  , 5  , 6 , 7
		
		int first_min = Integer.MAX_VALUE;
		int second_min = Integer.MAX_VALUE;
		
		System.out.println(Arrays.toString(array));
		
		for(int i = 0 ; i<array.length;i++)
		{
			if(array[i]<first_min)
			{
				second_min = first_min;
				first_min = array[i];
			}
			else if (array[i]< second_min)
			{
				second_min = array[i];
			}
		}
		System.out.println("Second Min Value is "+second_min);
		System.out.println("First Min Value is "+first_min);
	}
}
