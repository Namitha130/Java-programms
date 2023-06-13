class ReverseString
{
	public static void main(String[] args)
	{
		String s1="Hello";
		String s2="";
		for(int i = s1.length()-1; i >=0;i--)
		{
			s2=s2+s1.charAt(i);
			//System.out.print(s1.charAt(i));
		}
		for(int i=0;i <s2.length();i++)
		{
			System.out.print(s2.charAt(i));
		}

	}
}