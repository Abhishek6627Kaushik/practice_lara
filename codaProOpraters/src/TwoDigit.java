/*14. Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.
For example, if the number which was taken is 5696, then the displayed number should be 7818.
*/
import java.util.Scanner;
class TwoDigit
{
	public static void main(String[] args)
{
		Scanner sc =new Scanner(System.in);
  int a =sc.nextInt(), one, two, three, four;
 //   scanf("%d", &n);

    one   = (a / 1000)+2;
    int b  = (a % 1000);
	two   = (b / 100) + 2;
	int c     = (b % 100);
	int d    = c /10+2;
	three = (d / 10);
			int e    = (c % 10);
    four  = e + 2;
	 //String result = Integer.toString(one)+Integer.toString(two)+Integer.toString(three)+Integer.toString(four);
    int result = (one * 1000) + (two * 100) + (three * 10) + four;
	System.out.println(" " +result);
	}
}