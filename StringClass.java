class StringClass
{
	public static void main(String args[]) 
	{
		char c[]={'a','s','h','o','k'};
		String s1 = new String(c,0,3);
		String str = "devil is my username";
		// String s2 = new String(str,0,3); // It will generate an error because String Constructor takes onle char[] datatype as a parameter
		System.out.println("String is : "+s1);
		//System.out.println("String d to i : "+s2);
		char buf[]=new char[0-5];
		System.out.println("Characters : "+str.getChars(0,5,buf,0));
		
	}
}