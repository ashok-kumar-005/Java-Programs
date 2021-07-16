import java.util.*;
class IndexOf
{
	public static void main(String args[])
	{
		Scanner inp=new Scanner(System.in);
		String str = "Ashokh";
		int index = str.indexOf('h');
		int indexpar = str.indexOf('h',1);
		System.out.println("Index of a 'h' is : "+index);
		System.out.println("Parameter Index of a 'h' is : "+indexpar);
	}
}