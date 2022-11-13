package returnstatement;

public class M37 
{
	int test1() 
	{
		return 10;
	}
	
	int test2(boolean flag)
	{
		return 10;
	}
	
	
	int test3(boolean flag)
	{
		 if(flag)
		 {
			 return 10;
		 }
		 return 20;
	}
	int test4(boolean flag)
	{
		if(flag)
		{
			return 10;
		}
		else
		{
			return 20;
		}
	}
	
	int test5(boolean flag)
	{
		if(flag)
		{
			// bcz theer no return value if flag is true thats why he gave compilation error
		}
		else
		{
			return 20;
		}
	}
	
	int test6(boolean flag)
	{
		if (flag)
		{
			return 20;
		} 
		else
		{
			// bcz ther are no return value if block is false
		}
		
	}
	
	
}
// 