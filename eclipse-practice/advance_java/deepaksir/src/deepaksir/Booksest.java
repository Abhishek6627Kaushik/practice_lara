package deepaksir;

public class Booksest
{
	int totalseet_no  =10;
		public static void main(String[] args)
		{
			
		}
		void bookSeet1(int seet)
			{
				if (totalseet_no >= seet )
				{
					System.out.println("seet book ");
					totalseet_no = totalseet_no - seet;
					
					System.out.println("seet left" + totalseet_no);
				}	
				else
				{
					System.out.println("seet cant book");
				}
				
			}
		
		
}
