package array_logical_coding;

import java.util.Arrays;

// Remove 1st 2nd elements And Last 2nd elements
public class Reomve1st2ndAndlast2nd 
{
	public static void main(String[] args)
	{
		int[] array =  {10 , 50 , 85 , 60 , 46 , 32 , 5 , 54};
		//              0  , 1  , 2  , 3  , 4  , 5  , 6 , 7
			// Remove 50 and 5 from index
		
		System.out.println(Arrays.toString(array));
		
		for (int i = 1; i < array.length-1; i++)
		{
			array [i] =  array[i+1];
		}
		for (int i = array.length-3; i < array.length-1; i++) 
		{
			array[i]  =  array[i+1];
		}
		System.out.println(Arrays.toString(array));
	}
}
