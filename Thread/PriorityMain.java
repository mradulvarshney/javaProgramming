class PriorityMain extends Thread
{
	public void run()
	{
		System.out.println("The current thread name is: " + Thread.currentThread().getName());
	}
	public static void main(String args[])
		{
			PriorityMain th1 = new PriorityMain();
			PriorityMain th2 = new PriorityMain();
			PriorityMain th3 = new PriorityMain();
			th1.setPriority(MIN_PRIORITY);
			th2.setPriority(NORM_PRIORITY);
			th3.setPriority(MAX_PRIORITY);
			th1.start();
			th2.start();
			th3.start();
	}
}
