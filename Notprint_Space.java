class Notprint_Space{
	public static void main(String[] args) {
		String s1= "Java is easy";
		int count= 0;

		for(int i= 0 ; i < s1.length() ; i++)
		{
			if(s1.charAt(i) != ' ')
			{
			 count++;
			//System.out.print(s1.charAt(i));	// to print s1 without space
			}
			
		}
		System.out.print(count);
	}
}