// Write a program to find how many objects created to the current class
public class Q6 
{	
	static int  count;
	{
		count++;
	}
	public static void main(String[] args) 
	{
		Q6 a1 = new Q6();
		Q6 a3 = new Q6();
		Q6 a2 = new Q6();
		
		System.out.println(count);
	}
}
