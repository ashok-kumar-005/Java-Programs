class Outer
{
	int outer_x = 100;
	void test() 
	{
	Inner inner = new Inner();
	System.out.println("Value of 'a' which is variable of inner is : "+a);
	inner.display();
    }
// this is an inner class

	class Inner 
	{
		int a=10;
		void display() 
		{
		       System.out.println("display: outer_x = " + outer_x);
		}
	}
}
class NestedClass 
{
	public static void main(String args[]) 
	{
       	Outer outer = new Outer();
	    outer.test();
	}
}
