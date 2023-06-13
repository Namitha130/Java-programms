abstract class Admin
{
	abstract public void login();
	public void logout()
	{
		System.out.println("Admin logout successfully");
	}
}
class User1 extends Admin
{	
	@Override
	public void login()
	{
		System.out.println("User1 login successfully!!!");
	}
	@Override
	public void logout()
	{
		System.out.println("User1 logout successfully!!!");
	}
}
class User2 extends Admin
{	
	@Override
	public void login()
	{
		System.out.println("User2 login successfully!!!");
	}
	@Override
	public void logout()
	{
		System.out.println("User2 logout successfully");
	}
}
class AppOfAbstractReal_time
{
	public static void main(String[] args) 
	{
		User1 u1 = new User1();
		u1.login();
		u1.logout();
		User2 u2 = new User2();
		u2.login();
		u2.logout();

	}
}