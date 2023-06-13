class KNOWLEDGE
{
	public static void main(String[] args) 
	{
		String s1= "KNOWLEDGE";
		String s2= "";
		String s3 ="";
		s3=  s1.substring(4,s1.length());
		s2 = s1.substring(0,4);
		for(int i = s2.length()-1 ; i >= 0 ; i--)
		{
			s3=s3+s2.charAt(i);
		}
		for(int i=0; i <s3.length(); i++)
		{
		System.out.print(s3.charAt(i));
		}
	}
}