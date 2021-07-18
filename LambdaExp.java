/*Write a program to enter a string from the user
at runtime and print whether number of Consonants or number of vowels are
more in the String entered. Implement the program using Lambda expression.
*/
import java.util.*;
interface LambdaExp
{
	void CalcConstVowel(String s);
}
class Lambda
{
	
	static int consCount=0,vowCount=0;
	public static void main(String args[])
	{
		LambdaExp le = (s)->{

			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
					vowCount++;	
				else 	//System.out.println("Character : "+str.charAt(i)+" is vowel");
					consCount++; //System.out.println("Character : "+str.charAt(i)+" is Consonants");	
			}
			System.out.println("Total Vowels in string : "+s+" is "+vowCount);
			System.out.println("Total Consonants in string : "+s+" is "+consCount);
		};

		Scanner s = new Scanner(System.in);
		System.out.print("Enter any string : ");
		String gStr = s.nextLine();
		gStr = gStr.toLowerCase();
		le.CalcConstVowel(gStr);
	}
}