class Threading extends Thread
{
	public void run()
	{

		System.out.println("Thread is sleeping for 3 seconds ");
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Thread Completed ");
	}
}
class SleepingThread
{
	public static void main(String args[]) 
	{
		Threading t = new Threading();
		t.start();	
		t.start();	
	}
}