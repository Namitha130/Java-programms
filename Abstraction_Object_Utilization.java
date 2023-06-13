interface User
{
	public void login();
	public void logout();
}
class Customer implements User
{
	@Override
		public void login()
		{
			System.out.println("Customer login successfully");
		}
	@Override
		public void logout()
		{
			System.out.println("Customer logout successfully");
		}
}
class Admin implements User
{
	@Override
		public void login()
		{
			System.out.println("Admin login successfully");
		}
	@Override
		public void logout()
		{
			System.out.println("Admin logout successfully");
		}
}
class Object_creation_layer
{
	User u1;
	public User createpwd(int pwd)// method
	{
		if(pwd == 1233)
		{
			u1=new Customer();
			return u1;
		}
		else
		{
			u1= new Admin();
			return u1;
		}
	}
}
class Abstraction_Object_Utilization
{
	public static void main(String[] args) 
	{
		Object_creation_layer obj1= new Object_creation_layer();
		User u2= obj1.createpwd(123);// method in object_creation_layer
		u2.login();
		u2.logout();

		
	}
}