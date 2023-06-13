class Super_1
{
	Super_1()
	{
		System.out.println("Good morning!!!");
	}
}
class Sample extends Super_1
{
	Sample()
	{
		System.out.println("Good Sample");
	}
}
class Demo extends Sample
{
	Demo()
	{
		System.out.println("Good Demo");
	}
}
class Super_statement_class
{
	public static void main(String[] args) 
	{
			Demo s1= new Demo();
	}
}