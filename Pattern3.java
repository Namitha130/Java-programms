class Pattern3{
	public static void display(int num)
{
	for (int i = 1; i <= num; i++) 
	{	
		for(int s=num-1 ; s>=i; s--)
		{
			System.out.print("  ");
		}
			for (int j = 1; j <= num;j++) 
			{   
				System.out.print(i);
				break;
			}
	System.out.println(" ");
	}
}
	
public static void main(String[] args) 
	{
		display(5);
	}
}