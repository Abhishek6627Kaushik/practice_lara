package pack1date7_5_22;

public class Q 
{
	public static void main(String[] args) 
	{
		Thread.State[]  states = Thread.State.values();
		for (Thread.State state : states) 
		{
			System.out.println(state);
		}
		
	}
}
//in the thread life cycle totally 6 states are availble
//all the states are provided in  the enum 
//inside a thread class state is enum
//inside a thread class inner class like wise (they difine enum class the enum name is a states inside states 6 constants availble)
//enum is only for maintaning constant  
//enum is only for grouping constant
//in the thread calss states is enum  this enum is contain 6 constant
//