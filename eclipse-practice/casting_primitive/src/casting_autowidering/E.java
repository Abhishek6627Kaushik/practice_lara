package casting_autowidering;

public class E
{
	 static int test(short  s1)
	 {
		 return s1;
	 }
	 public static void main(String[] args) 
	 {
		 byte b1  =  100;
		 long lon  = test(b1);
		 System.out.println("done");
	}
}
/*
 * 
 * 
 * total three converstion here 1st byte to short 2nd short to int 3rd int to long
 * */
 