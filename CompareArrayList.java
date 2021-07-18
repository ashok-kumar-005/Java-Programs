import java.util.*;
class CompareArrayList
{

	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);
		int num,limit;
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		System.out.println("\n**********Program for Comparing two ArrayLists**********\n");
		System.out.print("Enter number of elements you want to insert in 1st ArrayList : ");
		limit = s.nextInt();
		System.out.print("Enter "+limit+" numbers : ");
		for(int i=1;i<=limit;i++)
		{
			num = s.nextInt();
			a.add(num);
		}

		System.out.print("Enter number of elements you want to insert in 2nd ArrayList : ");
		limit = s.nextInt();
		System.out.print("Enter "+limit+" numbers : ");
		for(int i=1;i<=limit;i++)
		{
			num = s.nextInt();
			b.add(num);
		}

		Iterator i = a.iterator();
		System.out.print("Elements of first ArrayList are : ");
		while(i.hasNext())
			System.out.print(i.next()+"  ");

		Iterator j = b.iterator();
		System.out.print("\nElements of second ArrayList are : ");
		while(j.hasNext())
			System.out.print(j.next()+"  ");

		if(a.equals(b))
			System.out.print("\nBoth the arraylists are same");
		else
			System.out.print("\nBoth the arraylists are not same");

	}
}