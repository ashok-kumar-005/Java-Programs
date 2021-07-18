import java.util.*;
class LinkedLists
{
	public static void main(String args[])
	{
		LinkedList<String> s=new LinkedList<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		System.out.println(s);
		s.removeFirst();
		System.out.println("After removing first element from LinkedList, list is : "+s);
		s.removeLast();
		System.out.println("After removing last element from LinkedList, list is : "+s);
		System.out.println("GetFirst : "+s.getFirst());

	}
}