class ReturningFunction
{
	public static void main(String args[])
	{
		ReturningFunction objR = new ReturningFunction();
		int a = 10;
		int b = 30;
		int sum = objR.add(a,b);
		System.out.println("Sum of "+a+" and "+b+" is "+sum);
	}
	public int add(int a,int b)
	{
		return a+b;
	}
}