package threads;
class Q extends Thread

{
	@Override
	public void run() 
	{
		for (int i = 1; i <10; i++) 
		{
			System.out.println(i);
		}
	}
}
public class M19 
{
	public static void main(String[] args) 
	{
		Q q1  = new Q();
		q1.start();
		System.out.println("done");
	}
}
// child is user thread not depaning on parents