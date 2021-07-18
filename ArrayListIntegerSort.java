import java.util.*;
class ArrayListIntegerSort
{
	public static void main(String args[])
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(100);
		a.add(20);
		a.add(80);
		a.add(150);
		System.out.println(a.get(1));
		// a.set(3,120); error
		a.set(1,120);
		Iterator i = a.iterator();
		Collections.sort(a);
		for(int b:a)
			System.out.println(b);
	}
}