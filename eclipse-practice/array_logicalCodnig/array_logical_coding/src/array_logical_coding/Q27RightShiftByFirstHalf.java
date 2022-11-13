package array_logical_coding;

import java.util.Arrays;

public class Q27RightShiftByFirstHalf
{
	public static void main(String[] args) 
	{
		int[] array ={10,20,30,40,50,60,70,80};
		System.out.println(Arrays.toString(array));
		
		for (int i = array.length/2-1; i>0; i--) 
		{
			array[i] = array[i-1];
		}
		System.out.println(Arrays.toString(array));
	}
}
