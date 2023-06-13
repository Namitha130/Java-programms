class Last2_digits_even
{	
	public static boolean last2_even_not(int num)
	{
		int last_two = num%100;
		int last_num=0;
		while( last_two > 0)
		{
			int rem = last_two%10;
			if(rem == 0)
			{
				last_two = last_two/10;
			}
			else if(rem %2 ==0)
			{   
				last_num++;
				last_two=last_two/10;
			}
			else{
				last_two=last_two/10;
			}

		}
		if(last_num %2==0)
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
		System.out.println( last2_even_not(124627));
	}
	 
	
}