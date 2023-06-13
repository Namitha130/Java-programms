class Cigar_party{
	public static boolean cigarParty(int cigars, boolean isWeekend) 
	{
  if(cigars >=40 && cigars <=60 && isWeekend ==false)
  	{
    return true;
    }
    else if(cigars >=40 && isWeekend== true){
      return true;
    }
    else{
      return false;
    }
}
public static void main(String[] args)
	{
System.out.println(cigarParty(30,false));
System.out.println(cigarParty(70,true));
System.out.println(cigarParty(50,false));
	}	
}
	

