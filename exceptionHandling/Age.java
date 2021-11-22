class invalidAge extends Exception
{
    invalidAge(String s)
    {
        super(s);
    }
}
class Age
{
    public static void main(String[] args)
    {
        try
        {
            String name = args[0];
            Integer age=Integer.parseInt(args[1]);
            System.out.println("Name = " + name);
	    if(age<18||age>=60)
	    	throw new invalidAge("Age should be in inclusive range of 18 to 59");
        }
        catch (invalidAge|ArrayIndexOutOfBoundsException|NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
