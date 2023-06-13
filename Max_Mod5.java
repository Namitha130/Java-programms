class Max_Mod5{
	public static int maxMod5(int a, int b) {
  if(a % 5 == b % 5)
  {
    if(a < b)
    {
      return a;
    }
    else if(a > b){
      return b;
    }
    else{
      return 0;
    }
  }
  else if(a != b)
  { 
    if(a > b){
      return a;
    }
    else{
      return b;
    }
  }
  else return 0 ;
  
}

	public static void main(String[] args) 
	{
		System.out.println(maxMod5(2, 3));
		System.out.println(maxMod5(6, 2));
		System.out.println(maxMod5(3, 2));
	}
}