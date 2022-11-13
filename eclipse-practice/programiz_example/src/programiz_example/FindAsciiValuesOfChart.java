package programiz_example;
import java.util.*;
public class FindAsciiValuesOfChart
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		char c = sc.next().charAt(0);
		int ascii = c;
		System.out.println("ASCII Value of "+c+ " is "+ascii );
	}

}
/*

public class AsciiValue {

    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}


 */
