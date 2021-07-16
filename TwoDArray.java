class TwoDArray
{
	public static void main(String args[])
	{
		int[][] Array2D = new int[3][3];
		int num = 1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				Array2D[i][j]=num;
				num++;
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(Array2D[i][j] + " ");
			}
				System.out.println("");
		}
	}
}