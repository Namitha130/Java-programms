class Sample
{  	
	final int v1=5;
	String str="Single Inheritance";
	public void test()
	{
 		for (int i=1; i <=v1 ; i++)
 		{
 			System.out.println(i);
 			
 		}
	}
	public void count()
	{	
		for (int i=v1; i >= 1 ; i--)
 		{
 			System.out.println(i);
 			
 		}
	}
}
class Demo extends Sample
{
	double z1=5;
	public void display()
	{
 		System.out.println("the value of z1 is: " + z1);
	}
	//System.out.println(z1);
}
class Main_Inheritance
{
	public static void main(String[] args)
	{
		
		Demo s2 = new Demo();
		s2.test();
		System.out.println("------------");
		s2.count();
		System.out.println("-----------");
		s2.display();
		System.out.println(s2.str);
	}
}