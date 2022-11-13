package checkedandunchecked;

public class M3 
{
	void test()
	{
		//clone();
		
		
		try
		{
			clone();
		}
		catch(CloneNotSupportedException ec)
		{
			
		}
	}
}
// we cant use clone method straight way becz this is int hte object class 
//object calss inherit to M3 class M3 also sub class to object class	