package pack1date7_5_22;

public class S 
{
	public static void main(String[] args) throws Exception
	{
		class A extends Thread
		{
			@Override
			public void run() 
			{
				System.out.println("run begin");
				try 
				{
					System.out.println("thread going to sleep");
					Thread.sleep(10000);
					System.out.println("sleeping got over");
				} 
				catch (InterruptedException ex)
				{
					System.out.println("exception:"+ex);
				}
			}
		}
		A a1 = new A();
		a1.start();
		Thread.sleep(1000);
		System.out.println(a1.getState());
		System.out.println("end");
	}
}

//whenever thread going to sleep state is changing to timed waiting
//we are required throws and interpted exception becz sleep method is checked method type
//sleep method is a static method we can call by class name and sleep method is requrid an argument 
//that argument is long data type
//in long this is in mili sec means 10000 means 10 sec
//like join join method both required  