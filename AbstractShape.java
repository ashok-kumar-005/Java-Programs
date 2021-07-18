abstract class Shape
{
	double a,b,r;
	Shape(double c, double d)
	{
		a = c;
		b = d;
	}
	Shape(double e)
	{
		r = e;
	}
	abstract double area();
}

abstract class circle extends Shape
{
	circle(double radius)
	{
		super(radius);
	}
	/*double area()
	{
		System.out.print("Area of circle is : ");
		return (3.14*r*r);
	}*/
}

class triangle extends Shape
{
	triangle(double base,double altitude)
	{
		super(base,altitude);
	}
	double area()
	{
		System.out.print("\nArea of triangle is : ");
		return (0.5*a*b);
	}
}

class AbstractShape
{
	public static void main(String args[])
	{
		//Shape c = new circle(10);
		Shape t = new triangle(2,3);
		//System.out.print(c.area());
		System.out.print(t.area());
		
	}
}