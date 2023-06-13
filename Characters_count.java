class Characters_count{
	public static void main(String[] args) {
		String s1 = "KNOWLEDGE";
		int count =0;
		//System.out.println(s1.length());
		for(int i= 0 ; i < s1.length(); i++){
			System.out.print(s1.charAt(i));
			count++; //count= count +1; or count+=1; ()
		}
		System.out.println();
		System.out.println(count);
	}
}