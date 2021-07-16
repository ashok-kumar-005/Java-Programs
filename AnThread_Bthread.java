import java.util.*;
class AnThread extends Thread
{
	public void run()
	{
		try
		{
			
			while(true)
			{
				System.out.print("An ");
				Thread.sleep(1000);
			}
			
		}
		catch(Exception e)
		{}
	}
}
class BThread extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("");
			while(true)
			{
				System.out.print("\nB\n");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{}
	}
}
class AnThread_Bthread
{
	public static void main(String a[])
	{
		System.out.println("\n*************Executing two threads at the interval of 1 and 3sec***********\n"); 
		AnThread at = new AnThread();
		BThread bt = new BThread();	
		at.start();
		bt.start();
	}
}