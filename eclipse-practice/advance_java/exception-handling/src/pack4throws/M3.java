package pack4throws;

public class M3 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		test();
	}
	static void test() throws ClassNotFoundException
	{
		Class.forName("");
	}
}
// we can provide throws to caller of test method
// throws keyword only for checked exception  to avoid incorporaeted try catch we can use throws in uncjheked also