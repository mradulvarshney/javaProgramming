import java.lang.Math;
import java.util.Scanner;
class Calculator
{
	public static int powerInt(int num1, int num2)
	{
		return (int)Math.pow(num1,num2);
	}
	public static double powerDouble(double num1, double num2)
	{
		return Math.pow(num1,num2);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(powerInt(sc.nextInt(), sc.nextInt()));
		System.out.println(powerDouble(sc.nextDouble(), sc.nextDouble()));
	}
}
