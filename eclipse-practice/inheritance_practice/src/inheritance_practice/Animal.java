package inheritance_practice;

public class Animal 
{
	int age ;
	String color = "";

	void buzo(int a , String s )
	{
		age = a;
		color = s; 
	}
	
	void disp() 
	{
		System.out.println("age is " + age +" color is  "+color);
	}
		public static void main(String[] args) 
		{
			Animal buzo  = new Animal();
			// agr static nhi hai to refrance variable ki need hogi
			buzo.buzo(10, "black");
			buzo.disp(); // this is by using method
			/*buzo.age = 10;
			buzo.color = "Black";// this is providing value by using object*/
			
			//System.out.println(buzo.age + " , "+ buzo.color);
		}
}
