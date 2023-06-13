class Array{
	public static void main(String[] args) 
	{
		int [] a = {2,4,5,7};
			int n= a.length;
		int [] b= new int[n];
		for(int i=n-1; i>= 0; i--)
		{
			b[i]=a[i];
			System.out.println(b[i]);

		}

	
		// System.out.println(a[0]);
		// System.out.println(a[n-1]);
		// System.out.println(a[(n-1)/2]);
	 
	 	// for(int i=0; i< a.length;i++)
	 	// {
	 	// 	System.out.println(a[i]);

	 	// }
	}
}