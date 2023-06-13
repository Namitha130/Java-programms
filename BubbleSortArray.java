class BubbleSortArray
{	
	public static int[] sort(int[] num)
	{
		for(int i=0; i<=num.length-1;i++)
		{
			for(int j=0; j<num.length-2;j++)
			{
				if(num[j] > num[j+1])
				{
					int temp=num[j];
					num[j] =num[j+1];
					num[j+1]=temp;

				}
			}
		}
		

		return num;
	}
	public static void main(String[] args) 
	{
		int[] num ={7,1,3, 5,8,6,4,2};
		//System.out.println(sort(num));;
		// for(int k=0; k<=num.length-1;k++)
		// {
		// 	System.out.println(num[k]);
		// }

	}
}