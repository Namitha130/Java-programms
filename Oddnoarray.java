class Oddnoarray{
	public static void test(int[] a)
	{
		for(int i=0 ; i<a.length ;i++)
		{
			if(a[i]%2 != 0)
			{
   				System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args) {
		int [] a ={1 ,2, 3, 4 , 5 };
		test(a);
	}
}

