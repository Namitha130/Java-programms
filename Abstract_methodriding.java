abstract class Sample
{
	final int v1=20;
	abstract public  void test(); //abstract method
	public static void display() // concreate method
	{
		System.out.println("im a display()");
	}
	public void test1()
	{
		System.out.println("hii");
	}
}
class Demo extends Sample
{
	@Override
	public  void test()
	{	
		//super.display();
		System.out.println("I'm a test()");
	}

	public static void display() // concreate method
	{
		System.out.println("im avbnm,nbvcfgh display()");
	}
	
}
class Abstract_methodriding
{
	public static void main(String[] args) 
	{ 
		Demo d1=new Demo();
		d1.test();
		d1.display();
		Sample.display();
		d1.test1();
		//Sample s1 = new Sample();
		System.out.println(d1.v1);
		//d1.v1=30; // we cannot reintialise the final values
		System.out.println(d1.v1);
		


	}
}