import java.util.Scanner;
class concat2Strings
{
	public static void main(String agrs[])
	{
		Scanner sc =new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int l1=s1.length();
		int l2=s2.length();
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		if(arr1[l1-1]==(arr2[0]))
		{
			for(int i=1;i<l2;i++)
			{
				s1+=arr2[i];
			}
			System.out.println(s1);
		}
		else
			System.out.println(s1+s2);
	}
}
