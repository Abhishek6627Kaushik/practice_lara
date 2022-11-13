// 3 . Java Program to Multiply two Floating Point Numbers
package programiz_example;
import java.util.*;
public class MulTwoFlotingPoint
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("pls give two values");
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float total = n1 * n2;
		System.out.println("Total of "+ n1+ " and "+n2+ " is "+total);
	}

}

/*

public class MultiplyTwoNumbers {

public static void main(String[] args) {

    float first = 1.5f;
    float second = 2.0f;

    float product = first * second;

    System.out.println("The product is: " + product);
}
}*/