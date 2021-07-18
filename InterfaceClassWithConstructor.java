import java.util.*;
interface Book
{
	String BookName();
}
class Java implements Book
{
	String stri;
	Java(String str)
	{
		stri = str;
	}
	public String BookName()
	{
		return stri;
	}

}

class DS implements Book
{
	String stri;
	DS(String str)
	{
		stri = str;
	}
	public String BookName()
	{
		return stri;
	}
}

class InterfaceClassWithConstructor
{
	public static void main(String args[])
	{
		Java j = new Java("Python");
		System.out.println("Book name : "+j.BookName());
		DS d = new DS("Data Structure");
		System.out.println("Book name : "+d.BookName());
	}
}