package array_logical_coding;
// Print alternative an array
public class PrintAlterNative 
{
	public static void main(String[] args) 
	{
		int[] array = {10, 899, 90, 35, 64, 65};
		
		for (int i = 0 ; i<array.length; i +=2)
		{
			System.out.println(array[i]);
		}
	}
}
