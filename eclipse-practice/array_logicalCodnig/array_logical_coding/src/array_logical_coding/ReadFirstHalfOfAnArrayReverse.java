package array_logical_coding;

import java.util.Arrays;

//read first Half of an array in reverse way
public class ReadFirstHalfOfAnArrayReverse 
{
	public static void main(String[] args) 
	{

		int[] array =  new int[8];
			array[0] = 10;
			array[1] = 60;
			array[2] = 90;
			array[3] = 40;
			array[4] = 80;
			array[5] = 70;
			array[6] = 65;
			array[7] = 45;
			System.out.println(Arrays.toString(array));
			for (int i = (array.length/2)-1 ; i>=0; i--) 
			{
				System.out.print(array[i]+", ");
			}
	}
}
