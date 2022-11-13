package pack3;

public class Employee 
{
	String name;
	Job[] jobs;
	private int index;
	
	Employee(String name , Job[] jobs)
	{
		this.name =name;
		this.jobs = jobs;
	}
	
	boolean  moreJobs()
	{
		if (index == jobs.length) 
		{
			index = 0;
			return false;
		}
		return true;
	}
	
	
	Job newJobs()
	{
		return jobs[index ++];
	}
	
}
