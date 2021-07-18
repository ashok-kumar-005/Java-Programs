import java.util.*;
class empDetails
{
	
	public static void main(String args[])
	{
		char ch,c;
		Employeee objE = new Employeee();
		Scanner s = new Scanner(System.in);
		System.out.println("***********Employee Details***********");
		do
		{
			System.out.println("1). Enter employee details ");	
			System.out.println("2). Display Employee Details ");
			System.out.println("Enter your choice ");
			ch = s.next().charAt(0);
		
			switch(ch)
			{
				case '1':
					objE.setEmpDetails();
					break;
				case '2':
					objE.getEmpDetails();
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
			System.out.println("Do you want to continue (y/n) : ");
			c = s.next().charAt(0);
		}while(c=='y');
	}
}