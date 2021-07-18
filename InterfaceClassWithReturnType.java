import java.util.*;
interface Book
{
	String BookName();
}
class Java implements Book
{
	Scanner s = new Scanner(System.in);
	public String BookName()
	{
		String st;
		System.out.println("Enter book name : ");
		st = s.nextLine();
		return st;
	}

}

class DS implements Book
{
	Scanner s = new Scanner(System.in);
	public String BookName()
	{
		String st;
		System.out.println("Enter book name : ");
		st = s.nextLine();
		return st;
	}
}

class InterfaceClassWithReturnType
{
	public static void main(String args[])
	{
		Java j = new Java();
		System.out.println("Book name : "+j.BookName());
		DS d = new DS();
		System.out.println("Book name : "+d.BookName());
	}
}