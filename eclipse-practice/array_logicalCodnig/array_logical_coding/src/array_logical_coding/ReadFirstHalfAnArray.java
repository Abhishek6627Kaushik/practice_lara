package array_logical_coding;
// Read first Half Of index In Given Array
import java.util.Arrays;

public class ReadFirstHalfAnArray
{
	public static void main(String[] args) {
		
	
		int[] array =  new int[8];
			array[0] = 10;
			array[1] = 60;
			array[2] = 90;
			array[3] = 40;
			array[4] = 80;
			array[5] = 70;
			array[6] = 65;
			array[7] = 45;
			System.out.println("Given Array is");
			System.out.println(Arrays.toString(array));
			System.out.println();
			System.out.println("First Half given arrays Is");
				for (int i = 0; i < array.length/2; i++)
				{
					System.out.print((array[i]+", "));
				}	
	}		
		
}