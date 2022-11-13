package sirPdf;

import java.util.Iterator;

class B
{
	void pattern()
	{ for(int i =1; i<=7; i++)
	 {
		 for(int j = 1; j<=7;j++)
				 
		 if( (i == 1 || i == 7)||(j == 1 ||j==7) )
		 {
			 System.out.print("0 ");
		 }
		 else
		 {
			 System.out.print("  ");
		 }
		 System.out.println();
		}
	}
}
public class A extends B
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.pattern();
	}
}
