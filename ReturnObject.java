class Refer
{
	int a;
	Refer(int i)
	{
		a=i;
	}
	Refer increment()
	{
		Refer r = new Refer(a+100);
		return r;
	}
}
class ReturnObject
{
	public static void main(String args[])
	{
		Refer RObj = new Refer(200);
		Refer RObj2 = RObj.increment();
		System.out.println("Value of a in RObj2 : "+RObj2.a);
	}
}