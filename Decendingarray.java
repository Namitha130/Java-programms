class Decendingarray{
	public static void test(int[] a){
 int temp=0;
		for(int i=0; i < a.length; i++ )
		{
			for(int j= i+1 ; j <a.length ;j++)
			{
				if( a[i] < a[j])
				
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}	
			}
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int[] a= {20, 30, 40,
		 50, 10};
 			test(a);
	}
}