class ThreadEven extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
}
class ThreadOdd extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}
	}
}
class ThreadOddEvenMain
{
	public static void main(String args[])
	{
		ThreadEven even = new ThreadEven();
		ThreadOdd odd = new ThreadOdd();
		even.start();
		try
		{
		  	even.join();
 		}
 		catch(Exception e)
 		{
			System.out.println(e);
		}
		odd.start();
		try
		{
			odd.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
