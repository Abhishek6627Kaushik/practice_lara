package genrics;
// how to change datatype one object to another object
class A2 <X>
{
	X obj;
}
public class M11
{
	public static void main(String[] args) 
	{
		A2<Integer> a1 = new A2<Integer>();
		A2<String> a2 = new A2<String>();
		A2<Double> a3 = new A2<Double>();
		A2 a4 = new A2();
		a1.obj = 20;
		a2.obj ="hello";		
		a3.obj= 1.5;
		a4.obj=  new Object();
		System.out.println(a1.obj);
		System.out.println(a2.obj);
		System.out.println(a3.obj);
		System.out.println(a4.obj);
		System.out.println("done");
	}
}
