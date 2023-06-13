class fizzString2
{	
	public static String fizzString2(int n)
	{
  	    // boolean Fizz = n%3== 0;
  	    // boolean Buzz = n%5== 0;
		//   if(Fizz&& Buzz)
		//   {
		//     return "Fizz!";
		//   }
		//   else if(Buzz )
		//   {
		//     return "Buzz!";
		//   }
		//     else if(Fizz)
		//   {
		//     return "Fizz!";
		//   }
		//   else {
		//     return n +"!";
		//   }
	 
 if(n%3 == 0 && n%5 == 0 )
  {
    return "FizzBuzz!";
  }
  else if(n%5 == 0)
  {
    return "Buzz!";
  }
    else if( n%3 == 0)
  {
    return "Fizz!";
  }
  else {
    return n +"!";
  }

		  
	}
	public static void main(String[] args) 
	{
		//System.out.println(fizzString2(int 15));
		System.out.println(fizzString2(3));
	}
}

