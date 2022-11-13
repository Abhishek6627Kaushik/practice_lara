class True 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		int i = 0;
		if (true && i == 0)
		{
				System.out.println("from if : "+ i++);
			 if (i == 1 && i++ == 1)
			{
				System.out.println("from  if1 : "+ ++i);
				i++;	
				 if (true)
				{
					System.out.println("from else if1 ");
				i++;
				}
			}
				
			else if   (true || i++ == 4)
			{
				System.out.println("from else if2 :: "+i);// this else is not running because if is true
			}
		}
		System.out.println("main end : "+ ++i);
		System.out.println("main end : "+ i);
	}
}
/*
main begin
from if: 0 
from if1: 3
from else if2 :: 5
main end: 6
main end: 6

*/