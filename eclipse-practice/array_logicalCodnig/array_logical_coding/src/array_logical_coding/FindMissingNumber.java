package array_logical_coding;

import java.util.Arrays;

public class FindMissingNumber 
{
	public static void main(String[] args)
	{
		int[] array = {1 , 3,7, 2 , 4 ,6 ,5, 8,10 };
		System.out.println(Arrays.toString(array));
		int sum = (array.length + 1 ) * (array.length +2)/2;
		for (int i = 0; i < array.length; i++) 
		{
			sum -= array[i];
		}
		System.out.println("missing elements is "+sum);
	}
}

