package array_logical_coding;

import java.util.Arrays;

// Remove  Specific Number
public class RemoveSpecficNumber 
{
	public static void main(String[] args) 
	{
		int[] array =  {10 , 50 , 85 , 60 , 46 , 32 , 5 , 54};
		//              0  , 1  , 2  , 3  , 4  , 5  , 6 , 7
		// Remove 60 from index
		System.out.println(Arrays.toString(array));
		for (int i = 3 ; i<array.length-1; i++)
		{
			array[i] = array[i+1];
		}
		System.out.println(Arrays.toString(array));
	}
}
