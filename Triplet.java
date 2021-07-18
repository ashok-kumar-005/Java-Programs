
class Triplet
{// Java program to count triplets with given
// product m


	// Method to count such triplets
	static int countTriplets(int arr[], int n, int m)
	{
		int count = 0;

		// Consider all triplets and count if
		// their product is equal to m
		for (int i = 0; i < n - 2; i++)
			for (int j = i + 1; j < n - 1; j++)
				for (int k = j + 1; k < n; k++)
					if (arr[i] * arr[j] * arr[k] == m)
						count++;

		return count;
	}

	// Driver method
	public static void main(String[] args)
	{
		int arr[] = { 5,3, 20, 10, 1, 4, 2 };
		int m = 60;

		System.out.println(countTriplets(arr, arr.length, m));
	}
}

/*{
	static int trip(int n,int arr[])
	{
		int res=9;
		int count=0;
		int product,numbers;
		product = numbers=1;
		System.out.println("length : "+arr.length);
		for(int i=0;i<arr.length;i++)
		{
	
			System.out.println("i : "+i);
			for(int j=0;j<arr.length-1;j++)
			{

				//j=0 // j = 1	
				product = arr[j] * arr[j+1]; //15
				System.out.println("Product and j : "+product+" "+j);
				for(int k=0;k<arr.length;k++)
				{
							 // 15 * 
					System.out.println(" hellProduct : "+product);
					if(k==i && k==j) //j=0 // j = 1
						continue;
					System.out.println("k : "+k);
					if((product * arr[k]) == n) // 15 < 60
					 {
					 	count++;
					 	System.out.println("equal ");
					 }
				}
	*/			
				/*if(product > n )
				{j++;System.out.println("j : "+j);}
				else
				{
					product = product * arr[j]; // 15
					System.out.println("Product and j : "+product+" "+j);
					if((product * arr[j]) < n) // 15 < 60
					{	
						j++; 
						numbers++;
						System.out.println("Product : "+product);
					}

					if(product == n && numbers == 3)
						count++;
					System.out.println("Count : "+count);

				}
				System.out.println("Count : "+count);
			}
			
		}
		return res;
	}
	

	public static void main(String args[])
	{
		int product = 60;
		int arr[]={5,3,20,10,1,4,2};
		int result = trip(product,arr);
	}
}*/