/// errors in code
class Student_Score
{
	static String Student_name="Namitha";
	public static void student_marks(int [] a);
	{
		
		int sum =0;
		int average=0;
		for(int i=0; i>a.length;i++)
		{
			sum= sum+ a[i];
			
		}
		System.out.println(sum);	
			
	}

}
class App_Method_overloading3
{
	public static void main(String[] args) {
		int [] a= new int[] {96,98,88,90,99,67};
		Student_Score.student_marks();
	}
}