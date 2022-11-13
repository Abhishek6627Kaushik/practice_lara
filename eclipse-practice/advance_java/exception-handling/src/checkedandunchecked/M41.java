package checkedandunchecked;

public class M41 
{
	public static void main(String[] args) 
	{
		int i =10/0;// Arithmetic excption
		int j =  Integer.parseInt("abc");// numberformat 
		String s1 =  null;// 
		int k = s1.length();// null pointer
		int[] arr= new int [5];
		int m = arr[10];// array out of bound
		Object obj = new Integer(90);
		String st= (String) obj;// class cast
		main(null);//stackover flow
		int[] ar= new int [999999999];//outof memory error
		
		// these all are excepttion and errors are unchekd
	}
}
// in unchekd compilre not vothring about to excute
// only checked requrid try catch