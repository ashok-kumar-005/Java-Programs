import java.util.*;
class Employee
{
	String name,designation;
	int salary;
	float deductedSalary,annualSallary;
	//Scanner s = new Scanner(System.in);
	public static void main(String args[])
	{
		char ch,c;
		Employee objE = new Employee();
		Scanner s = new Scanner(System.in);
		System.out.println("***********Employee Salary***********");
		do
		{
			System.out.println("1). Enter employee details ");	
			System.out.println("2). Find total net salary ");
			System.out.println("3). Display Employee Details ");
			System.out.println("Enter your choice ");
			ch = s.next().charAt(0);
		
			switch(ch)
			{
				case '1':
					objE.employee_details();
					break;
				case '2':
					objE.calculateNetSalary();
					break;
				case '3':
					objE.Display();
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
			System.out.println("Do you want to continue (y/n) : ");
			c = s.next().charAt(0);
		}while(c=='y');
	}
	public void employee_details()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter employee name : ");
		name = s.nextLine();
		System.out.print("Enter employee designation : ");
		designation = s.nextLine();
		System.out.print("Enter employee basic salary : ");
		salary = s.nextInt();
	}
	public void calculateNetSalary()
	{
		deductedSalary = ((35 * salary )/100)*10;
		annualSallary = (salary)*12 - deductedSalary; 
	}
	public void Display()
	{
		System.out.println("Employee name : "+name);
		System.out.println("Designation : "+designation);
		System.out.println("Deducted Salary : "+deductedSalary);
		System.out.println("Annual Salary : "+annualSallary);
	}
}