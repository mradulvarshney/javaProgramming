import java.util.Scanner;
class Array
{ 
	Scanner sc = new Scanner(System.in);
	int n,t,arr[];
	public void input()
	{
		n = sc.nextInt();
		arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	public void search()
	{
		t=0;
		System.out.println("Enter a no. to search");
		int num = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(num==arr[i])
				t=i;
		}
	}
	public void show()
	{
		if(t==0)
			System.out.println("-1");
		else
			System.out.println("Found at index " + t);
	}
}
class elementSearch
{
	public static void main(String args[])
	{
		Array obj = new Array();
		obj.input();
		obj.search();
		obj.show();
	}
}
