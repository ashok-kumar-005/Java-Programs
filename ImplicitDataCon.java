/***
Implicit Data conversion of char data byte to higher primitive data type
*/
class ImplicitDataCon
{
	public static void main(String args[])
	{
		char c = 'a';
		int a = c;
		float f = c;		
		long l = c;		
		double d = c;		
		System.out.println("Value of int a after Implicit conversion = "+a+"\nValue of float f after Implicit conversion = "+f+"\nValue of long l after Implicit conversion = "+l+"\nValue of double d after Implicit conversion = "+d);

	}
}