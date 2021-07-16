import java.util.*;
class ObjectPara
{
	int a,b;
	ObjectPara(int c,int d)
	{
		a = c;
		b = d;
	}
	void IsEqual(ObjectPara OP)
	{
		if(OP.a == a && OP.b == b)
		{
			System.out.println("Value of OP.a and a is "+OP.a+" "+a);
			System.out.println("Value of OP.b and b is "+OP.b+" "+b);	
			System.out.println("Yes Equal");
		}
		else
		{
  			System.out.println("Value of OP.a and a is "+OP.a+" "+a);
			System.out.println("Value of OP.b and b is "+OP.b+" "+b);	
			System.out.println("Not Equal");	
		}
	}

}
class Object
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a,b,c,d;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		ObjectPara Obj = new ObjectPara(a,b);
		ObjectPara Obj2 = new ObjectPara(c,d);
		Obj2.IsEqual(Obj);
	}
}