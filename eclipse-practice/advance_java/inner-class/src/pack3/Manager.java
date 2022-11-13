package pack3;

public class Manager 
{
	public static void main(String[] args) 
	{
		Job j1 = new Job("software", 3000);
		Job j2 = new Job("hardware", 300);
		Job j3 = new Job("sales", 30700);
		Job j4 = new Job("marketing", 36000);
		Job j5 = new Job("hr", 30500);
		Job j6 = new Job("teacher", 6000);
		
		Job[] jobs = {j1, j2,j3,j4,j5,j6};
		Employee emp = new Employee("vijay", jobs);
		
		Job currentJobs;
		
		System.out.println("print 1st time");
		
		
		while(emp.moreJobs())
		{
			currentJobs = emp.newJobs();
			System.out.println(currentJobs.title+":"+currentJobs.salary);
			
		}
		
System.out.println("print 2nd time");
		
		
		while(emp.moreJobs())
		{
			currentJobs = emp.newJobs();
			System.out.println(currentJobs.title+":"+currentJobs.salary);
			
		}
		
		
	}
}
