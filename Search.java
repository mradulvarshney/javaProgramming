import java.util.Scanner;
class Search
{
	public boolean search(int arr[], int search_element)
	{
		int t=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search_element)
			{
				t=1;
				break;
			}
		}
		if(t==1) return true;
		else return false;
	}
	public static void main(String args[])
	{
		Search obj = new Search();
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int search_element = sc.nextInt();
		boolean res = obj.search(arr, search_element);
		if(res == true)
			System.out.println("Search element is found");
		else
			System.out.println("Search element is not found");
	}
}
