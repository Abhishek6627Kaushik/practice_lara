package pack2;

public class Manager
{
	public static void main(String[] args) 
	{
		Job j1 = new Job("software", 50000);
		Job j2 = new Job("hardware", 10000);
		Job j3 = new Job("hr", 20000);
		Job j4 = new Job("sales", 5000);
		Job j5 = new Job("marketing", 6000);
		
		Job[] jobs = {j1 , j2 ,j3 ,j4, j5};
		
		
		Employee emp = new Employee("vijay", jobs);
		System.out.println("print first time");
		Job currentJob;
		
		while(emp.hasMoreJobs())
		{
			currentJob = emp.nextJob();
			System.out.println(currentJob.tittle+":"+currentJob.salary);
		}
		System.out.println("print second time");
		
		while (emp.hasMoreJobs())
		{
			currentJob = emp.nextJob();
			System.out.println(currentJob.tittle+":"+currentJob.salary);
		}
		
	}
}
