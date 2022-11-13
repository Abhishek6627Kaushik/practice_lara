package threads;
class N implements Runnable
{
		@Override
		public void run() {
		
			System.out.println("child thread");
			
		}
}
public class M17 
{
	public static void main(String[] args) 
	{
		N n1 = new N();
		Thread t1 = new Thread(n1 ,"first thread");
		t1.start();
		System.out.println(t1.getName());
	}
}
/*
main thread default priority id 5 but child thread default priority is depanding on parents thread priority
*/