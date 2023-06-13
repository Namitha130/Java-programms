class space{
	public static void main(String[] args) {
		String s1 ="Java is easy";
		int count = s1.length();
		for(int i= 0 ; i < s1.length() ; i++)
		{
			if(s1.charAt(i) == ' '){
				count--;
			}
			else{
				System.out.print(s1.charAt(i));
			}
		}
		System.out.println();
		System.out.println(count);
	}
}