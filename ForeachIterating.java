// Iterating using foreach loop
import java.util.*;
class ForeachIterating
{
	public static void main(String args[])
	{
		ArrayList list=new ArrayList();
		list.add("Ashok");
		list.add("Bilal");
		list.add(0,"Rizwan");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println("List size is : "+list.size());
		ListIterator i = list.listIterator(list.size());
		while(i.hasPrevious())
		{
			String s = i.previous();
			System.out.println("Element is : "+s);
		}
			
	}
}