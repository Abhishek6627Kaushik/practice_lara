
public class M1 
{
	public static void main(String[] args) 
	{
		int i  =10;
		Integer obj1  = new Integer(i); // boxing
		Integer obj2 = Integer.valueOf(i);//boxing
		int  j = obj1.intValue();// un-boxing
		int  k = obj2.intValue();//un-boxing
		System.out.println("done");
				
	}
}
