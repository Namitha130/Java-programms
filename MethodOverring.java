class Sample
{
	public void display()
	{
		System.out.println("Im display 1");
	}
}
class Demo extends Sample
{	
	@Override
	public void display()
	{	
		super.display();
		System.out.println("Im display 2");
	}
}
class MethodOverring
{
	public static void main(String[] args) 
	{
		Demo d1= new Demo();
		d1.display();
	}
}