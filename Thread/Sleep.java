class Sleep extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==6)
			{
				try
				{
					Thread.sleep(5000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Sleep th1 = new Sleep();
		th1.start();
	}
}
