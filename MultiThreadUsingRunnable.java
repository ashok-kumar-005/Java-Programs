class Threading implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running ");
	}
}
class MultiThreadUsingRunnable
{
	public static void main(String args[]) 
	{
		Threading t = new Threading();
		Thread tOBJ = new Thread(t);
		tOBJ.start();		
		
	}
}