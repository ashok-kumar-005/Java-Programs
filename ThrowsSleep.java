class A extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(" i = "+i);
			try
			{
				Thread.sleep(500);	
			}
			catch(Exception e)
			{}
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

class ThrowsSleep
{
	public static void main(String args[]) throws InterruptedException
	{
		A a = new A();
		B b = new B();
		a.start();
		a.join();
		b.start();
	}
}