class Near_ten{
	public static boolean nearTen(int num)
	{
		if(num %10==0 || num %10==1 || num% 10==2 || num % 10 ==9 || num% 10 ==8) 
		  {
		    return true;
		  }  
		else
			{
			  return false;
			}
	}
	public static void main(String[] args) {
		System.out.println(nearTen(12)); // t
		System.out.println(nearTen(17)); //f
		System.out.println(nearTen(19)); //t2qw5
	}
}