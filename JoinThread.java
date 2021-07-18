class A extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(" i = "+i);
			
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int j=10;j<20;j++)
		{
			System.out.print(" \nj = "+j);
			System.out.println("");
		}
	}
}

class JoinThread
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		a.start();
		try
		{
			a.join();
		}
		catch(InterruptedException e)
		{
			
		}
		b.start();
	}
}