package classroom;

public class Z8 
{
	public static void main(String[] args) 
	{
		String s1 = "abc xyz hello";
		int i = s1.indexOf(' ');// we are asign int i  = s1.inedxOf(' ') it means i became abc t space = abc ;
		String firstWord = s1.substring(0, i);// 
		int j =s1.indexOf(' ',i+1);
		String secondWord = s1.substring(i+1, j);
		String thirdWord = s1.substring(j+1 ,s1.length());
		
		System.out.println(firstWord);
		System.out.println(secondWord);
		System.out.println(thirdWord);
	}
}
// all project having these type of development
// try development with loop