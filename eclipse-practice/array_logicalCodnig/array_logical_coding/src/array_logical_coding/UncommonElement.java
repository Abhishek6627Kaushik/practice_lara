package array_logical_coding;

import java.util.Arrays;

public class UncommonElement 
{
	public static void main(String[] args) 
	{
		int[] array = {1,2,3,5,4,6,7,9,64};
		int[] array1= {4,6,7,9,5};
		int count =0;
		System.out.println(Arrays.toString(array));
		
		
		System.out.println(Arrays.toString(array1));
		
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array1.length; j++)
			{
				if (array[i] == array1[j]) 
				{
						array[i]= array[i+1];
				}
			}
		}
		System.out.println(Arrays.toString(array));
		
		
		
		int dup=0;	
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length-dup; j++) {
				if(array[i]==array[j])
				{
				 for (int k = j; k < array.length-dup-1; k++) {
					array[k]=array[k+1];
				}
				 j--;
				 dup++;
				}
			}
		}
		int [] t=array;
		array=new int [t.length-dup];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=t[i];
		}
		System.out.println();
		System.out.println(Arrays.toString(array));
	}
}
