interface A
{
	public void test();

} 
class B implements A
{	
	@Override
	public void test()
	{
		System.out.println("Hiiiiii");
	}
}
class MainInterface_Synthactical_program
{
public static void main(String[] args) 
	{
		B b1= new B();
		b1.test();
	}
}


