import java.util.*;
class SwapArrayListElements
{
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);
		int num,limit,pos1,pos2,temp;
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println("***************Program of swapping elements in ArrayList***************");
		System.out.print("\nEnter number of elements you want to insert in 1st ArrayList : ");
		limit = s.nextInt();
		System.out.print("Enter "+limit+" numbers : ");
		for(int i=1;i<=limit;i++)
		{
			num = s.nextInt();
			a.add(num);
		}

		Iterator i = a.iterator();
		System.out.print("Elements of ArrayList before swapping are : ");
		while(i.hasNext())
			System.out.print(i.next()+"  ");
		System.out.println("\nWhich two positions you want to swap in b/w 1 and "+limit);
		pos1 = s.nextInt();
		pos2 = s.nextInt();
		temp = a.get(pos1-1);
		a.set(pos1-1,a.get(pos2-1));
		a.set(pos2-1,temp);
		Iterator j = a.iterator();
		System.out.print("Elements of ArrayList after swapping are : ");
		while(j.hasNext())
			System.out.print(j.next()+"  ");
	}
}