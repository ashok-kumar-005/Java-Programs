interface Book
{
	void BookName();
}
class Java implements Book
{
	public void BookName()
	{
		System.out.println("Java Book");
	}
}

class DS implements Book
{
	public void BookName()
	{
		System.out.println("Data Structure Book");
	}
}

class InterfaceClass
{
	public static void main(String args[])
	{
		Java j = new Java();
		j.BookName();
		DS d = new DS();
		d.BookName();
	}
}