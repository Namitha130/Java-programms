class Tea_party{
	public static int teaParty(int tea, int candy) 
	{
	  if( tea < 5 || candy < 5)
		  {
		    return 0;
		  }
	  else if( tea >=(candy*2) || candy >=(tea*2) )
		  {
		    return 2;
		  }
	  else
	    {
	      return 1;
	    }
}
public static void main(String[] args) {
	System.out.println(teaParty(6,8));
	System.out.println(teaParty(3,8));
	System.out.println(teaParty(20,6));

}
}