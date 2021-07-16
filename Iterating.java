// Iterating using ListIterator
import java.util.*;
class Iterating
{
	public static void main(String args[])
	{
		ArrayList list=new ArrayList();
		list.add("Ashok");
		list.add("Bilal");
		list.add(0,"Rizwan");
		Iterator i = list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}