// class Demo{

	 
// }

class Oops_concepts{
	static int a1; // global 
	
	public static void test(int c1) // c1-local
	 {
	 	int b1=10; // local
	 	System.out.println("hii");
	 	System.out.println("b1 :"+b1); // local variable initialized 10 in method
	 	System.out.println("a1 :"+ a1);  // we can call global in local method
	 	System.out.println("c1 :"+c1); // local var
	 }
	public static void main(String[] args) 
	{
		test(30);
		// System.out.println(b1);// cant print local var in global
		System.out.println(a1);
	}
}
	
