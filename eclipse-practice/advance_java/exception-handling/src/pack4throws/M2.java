package pack4throws;

public class M2 
{
	public static void main(String[] args) 	
	{
		try {
		test();
		}
		catch (ClassNotFoundException ex) 
		{
			// TODO: handle exception
		}
	}
	static void test() throws ClassNotFoundException
	{
		Class.forName("");
	}
}
// Because test method is caller of test method we need to provide try cath