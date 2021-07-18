import java.util.*;
class Employeee 
{
	String empName,empDesignation;
	double empSallary;
		
	void setEmpDetails()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter employee name : ");
		empName = s.nextLine();
		System.out.print("Enter employee designation : ");
		empDesignation = s.nextLine();
		System.out.print("Enter employee basic salary : ");
		empSallary = s.nextInt();
	}
	void getEmpDetails()
	{
		System.out.println("Employee name : "+empName);
		System.out.println("Designation : "+empDesignation);
		System.out.println("Annual Salary : "+empSallary);	
	}
}