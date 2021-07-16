class Threading extends Thread
{
	public void run()
	{
		System.out.println("Thread is running ");
		System.out.println("Current Thread is : "+Thread.currentThread().getName());	
	}
}
class CurrentThread
{
	public static void main(String args[]) 
	{
		Threading t1 = new Threading();
		Threading t2 = new Threading();
		t1.start();		
		t2.start();
	}
}