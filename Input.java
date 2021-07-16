import java.util.*;

class takeinput
{

public static void main(String []args)
{
int ch;
int num1,num2,result;
Scanner sc=new Scanner(System.in);
System.out.println("Select your choice");
System.out.println("1.Add \n2.Sub\n3.Mult\n4.Div");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter number1");
num1=sc.nextInt();
System.out.println("Enter number2");
num2=sc.nextInt();
result=num1+num2;
System.out.println("Addition:"+result);
break;
case 2:
System.out.println("Enter number1");
num1=sc.nextInt();
System.out.println("Enter number2");
num2=sc.nextInt();
result=num1-num2;
System.out.println("Subtraction:"+result);
break;
default:
System.out.println("Invalid choice");
break;
}
}



}