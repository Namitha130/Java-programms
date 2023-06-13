class Sample
{
	public void display()
	{
		System.out.println("I'm a super class");
	}
}
 class Class extends Sample
 {
 	@Override
 	public void display()
 	{
 		super.display();
 		System.out.println("I'm a subclass for sample super class");
 	}
 }
class Demo extends Class
{
	@Override
	public void display()
	{
		super.display();
		System.out.println("I'm a subclass of Class class");
	}
}
class Demo1 extends Demo
{	
	@Override
	public void display()
	{
		super.display();
		System.out.println("I'm a subclass of Demo class");
	}
}
class Demo2 extends Demo1
{
	@Override
	public void display()
	{
		super.display();
		System.out.println("I'm a subclass of Demo1 class");
	}
}
class Test_MethodRiding_hybrid
{
	public static void main(String[] args)
	{
		Demo2 s1= new Demo2();
		s1.display();
	}
}