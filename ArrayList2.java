import java.util.*;
class ArrayList2
{
	public static void main(String args[])
	{
		ArrayList a = new ArrayList();
		a.add("Shok");
		a.add("Bhanu");
		System.out.println(a);
		Iterator i = a.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}