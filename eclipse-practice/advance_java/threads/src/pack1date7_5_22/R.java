package pack1date7_5_22;

public class R 
{
	public static void main(String[] args) throws Exception
	
	{
		class A extends Thread 
		{
			@Override
			public void run()
			{
				for (int i = 1; i <=10; i++) 
				{
					System.out.println(i);
				}
			}
		}
		A a1 = new A();
		System.out.println("@1:"+a1.getState());
		a1.start();
		System.out.println("@2:"+a1.getState());
		Thread.sleep(100);
		System.out.println("@3:"+a1.getState());
		Thread.sleep(1000);
		System.out.println("@4:"+a1.getState());
	}
}
// before starting a thread thread state is new
// as long as runing state will be runnable
//as long as running get over then its terminated
//by default thread is run three difrrent state = new state  , runnabele state , terminate state
//before is starring thread object is created you get new
//