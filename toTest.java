interface test
{
	void square(int a);
}
class Arithmetic implements test
{
	public void square(int a)
	{
		System.out.println("Area = " + a*a);
	}
}
class toTest
{
	public static void main(String args[])
	{
		Arithmetic obj = new Arithmetic();
		obj.square(5);
	}
}
