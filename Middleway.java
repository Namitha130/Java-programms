class Middleway{

	public static int[] middleway(int[] a, int[] b)
	{
		int [] c= new int[2];
		c[0] = a[1];
		c[1] = b[1];
		return c;
	}

	public static void main(String[] args) 
	{
		int [] input1={1,2,3};
		int [] input2 ={4,5,6};
		int [] result = middleway(input1,input2);
		for(int i=0;i <= result.length-1; i++)
		{
			System.out.println(result[i]);
		}
		
	}		 		
}

