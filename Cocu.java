
class Cocu
{
	static String RepeatCharacter(String str,char c,int n)
	{
		System.out.println("Character is : "+str);
		String rptstr="";
		String rest="";
		int mid;
		mid = str.length()/2;
		for(int i=0;i<mid;i++)
			rptstr +=str.charAt(i);

		for(int i=mid;i<str.length();i++)
			rest +=str.charAt(i);
	
		for(;n!=0;mid++,n--)
			rptstr += c;

		for(int i=0;i<rest.length();i++)
			rptstr +=rest.charAt(i);

		return rptstr;
	}	

	public static void main(String args[])
	{
		String sr="xyzxyz";
		int multiple = 7;
		char c = 'r';
		String p = RepeatCharacter(sr,c,multiple);
		System.out.println("Repeated str is : "+p);
	}
}