class UseStatic 
{
	static int a = 3;
	static int b;
	static void meth(int x) 
	{
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	static 
	{
		System.out.println("Static block initialized.");
		b = a * 4;
	}
}
class Stat
{
	public static void main(String args[]) 
	{
		UseStatic.meth(42);
		System.out.println("Value of a in main is : " + UseStatic.a);
		System.out.println("Value of b in main is :  " + UseStatic.b);
	}
}