import java.util.Scanner;
import java.util.*;
class _2chars
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		int length=a.length();
		if(length>1)
		{
			String b="";
			char[] arr = a.toCharArray();
			char x=arr[0],y=arr[1];
			for(int i=0;i<length;i++)
			{
				b+=x;
				b+=y;
			}
			System.out.println(b);
		}
		else
			System.out.println(a);
	}
}
