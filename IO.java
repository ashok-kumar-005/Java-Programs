import java.util.*;
class IO
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter value of a : ");
		String a = s.next();
		System.out.print("Enter value of b : ");
		String b = s.next();
		String sum = a + b;
		System.out.println("Sum of "+a+" and "+b+" is "+sum);
	}
}