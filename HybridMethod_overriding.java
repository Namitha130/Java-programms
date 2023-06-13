class Coursera
{	
	public void information()
	{	
		System.out.println("----Coursera  ----");
		String coursera_id="AS345GHJ";
		long   Contact_us = 8765-8764322l;

		System.out.println(" Coursera ID : " + coursera_id);
		System.out.println("Contact us for any query: " +Contact_us);

	}
}
class Student_account extends Coursera
{	
	 String Student_name;
	 String password;
	long contactNumber ;

	Student_account(String Student_name,String password,long contactNumber)
	{	
		
		this.Student_name = Student_name;
		this.password = password;
		this.contactNumber=contactNumber;
	}
	@Override
	public void information()
	{	
		super.information();
		System.out.println("--User successfully created an account in coursra--");
		System.out.println(Student_name +" "+ password +" "+contactNumber);
	}
}
class Course1 extends Student_account
 {	
 	Course1(String Student_name,String password,long contactNumber)
 	{
 		super(Student_name,password,contactNumber);
 	}
	@Override
	public void information()
 	{
 		super.information();
 		String First_course = "Full-Stack Java Developer";
 		int Frist_duration = 9;
 		String First_course_id ="457GHK";
 		System.out.println("First course name: " +First_course);
 		System.out.println("Duration : "+Frist_duration);
 		System.out.println("course_id :"+First_course_id);
 	}
 }
class Course2 extends Student_account
{   
	Course2(String Student_name,String password,long contactNumber)
 	{
 		super(Student_name,password,contactNumber);
 	}
	
	@Override
	public void information()
	{	
		super.information();
 	 	String Second_course = "web technology and UI Developer";
 		int Second_duration = 9;
 		String Second_course_id ="457GHK";	
 		System.out.println("Secound course name :"+Second_course);
 		System.out.println("Duration : "+Second_duration);
 		System.out.println("course_id : "+Second_course_id);
	}
}
class Course3 extends Student_account
{	
	Course3(String Student_name,String password,long contactNumber)
 	{
 		super(Student_name,password,contactNumber);
 	}
	
	@Override

	public void information()
	{	
		super.information();
		String Third_course = "Art-writing ";
 		int Third_duration = 4;
 		String Third_course_id ="45678765AWK";
 		System.out.println("Third course name: "+Third_course);
 		System.out.println("Duration : " +Third_duration );


 		System.out.println("Course id: "+Third_course_id);
	}
}
class HybridMethod_overriding
{
	public static void main(String[] args) {
		// Student_account s1= new Student_account("Namitha T P","asdfg45", 5678987654l);
		//  s1.information();
	Course1 c1=new Course1("Namitha T P","asdfg45", 5678987654l);
	c1.information();
	// Course2 c2=new Course2();
	// c2.information();
	 Course3 c3=new Course3("pooja","eryio97",5689774376474l);
	 c3.information();
	System.out.println("-------------------------------------------");
	Course2 c2= new Course2("Sudipta","ahgkhjlh",7278150899l);
	c2.information();
	}
}