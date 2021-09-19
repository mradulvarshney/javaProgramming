import java.util.Scanner;
class trueFalse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean b = false;
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]==1 || arr[i]==4)
			{
				b = true;
			}
			else
			{
				b = false;
				break;
			}
		}
		System.out.println(b);
	}
}