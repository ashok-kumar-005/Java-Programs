class Threading extends Thread
{
	public void run()
	{
		System.out.println("Thread is running ");
	}
}
class MultiThreadUsingThread
{
	public static void main(String args[]) 
	{
		Threading t = new Threading();
		t.start();		
		
	}
}