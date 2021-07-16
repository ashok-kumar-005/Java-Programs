class Threading extends Thread
{
	public void run()
	{
		System.out.println("Thread is running ");
		System.out.println("Current Thread is : "+Thread.currentThread().getName());	
		System.out.println("Current Thread  priority is : "+Thread.currentThread().getPriority());	
	}
}
class SetThreadPriority
{
	public static void main(String args[]) 
	{
		Threading t1 = new Threading();
		Threading t2 = new Threading();
		t2.setPriority(8);
		t1.start();		
		t2.start();
	}
}