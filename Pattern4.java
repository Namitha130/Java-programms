class Pattern4{
	public static void display(int num)
	{
 		for(int i=1; i<=num ; i++)
 		{
 			for(int s=2; s>=i ; s--)
 			{
 				System.out.print(" ");
 			}
 			for(int j=1 ; j<=i ; j++)
 			{
 				System.out.print(1);

 			}
 		System.out.println(" ");
 		}
 		
	}
	public static void main(String[] args)
	{
		display(3);
	}
}