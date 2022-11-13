package pack4throws;

public class A 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
			Class.forName("");
	}
}
//here we are talling to compiler dont look for try catch here look fortry catch for the callers of mainn method
