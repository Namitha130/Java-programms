class Love6{
public  static boolean love6(int a, int b)
	{
	  if(a==6|| b==6 || (a+b)==6 || (a-b) == 6|| (b-a) == 6)
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
	System.out.println(love6(6,4));
	System.out.println(love6(4,5));
	System.out.println(love6(1,5));
	}
}
