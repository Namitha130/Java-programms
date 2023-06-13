class Sample
{
	Sample(int a) // 10
	{
		System.out.println("The value of a: " + a);
	}
	Sample(int a , double b) // 10,40.5
	{
		System.out.println("The value of a & b: "+ a + " " + b);
	}
}
class Demo extends Sample
{
	Demo(int a)
	{
		super(10);
		System.out.println("The value of a is: " + a);
	}
	Demo(String str)
	{
		super(10,40.5);
		System.out.println("This not a zero argument constructor : " + str );
		
	}
}
class Main_Super_Statement
{
	public static void main(String[] args) 
	{
		Demo s1= new Demo(20);
		Demo s2= new Demo("Namitha");	
	}
}