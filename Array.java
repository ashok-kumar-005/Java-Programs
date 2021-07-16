class Array
{
	public static void main(String args[])
	{
		char[] arr=new char[5];
		int [] IntegerArray = new int[10];
		for(int i=0;i<10;i++)
			IntegerArray[i]=i+1;
		System.out.print("Values are : ");
		for(int i=0;i<10;i++)
			System.out.print(IntegerArray[i]+"\t");
		arr[0] = 'a';
		arr[1] = 's';
		arr[2] = 'h';
		arr[3] = 'o';
		arr[4] = 'k';
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]);
		}
	}
}