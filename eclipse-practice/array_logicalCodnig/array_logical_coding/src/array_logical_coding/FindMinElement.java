package array_logical_coding;

import java.util.Arrays;

//  Find Minimum of an array
public class FindMinElement 
{
	public static void main(String[] args) {
		int[] array =  {10 , 50 , 85 , 60 , 46 , 32 , 5 , 54};
		//              0  , 1  , 2  , 3  , 4  , 5  , 6 , 7
		int min = Integer.MAX_VALUE;// This  is first logic to find min value
		// This is second logic to find Minimum value
		
		// int min = array[0];
		System.out.println(Arrays.toString(array));
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]<min) 
			{
				min = array[i];
			}
		}
		System.out.println("Minimum Value of an array is\n ");
		System.out.println(min);
	}
}
