package array_logical_coding;

import java.util.Arrays;

// Remove 2 middle elements of an array
public class Remove2eleofArray 
{
	public static void main(String[] args) 
	{
		int[] array =  {10 , 50 , 85 , 60 , 46 , 32 , 5 , 54};
		//              0  , 1  , 2  , 3  , 4  , 5  , 6 , 7
		
		System.out.println(Arrays.toString(array));
		
		for(int i = array.length/2;i<array.length-2;i++)
		{
			array[i]= array[i+2];
		}
			System.out.println(Arrays.toString(array));
	}
}
