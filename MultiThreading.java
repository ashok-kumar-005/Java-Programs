class A extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.print("Hello Ashok \t");
	}
}

class B extends Thread
{
	public void run()
	{
		for(int j=10;j<20;j++)
			System.out.print("\nHello World \t");
	}
}

class MultiThreading
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		a.start();
		b.start();
	}
}


Total subnets : 512
Hosts/Subnet  : 32766 ( 2 are reserved)
Calculated Subnet Mask : 255.255.128.0/17
Range of Subnets :
First Subnet : 122.0.0.0 First IP : 122.0.0.1 End IP : 122.0.127.254 BroadCast IP : 122.0.127.255
Second Subnet : 122.0.128.0


