class AddAmount
{
	int amt = 50;
	AddAmount()
	{
		System.out.println(amt);
	}
	AddAmount(int n)
	{
		System.out.println(amt+=n);
	}
}
class PiggieBank
{
	public static void main(String args[])
	{
		AddAmount obj1 = new AddAmount();
		AddAmount obj2 = new AddAmount(100);
	}
}
