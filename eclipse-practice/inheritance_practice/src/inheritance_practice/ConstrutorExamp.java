package inheritance_practice;

import java.util.Scanner;

public class ConstrutorExamp 
{
	int id  ;// by using  refrance variable
	String name ;// we can not initilze object by using refrance varriable
	// because of agr hum another object create karte hain to emp_id same  hojaayegi

	ConstrutorExamp () // this is no argument or no perametrized constructor
	{
		System.out.println("i am no argumet constructor");
	}
	ConstrutorExamp (int i ,  String s)
	{
		System.out.println("i am  argumet constructor");
		this.id =i;
		this.name =s;
		i++;
		
	}
	void disp()
	{
		System.out.println("i am disp() method  "+id + ", "+name);
	}
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc  = new Scanner (System.in);
		
		ConstrutorExamp  ce = new ConstrutorExamp();
		//ce.id = 1;
		//ce.name ="abhishek";
		//ConstrutorExamp  ce2 = new ConstrutorExamp(1 , "abhishek");
		//ConstrutorExamp  ce3 = new ConstrutorExamp(2 , "kaushik");
		//ConstrutorExamp  i1 = new ConstrutorExamp(1 , "abhishek");
		for (int i = 0 ; i<10; i++)
		{
			
			int age  =sc.nextInt();
			String name = sc.nextLine();
			ConstrutorExamp  ce2 = new ConstrutorExamp(age,  name);
			ce2.disp();
		}
		//ce2.id = 20;
		//ce2.name ="kaushik";
		//ce2.disp();
		//ce3.disp();
		// by using object 
		// ye bhi galat hai agr kisi compnay main 1000 emp
	//hain to hame 1000 object create krne pdenge;
	//	System.out.println(" "+ce.id+", "+ce.name);
		//System.out.println(" "+ce2.id+", "+ce2.name);
		
	}
}
