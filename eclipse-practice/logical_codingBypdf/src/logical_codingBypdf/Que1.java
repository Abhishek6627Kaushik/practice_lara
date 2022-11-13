package logical_codingBypdf;

import java.util.Arrays;

// find the sum given int array
public class Que1 
{
	public static void main(String[] args) 
	{
			int[] array = {0, 1, 3, 4, 5, 6, 7, 8, 10, 11, 12, 17};
			int sum = 0;
			int j = 0;
			System.out.println(Arrays.toString(array));
			for (int i = 0; i < array.length-1; i++) 
			{
					
					sum = array[i]+ array[i+1];
					System.out.println("sum of given array is "+array[i]+" and "+array[i+1]+" , "+sum);
			}
			for (int i = 0; i < array.length; i++) 
			{
				j = j + array[i];
			}
			System.out.println("sum of total array is " +j);
	}
}
