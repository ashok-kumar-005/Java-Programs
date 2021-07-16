class A extends Thread
	public void run()
	{
		for(int i = 1;i<10;i++)
		{
			System.out.print(" i = "+i);
			if(i == 5)yield();
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int j = 11;j<20;j++)
		{
			System.out.print(" j = "+j);
		}
	}
}
class ThreadPriority
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		a.setPriority(8);
		b.setPriority(a.getPriority()-3);
		a.start();
		b.start();
	}
}
