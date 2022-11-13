package sirPdf;

class C

{
	int pattern8(int k)
	{
		for(int i =1;i<=6; i++)
		{
			for (int j = 6; j>i; j--)
			{
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(1+" ");
			}
			for (int l = 1; l <i; l++) 
			{
				System.out.print(1+" ");
			}
			System.out.println();
		}
			
		return 10;
	}
}
public class D extends C
{
	public static void main(String[] args)
	{
		D d1 = new D();
		d1.pattern8(0);
	}
}
