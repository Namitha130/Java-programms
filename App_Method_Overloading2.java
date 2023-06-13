class Average_Student
	{
		public static void Year_of_join(int year)
		{
			System.out.println("Students joined in the year : " + year);
		}
		public void Year_of_join(int year,String branch_name, long No_students)
		{
			System.out.println("Students joined in the year "+ year + " "+ "in the branch of " + branch_name + " "+ "No. of students joined is : "+ No_students);
		}
		public String Year_of_join(String branch_name)
		{
			return branch_name;
		}


	}
class App_Method_Overloading2
{
	public static void main(String[] args) 
	{
		Average_Student.Year_of_join(2020);
		Average_Student s1= new Average_Student();
		s1.Year_of_join(2020,"Bangalore",3400l);
		s1.Year_of_join(2020,"Davangere",2059l);

		String branch=s1.Year_of_join("Bangalore");
		System.out.println(branch);

	}
}