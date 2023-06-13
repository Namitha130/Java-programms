class FreqencyRange
{	
	public static int frequency(int n,int m)
	{
		int temp=n;
		int rCount =0;
		int lCount=0;
		for(int i=1; i<=n ;i++)
		{
			int rem=i%10;
			if(rem ==m)
			{
				rCount++;
			}

		}
		for(int j=1; j<=temp ;j++)
		{
			int leftDigit =j/10;
			if(leftDigit ==m)
			{
				lCount++;
			}
		}
		return rCount + lCount;
	}
	 public static void main(String[] args) 
	 {
	 	System.out.println(frequency(30,4));
	 }
}