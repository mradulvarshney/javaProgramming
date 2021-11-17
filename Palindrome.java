import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=num, rem, sum=0;
		while(i!=0)
		{
			rem = i%10;
			sum = sum*10 + rem;
			i/=10;
		}
		if (sum==num)
			System.out.println(num + " is a palindrome");
		else
			System.out.println(num + " is not a palindrome");
	}
}
