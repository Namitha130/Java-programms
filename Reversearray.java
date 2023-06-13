class Reversearray{
	public static void reverse(int[] a)
	{
		int [] b= new int[a.length];
		
		for(int i=a.length -1 ; i >=0 ; i--)
		{
			b[i]= a[i];
			System.out.println(b[i]);
					} 
	}
	public static void main(String[] args) 
	{
		int a1[] = { 20 , 40 , 60 , 80 , 100};
		reverse (a1);			
	}
}
