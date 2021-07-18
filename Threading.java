class A extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(" i = "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{

			}
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int j=10;j<20;j++)
		{
			System.out.println(" j = "+j);
			if(j==14)
			{
				stop();
			}
		}
	}
}

class Threading
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		a.start();
		b.start();
	}
}