package inheritance_practice;

import java.util.*;
 class Child
{
	 int salary;
	 String name= "";
	void parent(int i , String s1)
	{
	
		System.out.println("this is parent"+i+" , " +s1);
	}
	
	static void parent1()
	{
		 System.out.println("Hii i am static parent ");
	}
}
class Employee extends Child
{
		void child()
		{
			System.out.println("this is child");
		}
		
		static void child1()
		{
			System.out.println("hii i am static child ");
		}
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner (System.in);
			int i = sc.nextInt();
			 String s1= sc.nextLine();
			Child ch = new Child();
			ch.parent(i , s1);
			ch.salary = 1000;
			System.out.println("---------"+ch.salary);
			Employee em = new Employee();
			em.child();
			child1();
			System.out.println("i am parent");
			em.parent(i , s1);
			Child.parent1();
		}
}
