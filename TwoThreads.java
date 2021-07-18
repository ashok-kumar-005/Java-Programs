import java.util.*;
class EvenThread extends Thread
{
	public void run()
	{
		System.out.println("Running even numbers thread......"); 
		for(int i=2;i<=50;i+=2) 
			System.out.print(i+ " ");	
	}
} 

class OddThread extends Thread
{
	public void run()
	{
		System.out.println("\nRunning odd numbers thread......"); 
		for(int i=1;i< 50;i+=2) 
			System.out.print(i+ " ");
	}

}

class TwoThreads
{
	public static void main(String args[]) throws InterruptedException 
	{
		System.out.println("\n*************Even and odd numbers thread***********\n"); 
		EvenThread et = new EvenThread();
		OddThread ot = new OddThread();
		et.start();
		et.join();
		ot.start();
	}
}