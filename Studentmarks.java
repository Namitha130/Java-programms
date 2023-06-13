class Studentmarks
{
	public static void eligibility( int[] marks)
	{
		for( int i = 0 ; i <= marks.length -1; i++)
		{
			if(( marks[i] >= 50) && (marks[i]<= 100) )
			{
				System.out.println(marks[i] + " Student is eligible to attend interview");
			}
			else if(( marks[i] >= 10) && (marks[i] < 50) )
			{
				System.out.println(marks[i] +" Student is not eligible to take interview and student need to take mock test");

			}
			else{
				System.out.println(marks[i] + " student is not eligible for interview need to take class from start");
			}
		}
	}

	public static void main(String[] args) 
	{
		int[] input={20, 8, 40, 56, 78, 90, 100, 47,9};
		eligibility(input); 
	}
}