/* 
Write a program to create two Threads. 1 st Thread printing first character of
each word in the sentence entered by the user and using same input of 1st Thread
in 2nd Thread to print each 2nd character of the sentence entered, after a period of
1 sec. Input from Thread A to be passed to Thread B and ensure that Thread A
gets executed completely first.
*/
import java.util.*;
class  FirstCharacter extends Thread
{
	Scanner obj = new Scanner(System.in);
	static String sentence="";
	public void run()
	{
		System.out.print("Enter any string : ");
		sentence = obj.nextLine();
		int trigger=0;
		try
		{
			System.out.print("First characters of each word of sentence \""+sentence+"\" is : ");
			for(int i=0;i<sentence.length();i++)   // hello world
			{	
				if(sentence.charAt(i)==' ')
				{
					i++; trigger = 1;
				}
				if((i == 0) || (trigger == 1))
				{	
					System.out.print(sentence.charAt(i)+"   ");
					Thread.sleep(1000);
					trigger = 0;
				}
			}
		}
		catch(InterruptedException e)
		{}
	}	
}

class SecondCharacter extends Thread
{
	FirstCharacter f = new FirstCharacter();
	public void run()
	{
		int trigger=0;
		try
		{
			System.out.print("\nSecond characters of each word of sentence \""+f.sentence+"\" is : ");
			for(int i=0;i<f.sentence.length();i++)   // hello world
			{	
				if(f.sentence.charAt(i)==' ')
				{
					i++; trigger = 1;
				}
				if(i == 1)
				{	
					System.out.print(f.sentence.charAt(i)+"   ");
					Thread.sleep(1000);
					trigger = 0;
					
				}
				if(trigger == 1)
				{
					System.out.print(f.sentence.charAt(i+1)+"   ");
					Thread.sleep(1000);
					trigger = 0;
				}
			}
		}
		catch(InterruptedException e)
		{}

	}
}

class Printing
{
	public static void main(String args[]) throws InterruptedException
	{
		FirstCharacter fc = new FirstCharacter();
		SecondCharacter sc = new SecondCharacter();
		fc.start();
		fc.join();
		sc.start();
	}
}