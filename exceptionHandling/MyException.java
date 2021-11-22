import java.util.Scanner;
class MyException
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the array");
			int size = Integer.parseInt(sc.next());
			int[] arr = new int[size];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=Integer.parseInt(sc.next());
			}
			System.out.println("Enter a index no. Index starts from zero");
			int index = Integer.parseInt(sc.next());
			System.out.println(arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e)
		{
			System.out.println(e.getClass().getName());
		}
	}
}
