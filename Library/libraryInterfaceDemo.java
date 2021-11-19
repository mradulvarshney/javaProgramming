package Library;
import java.util.Scanner;
interface libraryUser
{
	void registerAccount(int age);
	void requestBook(String bookType);
}
class kidUsers implements libraryUser
{
	int age;
	String bookType;
	public void registerAccount(int age)
	{
		if(age<12)
			System.out.println("You have succesfully registered under a Kids Account");
		else if(age>12)
			System.out.println("Sorry,Age must be less than 12 to register as a Kid");
	}
	public void requestBook(String bookType)
	{
		if(bookType.equals("Kids"))
			System.out.println("Book issued succesfully, please return the book within 10 days");
		else
			System.out.println("Oops, you are allowed to take only Kids book");
	}
}
class adultUser implements libraryUser
{
	int age;
	String bookType;
	public void registerAccount(int age)
	{
		if(age>12)
			System.out.println("You have succesfully registered under an Adult Account");
		else if(age<12)
			System.out.println("Sorry, Age must be greater than 12 to register as an Adult");
	}
	public void requestBook(String bookType)
	{
		if(bookType.equals("Fiction"))
			System.out.println("Book issued succesfully, please return the book within 7 days");
		else
			System.out.println("Oops, you are allowed to take only adult Fiction book");
	}
}
class libraryInterfaceDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		kidUsers obj1 = new kidUsers();
		System.out.println("Enter you age");
		int age1 =sc.nextInt();
		obj1.registerAccount(age1);
		sc.nextLine();
		if(age1<12)
		{
			System.out.println("Enter type of book");
			obj1.requestBook(sc.nextLine());
		}

		adultUser obj2 = new adultUser();
		System.out.println("Enter yor age");
		int age2 =sc.nextInt();
		obj2.registerAccount(age2);
		sc.nextLine();
		if(age2>12)
		{
			System.out.println("Enter type of book");
			obj2.requestBook(sc.nextLine());
		}
	}
}
