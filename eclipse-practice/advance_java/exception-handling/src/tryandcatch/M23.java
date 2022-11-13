package tryandcatch;

public class M23
{
	public static void main(String[] args) 
	{
	System.out.println("main begin");
	int i  =20;
	try 
	{
		System.out.println(1); 
		i +=30;
		i  =10/0;
		System.out.println(2);
	} 
	catch (ArithmeticException ex)
	{
		System.out.println("catch begin");
			i +=90;	
		System.out.println("catch end");
	}
	System.out.println("main end"+i);
}
}
// we got output as 140 becz in try there are abnormal conditon 
// so catch is excute 