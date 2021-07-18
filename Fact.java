import java.util.*;
class Fact
{
	public static void main(String args[])
	{
		long fact=1;
        int num,i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number for checking factorial : ");
        num = s.nextInt();
        if( num > 25 )
        	System.out.println("Please enter lower number than : "+num);
        else
        {
	        for(i=1;i<=num;i++)
	        {
	            fact=fact*i;
	        }
        	System.out.println("Factorial of "+num+" is "+fact);
        }
        
    }
}