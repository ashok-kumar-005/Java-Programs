class A implements Runnable
{
	public void run()
	{
		for(int i = 1;i<10;i++)
		{
			System.out.print(" i = "+i);
			if(i == 5)yield();
		}
	}
}

class B implements Runnable
{
	public void run()
	{
		for(int j = 11;j<20;j++)
		{
			System.out.print(" j = "+j);
		}
	}
}
class RunnableInterface
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		Thread thr1 = new Thread(a);
		Thread thr2 = new Thread(b);
		thr1.start();
		thr2.start();
	}
}
