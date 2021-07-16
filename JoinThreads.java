import java.util.*;
class Multithreading implements Runnable
{
	int num;
	void table(int num)
	{
		for(int i=1;i<=10;i++)
		{
			try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{}
				System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
	public void run()
	{
		System.out.println("Enter number : ");
		Scanner s = new Scanner(System.in);
		num=s.nextInt();
		table(num);
	}
}
class JoinThreads
{
	public static void main(String args[])
	{
		Multithreading m1 = new Multithreading();
		Multithreading m2 = new Multithreading();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.start();
		try
		{
			t1.join();
		}
		catch(InterruptedException e){}
		t2.start();

	}
}