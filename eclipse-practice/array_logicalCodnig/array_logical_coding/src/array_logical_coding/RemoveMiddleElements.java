package array_logical_coding;

import java.util.Arrays;

// Remove Middle Elements Of An Array
public class RemoveMiddleElements 
{
	public static void main(String[] args) 
	{
		int[] array =  {10 , 50 , 85 , 60 , 46 , 32 , 5 , 54};
		//              0  , 1  , 2  , 3  , 4  , 5  , 6 , 7
			
		
		System.out.println(Arrays.toString(array));
		
		for (int i = array.length/2; i < array.length-1; i++)
		{
				array[i] = array[i+1]; 
		}
		System.out.println(Arrays.toString(array));
	}
}
