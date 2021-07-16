class Swap
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 30;
		System.out.println("Before swapping, the value of  a is "+a+" and b is "+b);
		swapping(a,b);		
	}
	public static void swapping(int a,int b)
	{
		a = a + b; // a = 40
		b = a - b; // a - b = 40 - 30 = 10
		a = a - b;
		System.out.println("Before swapping, the value of  a is "+a+" and b is "+b);
	}
}