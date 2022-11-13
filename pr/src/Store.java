import java.util.Scanner;
class Store 
{
	public static void main(String[] args) 
	{

		Scanner sc =new Scanner (System.in);
		System.out.println("\t Welcome To Store :: Soap(S) , Food(F) , Garments(G)");
		char c = sc.next().charAt(0);
		int  det = 35 , lux = 20 , lif =10 , quan, total, a,b,e,d,med =20 ;
		if (c == 'S' )
		{
			System.out.println("1: Dettol | 2: Lux | 3: LifeBoy | 4: MediMex " );
			System.out.println("   Rs 35  | Rs 20  |   Rs 10    |  Rs 20  ");
						int  i = sc.nextInt();
						System.out.println("Press 1 For Purchase Products");
							switch (i)
							{
								case  1: 	
									System.out.println("Enter The Quantity");
										 System.out.println(" For Dettol");
										 quan = sc.nextInt();
											a = quan * det;
										 System.out.println(" For Lux");
										 quan = sc.nextInt();
										 b = quan * lux;
										 System.out.println(" For LifeBoy");
										 quan = sc.nextInt();
										 e = quan * lif;
										 System.out.println(" For MediMex");
										 quan = sc.nextInt();
										 d = quan * med;
										 total = a + b + e + d ;		
											
										 if (total > 500)
										 {
											 System.out.println(" You Got 10 % Discount ::  "+total*(0.1));
											 System.out.println(" You Got 10 % Discount ::  "+total*(0.9));
										 }	
										else 
								{
											 System.out.println(" Total Amount is "+total);
								}
															
							}
			}
		
				if (c == 'F' )
		{
			System.out.println("1: Daal | 2: Rice | 3:  PavBHaji | 4: Pasta " );
			System.out.println(" Rs 50  | Rs 30   |   Rs  30     |  Rs 60  ");
			int daal = 50, rice =30, pb = 30, pa = 60;
			int j = sc.nextInt();
						if (j<=4)
							{
							 	
									System.out.println("Enter The Quantity");
										 System.out.println(" For Daal");
										 quan = sc.nextInt();
											a = quan * daal;
										 System.out.println(" For Rice");
										 quan = sc.nextInt();
										 b = quan * rice;
										 System.out.println(" For PavBhaji");
										 quan = sc.nextInt();
										 e = quan * pb;
										 System.out.println(" For Pasta");
										 quan = sc.nextInt();
										 d = quan * pa;
										 total = a + b + e + d ;		
											
										 if (total > 500)
										 {
											 System.out.println(" Total Amount is "+total+" You Got 10 % Discount ::" );
											 System.out.println(" Your Discount Amount is "+total*(0.1));
											 System.out.println(" Your Total Amount is ::  "+total*(0.9));
										 }	
										else 
								{
											 System.out.println(" Total Amount is "+total);
								}
															
			}

	  }
	  		if (c == 'G' || c == 'g' )
			{
			System.out.println("1: Jockey | 2: Shirt | 3:  T-shirt | 4: Pajama " );
			System.out.println("  Rs 299  |  Rs  499 |  Rs  399    |  Rs  349  ");
			int jk = 299, st = 499, ts = 39, pj = 349;
			int k = sc.nextInt();
						if (k<=4)
							{
							 	
									System.out.println("Enter The Quantity");
										 System.out.println(" For Jockey");
										 quan = sc.nextInt();
											a = quan * jk;
										 System.out.println(" For Shirt");
										 quan = sc.nextInt();
										 b = quan * st;
										 System.out.println(" For T-shirt");
										 quan = sc.nextInt();
										 e = quan * ts;
										 System.out.println(" For Pajama");
										 quan = sc.nextInt();
										 d = quan * pj;
										 total = a + b + e + d ;		
											
										 if (total > 500)
										 {
											 System.out.println(" Total Amount is "+total+" You Got 10 % Discount ::" );
											 System.out.println(" Your Discount Amount is "+total*(0.1));
											 System.out.println(" Your Total Amount is ::  "+total*(0.9));
										 }	
										else 
								{
											 System.out.println(" Total Amount is "+total);
								}
															
			  }

			}
   }
}
