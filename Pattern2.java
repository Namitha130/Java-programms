class Pattern2{
public static void display(int num)
{
	for (int i = 1; i <= num; i++) 
	{	
		for (int j = 1; j <= num; j++) 
		{   

			if(i == j)
			{
				System.out.print(i + " ");
			}
			else
			{
				System.out.print(" ");
			}
			
			
			
		}
	System.out.println(" ");
	}
}
	
public static void main(String[] args) 
	{
		display(5);
	}
}