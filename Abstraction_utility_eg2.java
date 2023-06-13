interface Udemy
{	
	public static void User_details()
	{
		String User_name="Namitha T P";
		long Contact_no = 7847827813l;
		String locality ="India";

		System.out.println("User name : " +User_name);
		System.out.println("Contact_no is : "+ Contact_no);
		System.out.println("locality of user : " + locality);

	}
	public void Physics();
	public void Chemistry();
	public void Biology();
	public void Mathematics();
	public void Computer_science();
}
class PCMB implements Udemy
{
	@Override
	public void Physics()
	{
		System.out.println("Set your goals in learning Physics");
	}
	@Override
	public void Chemistry()
	{
		System.out.println("Set your goals in learning Chemistry");
	}
	@Override
	public void Mathematics()
	{
		System.out.println("Set your goals in learning Mathematics");
	}
	@Override
	public void Biology()
	{
		System.out.println("Set your goals in learning Biology");
	}
	@Override
	public void Computer_science()
	{
		System.out.println("Computer science is optional for PCMB students");
	}
}
class PCMC implements Udemy
{
	@Override
	public void Physics()
	{
		System.out.println("Set your goals in learning Physics");
	}
	@Override
	public void Chemistry()
	{
		System.out.println("Set your goals in learning Chemistry");
	}
	@Override
	public void Mathematics()
	{
		System.out.println("Set your goals in learning Mathematics");
	}
	@Override
	public void Computer_science()
	{
		System.out.println("Set your goals in learning Computer_science");
	}
	@Override
	public void Biology()
	{
		System.out.println("Biology is optional for PCMC students");
	}
}
class Object_creation_layer
{
	Udemy u1;
	public Udemy Course_code(String code)// method
	{
		if(code == "PCMB123")
		{
			u1=new PCMB();
			return u1;
		}
		else
		{
			u1= new PCMC();
			return u1;
		}
	}
}
class Abstraction_utility_eg2
{
	public static void main(String[] args) 
	{	
		Udemy.User_details();
		Object_creation_layer obj1 = new Object_creation_layer();
		Udemy u2= obj1.Course_code("PCMC234");
		u2.Physics();
		u2.Chemistry();
		u2.Mathematics();
		u2.Computer_science();
		u2.Biology();
	}
}