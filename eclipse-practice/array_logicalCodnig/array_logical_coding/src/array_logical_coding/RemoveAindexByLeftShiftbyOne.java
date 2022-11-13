package array_logical_coding;

import java.util.Arrays;

// Remove a variable by left shift by one
public class RemoveAindexByLeftShiftbyOne
{
	public static void main(String[] args) 
	{
		int[] array =  {10 , 50 , 85 , 60 , 46 , 32 , 5 , 54};
		//              0  , 1  , 2  , 3  , 4  , 5  , 6 , 7
		
		System.out.println(Arrays.toString(array));
		
		for (int i = 0; i < array.length-1; i++) 
		{
			array[i] =  array[i+1];// this is left shift by one
			
		}
		System.out.println(Arrays.toString(array));
	}
}
