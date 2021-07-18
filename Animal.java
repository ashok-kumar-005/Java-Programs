import java.util.*;
class AnimalClass
{  
	String animalColor;
	AnimalClass(String str)
	{
		animalColor = str;
	}
	void colour()
	{
		System.out.println("Animal color "+animalColor);
	}
}  
class Dog extends AnimalClass
{  
	String color;
	Dog(String c)
	{
		super(c);
		color = c;
	}
	void printColor()
	{  
		System.out.println("Dog color "+color);//prints color of Dog class  
	}  
}  
class Animal
{  
	public static void main(String args[])
	{  
		
		System.out.println("Enter dog color : ");
		Scanner sOBJ = new Scanner(System.in);
		String col = sOBJ.nextLine();
		Dog d=new Dog(col);  
		d.colour();
		d.printColor();
	}	
}