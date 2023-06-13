class Student
{
	String name;
	long contact_no;
	int register_no;

	//construtor
	Student(String name,long contact_no,int register_no)
	{	
		this.name =name;
		this.contact_no=contact_no;
		this.register_no=register_no;
	}

	Student(long contact_no)
	{
		this.contact_no=contact_no;
	}

	public void student_details()
	{
		System.out.println(this.name + " " + this.contact_no+ " " +this.register_no);
	}
	public void rename()
	{
		System.out.println("contact number has been reset");
		System.out.println(this.contact_no);

	}
}
class Practice
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("namithatp" , 1234567898l,2345);
		s1.student_details();
		Student s2=  new Student(8123578130l);
		s2.rename();

	}                                                                                                                                           


	
}

