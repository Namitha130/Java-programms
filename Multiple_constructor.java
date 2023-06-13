class Demo{

Demo()
{
	System.out.println("hii");
}
Demo(int a)
{
	System.out.println( a);
}
Demo(String name, double b)
{
	System.out.println(name + "  "+b);
}

}
class Multiple_constructor{
	public static void main(String[] args) {
		Demo s1= new Demo();
		Demo s2= new Demo(10);
		Demo s3= new Demo("nammi",5.7);
		// Demo s3= new Demo(5.7,"nammi");// error need to pass in same order

	}
}