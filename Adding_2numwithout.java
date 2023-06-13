class Adding_2numwithout
{
	public static int addingnums(int num1, int num2)
	{
		int sum =num1;
		for(int i=1;i<=num2;i++)
		{
			sum++;
		}
		return sum;
	}
 public static void main(String[] args) 
 {
 	System.out.println(addingnums(50,4));
 }
}