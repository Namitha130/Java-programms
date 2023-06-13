class Ends_Ly{
	public static boolean endsLy(String str) {
	  String s1= "ly";
	  int n =str.length();
	  if(n >=2)
		{
			if(str.substring(n-2,n).equals(s1))
			{
			   return true;
			}
			else
			{
			   return false;
			}
		}
		else{
			return false;
		}
	}
	 
	public static void main(String[] args) 
	{
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
	}
}