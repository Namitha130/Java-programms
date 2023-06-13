class Products_of_digits
{ 
	public static int productOfNum(int num)
	{
		int product= 1;
		while(num > 1)
		{
			int rem= num%10; //3
			 product= product*rem;
			  num= num/10;
		}
		return product;
	}
	public static void main(String[] args) 
	{
		System.out.println(productOfNum(1234));
	}
}
