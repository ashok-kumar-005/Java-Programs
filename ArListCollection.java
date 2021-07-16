import java.util.*;
class ArListCollection
{
	public static void main(String args[])
	{
		ArrayList arr = new ArrayList();
		arr.add(0,"Ashok");
		arr.add(1,"Rahul");
		arr.add(2,"Gourav");
		arr.add("Gauri");
		System.out.println(arr);
		ArrayList arr2 = new ArrayList();
		arr2.add(0,"Savi");
		arr2.add(1,"Devil");
		arr2.add(2,"Ashok");
		arr2.addAll(1,arr);
		arr.clear();
		System.out.println(arr2);
	}
}