import java.util.*;
class Calculate
{
	int fact;
	int facto(int val)
	{
		fact = 1;	
		for(int i= 1;i<=val;i++)
			fact = fact * i;
		return fact;
	}
}

class Thread1 extends Thread
{
	int n;
	Calculate c = new Calculate();
	Scanner s = new Scanner(System.in);
	static int f;
	public void run()
	{
		System.out.print("Enter number : ");
		int number = s.nextInt();
		f = c.facto(number);
		System.out.println("Factorial of "+number+" is "+f);	
	}
	
}

class Thread2 extends Thread
{
//	Calculate c = new Calculate();
	Thread1 th = new Thread1();
	public void run()
	{		
			int i,factorial = th.f;
			
			int arr[] = new int[10];
			try
			{
				for( i =0;factorial>0;i++,factorial /=10)  // 120    120%10  0     120/10   12     
					arr[i] = factorial % 10;
				System.out.print("Factorial digits are : ");
				for(i=i-1;i>=0;i--)
				{
					Thread.sleep(1000);
					System.out.print(arr[i]);
				}
			}
			catch(Exception e)
			{}
	}
}

class Multifunctioning
{
	public static void main(String args[]) throws InterruptedException
	{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t1.join();
		t2.start();
	}
}