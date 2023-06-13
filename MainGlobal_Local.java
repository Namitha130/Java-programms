class MainGlobal_Local{
static int a1; // a1 is naot initialised so default value it takes 0
	public static void display(int c1)
	{
		int b1=10;
		System.out.println("h1");
		System.out.println(b1); // local var o/p=10
		System.out.println(a1); // default a1=0 
		System.out.println(c1); //default c1=0

	}
	public static void main(String[] args) {
		display(30);
		//System.out.println(b1); // c1-local var == cant call in a main method
		System.out.println(a1);
		//System.out.println(c1); // c1-local var == cant call in a main method
	}
}