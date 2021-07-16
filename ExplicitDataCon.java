/***
Implicit Data conversion of char data byte to higher primitive data type
*/
class ExplicitDataCon
{
	public static void main(String args[])
	{
		double d = 20003d;
		int expint = (int)d;
		System.out.println("Value of double d is "+d);		
		System.out.println("Value of int expint after Explicit conversion is "+expint);
		String s = "30";
		int num = Integer.parseInt(s);
		System.out.println("Value of num is "+num);

	}
}