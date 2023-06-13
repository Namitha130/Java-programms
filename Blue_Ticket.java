class Blue_Ticket{
	public static int blueTicket(int a, int b, int c) {
  int ab,bc,ca;
   ab = a + b;
   bc = b + c;
   ca = c + a;
	  if(ab == 10 || bc == 10 || ca ==10)
		  {
		    return 10;
		  }
	  else if (ab == 10 + bc || ab == 10 + ca)
		  {
		    return 5;
		  }
	  else
		  {
		    return 0;
		  }
}
public static void main(String[] args)
 	{
		System.out.println(blueTicket(9, 1, 0)); // 10
		System.out.println(blueTicket(9, 2, 0)); //0
		System.out.println(blueTicket(6, 1, 4)); //10
 	}
}