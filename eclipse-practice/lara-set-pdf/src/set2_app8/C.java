package set2_app8;

public class C {
	public static void main(String[] args)
	{
		String s1 = "10000010";
		System.out.println("binary of 65 "+Integer.toBinaryString(65));
		System.out.println("decimal of "+Integer.parseInt(s1,2));
		System.out.println(65<<1);//left sift by 1
		System.out.println(65<<2);//left shift by 2
		System.out.println(65>>1);//right shift by 1
		System.out.println(65>>2);
	}

}
