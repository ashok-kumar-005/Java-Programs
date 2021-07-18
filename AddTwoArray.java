class AddTwoArray
{
	public static void main(String args[])
	{
		int[] Arr1 = new int[]{0,1,2,3,4};
		int[] Arr2 = new int[]{5,6,7,8,9};
		int[] Arr3 = new int[10];
		for(int i=0;i<5;i++)
		{
			Arr3[i]= Arr1[i] + Arr2[i];
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(Arr3[i]);
		}
	}
}