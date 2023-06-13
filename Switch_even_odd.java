class Switch_even_odd{

public static void main(String[] args) {
	int a=10;
	int b=12;
	int choice=0;
	if(a>b)
		{
			choice= 1;
		}
		else if(a<b)
		{
			choice= 2;
		}
		else
		{
			choice= 3;
		}
	switch(choice)
	{
	case 1:System.out.println(a+" greater "+b);
		break;
	case 2: System.out.println(a+" lesser "+b);
		break;
	default:System.out.println(a+" equal "+b);
	}
}
}