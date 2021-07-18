import java.util.*;
class Movie1
{
	String name,industry,moviename;
	Scanner s = new Scanner(System.in);
	void role()
	{
		System.out.println("\tMovie1\n");
		System.out.print("Movie Name : ");
		moviename = s.nextLine();
		System.out.print("Enter actor name : ");
		name = s.nextLine();
		System.out.print("Industry name : ");
		industry = s.nextLine();
	}
	void display()
	{
		System.out.println("\tMovie1\n");
		System.out.println("Movie Name : "+moviename);
		System.out.println("Actor Name : "+name);
		System.out.println("Industry Name : "+industry);
	}
}
class Movie2 extends Movie1
{

	Scanner s = new Scanner(System.in);
	void role()
	{
		super.role();
		System.out.println("\tMovie2\n");
		System.out.print("Movie Name : ");
		moviename = s.nextLine();
		System.out.println("Enter actor name : ");
		name = s.nextLine();
		System.out.println("Industry name : ");
		industry = s.nextLine();
	}
	void display()
	{
		super.display();
		System.out.println("\tMovie 2\n");
		System.out.println("Movie Name : "+moviename);
		System.out.println("Actor Name : "+name);
		System.out.println("Industry Name : "+industry);
	}
}
class Movie3 extends Movie2
{
	Scanner s = new Scanner(System.in);
	Movie2 m2 = new Movie2();
	void role()
	{
		m2.role();
		System.out.println("\tMovie3\n");
		System.out.print("Movie Name : ");
		moviename = s.nextLine();
		System.out.println("Enter actor name : ");
		name = s.nextLine();
		System.out.println("Industry name : ");
		industry = s.nextLine();
	}
	void display()
	{
		m2.display();
		System.out.println("\tMovie 3\n");
		System.out.println("Movie Name : "+moviename);
		System.out.println("Actor Name : "+name);
		System.out.println("Industry Name : "+industry);
	}
}
class Industry
{
	public static void main(String args[])
	{
		//Movie1 m1 = new Movie1();
		Movie3 m3 = new Movie3();
		
		
		m3.role();
		//m1.role();
		//m1.display();

		m3.display();
	}
}