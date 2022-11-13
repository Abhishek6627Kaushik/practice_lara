class A2
{
	public static void main(String[] args) 
	{		
		if (args.length == 0 )
		{			
			System.out.println("Please Choice the Domain");
			System.out.println(" \t \t 1.Flipkart");
			System.out.println(" \t \t 2.Amazon");
			return;
		}
		String s1 = args[0];
		int i = Integer.parseInt(s1);
		if (i == 1)
		{
			if (args.length == 1)
			{
				System.out.println("Your Domain is Flipkart : Purchase From Flipkart");
				return;
			}

			String s2 = args[1];
			int j = Integer.parseInt(s2);
				if(j > 500)
			{
				System.out.println("Your purchasing amount is : "+ j +" You got 10 points ");
				return;
			}
			else 
				{
					System.out.println("Your purchasing amount is : "+ j +"\t !!!! Sorry you did not get any points");
				}
		}

		if (i == 2)
		{
			if (args.length == 1)
			{
				System.out.println("Your Domain is Amazon : Purchase From Amazon");
				return;
			}

			String s2 = args[1];
			int j = Integer.parseInt(s2);
				if(j > 500)
			{
				System.out.println("Your purchasing amount is : "+ j +" You got 10 points ");
				return;
			}
			else 
				{
					System.out.println("Your purchasing amount is : "+ j +"\t !!!! Sorry you did not get any points");
				}
		}
	}
}
