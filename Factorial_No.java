class Factorial_No{
	public static void test(int n)
	{
		int factorial = 1;
		for(int i= 1 ; i <=n ;i++)
		{
			factorial = factorial * i;
			
		}
		System.out.println(factorial);


	}
	public static void main(String[] args) {
		test(5);
	}
}