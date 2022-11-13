package threads;

public class M9 
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getPriority());
		System.out.println(t1.getId());
	
		
		
		
	}
}
/*	
 * every thread have name  and that name we get by using getName Method
 	 getName = every thread have  name   that name we read by getName
 	 setName  = we can change name by using set name method
 *		t1.setName("abhi");
 *	Daemon = if child thread is daemon then it is always looking for parent thread excution
 	when ever parent thread is leavin  child thread also leaving
 	daemon thread is a thread which is purelly depanding on parent
 	thread
 	
 	
 	when parent thread is leaving ec=xution child thread also leaing eccutio  eventhoug child thread having some more excution
 	oppsite of daemon is child is not depanding on parent thread life eventhough parent is leaving  child continging the excution
of assigned task
Thats type of thread called as user thread  = user thread is a thread which is not depanding on parnts thread life user thread is fully focusing on ecution of assingded task
ratter then leaving the excution

daemon thread = depanding parents thread life
user thread  = not depaning parents life

in java we get only user thread only no matter its a frist approch or second approch
by default is every thread is daemon thread
we can convert user thrad to daemon thread but its convertain should before start method one start method is started then we cant converted daemon thread
we can not change main thread  user to daemon becz main thread started by daemon
t1.setDaemon(true);
thats have only boolean condtion
getPriority = Priority is a integer number between 1  to 10 
1 stand for  = minimum priority 10  stand for maximum priority and 5 stand for normal priority
we can change Priority by using setPriorty method

t1.setPriorty(2);
changing allow should be 1  to 10 only
 Prrority = recomadation to the thread sheduler by sheduling procceser
 time  less priortoy less opritnuty to proccers time

we can not change id id is unique number
  */ 
