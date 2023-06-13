class SpyNum_or_Not
{ 	
	public static boolean spynum(int num)
	{	
		int sum=0;
		int product =1;
		while(num >0)
		{
			int rem = num%10;
			sum = sum +rem;
			product = product*rem;
			num=num/10;
		}
		// return sum;
		// return product;
		if(sum == product)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(spynum(1124));
	}
}