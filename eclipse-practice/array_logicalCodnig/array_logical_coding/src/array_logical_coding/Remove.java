package array_logical_coding;

import java.util.Arrays;

public class Remove 
{
	public static void main(String[] args) 
	{
		int[] array =  {10 , 50 ,50,50,50, 85 , 85 ,85,85, 60 , 46 , 32 , 32 , 5 , 54};
		
		int count =0;
		
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++)
		{
			for (int j = i+1; j < array.length-count; j++)
			{
				if (array[i]==array[j])
				{
					for (int k = j; k < array.length-count-1; k++) 
					{
						array[k] =array[k+1];
					}
					
					count++;
					j--;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		
		
		int[] temp= array;
		array = new int [temp.length -count];
		
		for (int i = 0; i < array.length; i++) 
		{
			array[i]=temp[i];
		}
		System.out.println(Arrays.toString(array));
	}
}
