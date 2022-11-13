package checkedandunchecked;

public class M42 
{
	public static void main(String[] args) 
	{
		///class.forNamee("");// iff we didt use try catch this give compilation error
		
		try 
		{
			Class.forName("");
		} 
		catch (ClassNotFoundException ex) 
		{
			// TODO: handle exception
		}
	}
}
