package array_logical_coding;

import java.util.Arrays;

public class Q27_InsertNewElement 
{
	public static void main(String[] args) 
	{
		int[] array ={10,20,30,40,50,60,70,80};
		
		System.out.println(Arrays.toString(array));
		int[] temp =  array;
		array = new int [temp.length+1];
		for (int i  = 0;i<array.length;i++)	
		{
		}
		//array[0] = 15;
		
		System.out.println(Arrays.toString(array));
	}		
	
}
