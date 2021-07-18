import java.util.*;
class TreeSetEg
{
	public static void main(String args[])
	{
		TreeSet<String> al=new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		Iterator itr=al.iterator();
		System.out.println(al);
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Traversing in descending order : ");
		Iterator dec=al.descendingIterator();
		System.out.println("Head Set: "+al.headSet("Ajay", true));
		while(dec.hasNext())
			System.out.println(dec.next());
		System.out.println("Removing first element : "+al.pollFirst());
		System.out.println("Head Set: "+al.headSet("C", true));

	}
}