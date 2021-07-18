class Threading extends Thread
{
	public void run()
	{
		System.out.println("Thread is running ");
	}
}
class ThreadName
{
	public static void main(String args[]) 
	{
		Threading t = new Threading();
		System.out.println("Thread name before changing : "+t.getName());	
		t.start();		
		t.setName("Devil");
		System.out.println("Thread name after changing : "+t.getName());	
		
	}
}