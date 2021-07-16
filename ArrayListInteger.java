import java.util.*;
class ArrayListInteger
{
	public static void main(String args[])
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(100);
		a.add(20);
		System.out.println(a.get(1));
		// a.set(3,120); error
		a.set(1,120);
		Iterator i = a.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}