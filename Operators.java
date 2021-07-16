class Operators
{
	public static void main(String args[])
	{
		int uni = 10;
		// Unary Operators
		System.out.println("Value of uni is "+uni);
		System.out.println("Value of post-incremented uni is "+uni++);
		System.out.println("Value of uni is "+uni);
		System.out.println("Value of pre-incremented uni is "+ ++uni);
		System.out.println("Value of uni is "+uni);

		// Arithmetic Operators
		int a = 30;
		int b = 13;
		int add = a + b;
		int sub = a - b;
		float div = (float)a / b;
		int mul = a * b;
		int modulous = a % b;
		System.out.println("Sum of "+a+" and "+b+" is "+add);
		System.out.println("Subtraction of "+a+" and "+b+" is "+sub);
		System.out.println("Division of "+a+" and "+b+" is "+div);
		System.out.println("Multiplication of "+a+" and "+b+" is "+mul);
		System.out.println("Modulous of "+a+" and "+b+" is "+modulous);

		// Assignment Operators
		boolean offline = true;
		System.out.println("Mode : "+offline);
		boolean ashok =! offline;
		System.out.println("Mode : "+ashok);

		// Shift Operators
		int shift = 30;
		int leftShifted = shift<<2;
		System.out.println("Left Shift 2 of "+shift+" : "+leftShifted);		
		int rightShifted = shift>>2;
		System.out.println("Left Shift 2 of "+shift+" : "+rightShifted);		

	}
}