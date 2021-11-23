import java.util.Scanner;
class InvalidCountryException extends Exception
{
	InvalidCountryException(String s)
	{
		super(s);
	}
}
class userRegistration
{
	public void registerUser(String userName, String userCountry) throws InvalidCountryException
	{
		if(userCountry.equals("India"))
			System.out.println("User registration done succesfully");
		else
			throw new InvalidCountryException("User Outside India cannot be registered");
	}
	public static void main(String args[])
	{
		userRegistration obj = new userRegistration();
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter userName");
			String userName = sc.nextLine();
			System.out.println("Enter userCountry");
			String userCountry = sc.nextLine();
			obj.registerUser(userName, userCountry);
		}
		catch(InvalidCountryException e)
		{
			System.out.println(e);
		}
	}
}
