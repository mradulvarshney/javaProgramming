import java.util.Scanner;
class reverse2D
{
	public static void main(String args[])
	{
		int k=0,i,j;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[][] arr2 = new int[2][2];
		for(i=0;i<n;i++)
		{
			arr1[i] = sc.nextInt();
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				arr2[i][j]=arr1[k++];
			}
		}
		System.out.println("The given array is:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The reverse of the array is:");
		for(i=1;i>=0;i--)
		{
			for(j=1;j>=0;j--)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}