import java.util.Scanner;
class Programming
{
	Programming()
	{
		System.out.println("I Love Programming Language");
	}
	Programming(String language)
	{
		System.out.println("I Love " + language);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Programming obj1 = new Programming();
		Programming obj2 = new Programming(sc.next());
	}
}
