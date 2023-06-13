class Vowels{
	public static void main(String[] args) {
		String s1="package  string count";
		int count1 = 0; // vowels count
		int count2 = 0; // space count
		int count3= 0; // consonants count
		for(int i=0; i < s1.length(); i++)
		{
			if((s1.charAt(i) == 'a') || (s1.charAt(i) == 'e') || (s1.charAt(i) == 'i') || (s1.charAt(i) == 'o') ||( s1.charAt(i) == 'u'))
			{
				System.out.print(s1.charAt(i));
				count1++; 
			}
			else if( s1.charAt(i) == ' ')
			{

				count2++;
			}
			else{
				count3 = count3 +1;
			}
			//System.out.print(s1.charAt(i));
		}
	System.out.println(" ");
	System.out.println("length of a string:" +s1.length());
	System.out.println(" Vowels count : "+count1);
	System.out.println(" consonants count: " + count3);
	System.out.println(" space count :"+count2);
	}
}