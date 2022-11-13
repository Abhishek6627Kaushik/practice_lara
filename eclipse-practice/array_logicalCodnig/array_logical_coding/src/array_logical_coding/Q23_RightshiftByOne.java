package array_logical_coding;
//initial {10,20,30,40,50,60,70,80}
//final  {10,10,20,30,40,50,60,70}

import java.util.Arrays;
import java.util.Iterator;

// Right Shift by one
public class Q23_RightshiftByOne 
{
		public static void main(String[] args) 
		{
				int[] array ={10,20,30,40,50,60,70,80};
				
				System.out.println(Arrays.toString(array));
				
				for (int i = array.length-1; i > 0; i--) 
				{
						array[i] = array[i-1];
				}
				System.out.println(Arrays.toString(array));
		}
}
