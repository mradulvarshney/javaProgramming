import java.util.Scanner;
class arraySum
{
	public static void main(String args[])
	{
		int i,a=0,b=0,sum=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]==6)
				a=i;
			if(arr[i]==7)
				b=i;
		}
		if(a<b)
		{
			for(i=0;i<n;i++)
			{
				if(i>=a && i<=b)
					continue;
				else
					sum+=arr[i];
			}
		}
		else
		{
			for(i=0;i<n;i++)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}
}