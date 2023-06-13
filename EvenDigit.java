class EvenDigit
{	 
	public static boolean EvenDigit_num(int num)
	{
	int evenCount=0;
	int oddCount =0;	
	while(num > 0)
	{
		int rem = num%10;
	
		 if(rem == 0)
		{
			num = num/10;
		}
		else if(rem%2 ==0)
		{	
			evenCount++;
			// System.out.print(rem);
			num = num/10;

		}
		else
		{	
			oddCount++;
			num = num/10;
		}
		
	}
	// System.out.println("Count of even digits: "+evenCount);
	// System.out.println("Count of odd digits: "+oddCount);

	if(evenCount==oddCount)
	{
		return true;
	}
	else 
	{
		return false;
	}

	}
	public static void main(String[] args) {
		System.out.println(EvenDigit_num(12345)); 
		System.out.println(EvenDigit_num(123456)); // false
}
}