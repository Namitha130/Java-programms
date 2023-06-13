class Two_Ofone
{
	public static boolean twoAsOne(int a, int b, int c) 
	{
	if( (a+b) == c || (b+c)==  a || (a+c)==b)
	{
	  return true;
	}
	else
	{
	  return false;
	}
  
}
public static void main(String[] args)
 	{
	System.out.println(twoAsOne(1, 2, 3));//t
	System.out.println(twoAsOne(3, 1, 2)); //t
	System.out.println(twoAsOne(3, 2, 2));//f
	}
}

