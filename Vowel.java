import java.util.*;
class Vowel
{
	public static void main(String args[])
	{
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String str=inp.nextLine();
		int count=0;
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("Number of vowels : "+count);
	}
}