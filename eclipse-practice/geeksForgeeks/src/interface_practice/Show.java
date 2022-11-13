package interface_practice;

import org.w3c.dom.css.ViewCSS;

interface Vehicles 
{
	void changeGear(int gear);
	void sppedUp(int spped );
	void applyBreaks(int breaks);
}

class Bikes implements Vehicles 
{

	int gear;
	int speed;
	@Override
	public void changeGear(int ge) // ge =  4
	{
		
		gear =  ge;
		//System.out.println("Bike gear is change");
	}

	@Override
	public void sppedUp(int s) // s = 2
	{
		speed = speed + s; 
		//System.out.println("Bike Speed is up");
	}

	@Override
	public void applyBreaks(int br)  // br = 3;
	{
		speed  = speed - br;
		//System.out.println("Bike Breaks is apply");
	}
	
		public void prints() 
		{
			System.out.println("speed "+speed +" gear :"+gear);
		}
}
	class Cycle implements Vehicles
	{
		@Override
		public void applyBreaks(int bre)
		{
			System.out.println("Cycle Breaks Apply");	
		}
		@Override
		public void changeGear(int ge) 
		{
				System.out.println("Cycle Gear Change");
		}
		@Override
		public void sppedUp(int sp) 
		{	
			System.out.println("Cycle Spped Up");
		}
		
	}
	class Car implements Vehicles
		{
			@Override
			public void applyBreaks(int br)
			{
				System.out.println("Car breaks apply");
			}
			@Override
			public void changeGear(int ge) 
			{	
				System.out.println("Car change gears");
			}
			@Override
			public void sppedUp(int sp) 
			{
				System.out.println("Car SpeedUp");
			}
		}

	class Show 
	{
		public static void main(String[] args) 
		{
			Bikes c1 = new Bikes();
			
			c1.applyBreaks(2);
			c1.changeGear(3);
			c1.sppedUp(5);
			
			c1.prints();
		}
	}
