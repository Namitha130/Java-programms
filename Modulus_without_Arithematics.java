class Modulus_without_Arithematics
{	
	public static void EvenOdd(int num) 
	{
		// if((num>>1) << 1 == num)
		// {
		// 	System.out.println("num is even");
		// }
		// else 
		// 	{
		// 		System.out.println("num is odd");
		// 	}

		if((num/2)*2 == num)
		{
			System.out.println("num is even");
		}
		else
		{
			System.out.println("num is odd");
		}
	}
	public static void main(String[] args) 
	{
		EvenOdd(8);
		EvenOdd(5);
		
	}
}