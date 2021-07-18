import java.util.*;
class Table
{
	synchronized void table(int num)
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
}
class Multithreading extends Thread
{
	Table t;
	int num;
	Multithreading(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		System.out.println("Enter number : ");
		Scanner s = new Scanner(System.in);
		num=s.nextInt();
		t.table(num);
	}
}
class Multithreading2 extends Thread
{
	Table t;
	int num;
	Multithreading2(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		System.out.println("Enter number : ");
		Scanner s = new Scanner(System.in);
		num=s.nextInt();
		t.table(num);
	}
}
class Synchronization
{
	public static void main(String args[])
	{
		Table t = new Table();
		Multithreading m1 = new Multithreading(t);
		Multithreading2 m2 = new Multithreading2(t);
		m1.start();
		m2.start();

	}
}