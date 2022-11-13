package array_logical_coding;

import java.util.Arrays;

// Right Sift by second half
public class Q24RightShiftByTwo 
{
	public static void main(String[] args)
	{
			int[] array ={10,20,30,40,50,60,70,80};
			System.out.println(Arrays.toString(array));
			
			for (int i = array.length-1; i >array.length/2; i--) 
			{
				array[i] =array[i-1];
			}
			
			System.out.println(Arrays.toString(array));
	}
}
