package threads;

class M16 extends Thread

{
	M16 (String name)
	{
		super(name);
	}
	@Override
	public void run() {
		System.out.println("child thread");
	}
}
public class M11
{
	public static void main(String[] args) 
	{
		M16 m1 = new M16("frist name");
	
		m1.start();
		System.out.println(m1.getName());
		
	}
}
