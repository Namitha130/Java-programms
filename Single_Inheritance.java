class Demo
{
	public void showdetails()
	{
		String str= "NAMITHA";
		int roll_no = 123;
		System.out.println(" Student name is "+str + "& roll_no is "+ roll_no);

	}
}
class Test extends Demo
{
	public void showdetails_address()
	{
		System.out.println("Student details: ");
		String address ="Basavanagudi ,Bangalore";
		System.out.println(" student details include with : " + address);
	}
	
}


class Single_Inheritance
{
	public static void main(String[] args) {
		Test s1 = new Test();
	s1.showdetails();
	s1.showdetails_address();
	}
}