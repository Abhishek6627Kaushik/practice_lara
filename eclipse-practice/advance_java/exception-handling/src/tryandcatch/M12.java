package tryandcatch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class M12 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Scanner sc = new Scanner(System.in);
		int  i = sc.nextInt();
		if (i !=1 ) 
		{
			System.out.println("there are an exeception in if block");
			int  k = 100/0;
		}
		try
		{
			int  l = 100/0;
		} 
		catch (ArithmeticException ex) 
		{
			System.out.println("exception is handle in try block");
			ex.printStackTrace();
		}
			
	}
}
