class L 
{
	public static void main(String[] args) 
	{
		int x = 0;
		int y = 1;
		int z = 2;
		System.out.println(x); // 0
		System.out.println(y); // 1
		System.out.println(z); // 2
		x = 3;   //x became 3
		System.out.println(x); // 3
		System.out.println(y); // 1
		System.out.println(z); // 2
		y = 4; // now y become 4
		System.out.println(x); // 3
		System.out.println(y); // 4
		System.out.println(z); // 2
		z = 4;// z become 4
		System.out.println(x); // 3
		System.out.println(y); // 4
		System.out.println(z); // 4

	}
}

/*
0 = x
1 = y 
2 = z

3 = x
1 = y
2 = z

3 = x
4 = y
2 = z

3 = x
4 = y
4 = z
*/