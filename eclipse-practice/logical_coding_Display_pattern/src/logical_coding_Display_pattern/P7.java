package logical_coding_Display_pattern;



public class P7 
{
 public static void main(String[] args) 
 {
	 for(int i =1; i<=7; i++)
	 {
		 for(int j = 1; j<=7;j++)
				 
		 if( (i == 1 || i == 7)||(j == 1 ||j==7) )
		 {
			 System.out.print("0 ");
		 }
		 else
		 {
			 System.out.print("  ");
		 }
		 System.out.println();
		
	 	}
	 
 	}
}
