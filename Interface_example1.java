interface Run
{
	public void test();
}
interface Run1
{
	public void display();
}
class Sample implements Run,Run1
{
	@Override
	public void test()
	{
		System.out.println("Hello!!! Good morning");
	}
	@Override
	public void display()
	{
		System.out.println("ByeBye!!! Good Night");
	}
}
class Interface_example1
{
	public static void main(String[] args)
	{
		Sample s1= new Sample();
		s1.test();
		s1.display();
	}
}