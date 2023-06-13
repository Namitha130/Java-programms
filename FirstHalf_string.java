class FirstHalf_string {
	public static String firstHalf(String str)
	{
  int a1= str.length()/2;
  return str.substring(0,a1);
	}
public static void main(String[] args)
 	{
	System.out.println(firstHalf("WooHoo"));
	System.out.println(firstHalf("HelloThere") );
	System.out.println(firstHalf("abcdef"));
	}
}