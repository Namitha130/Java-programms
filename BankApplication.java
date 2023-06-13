class Account{
	static String name ="Namitha T P";
	static long contactNumber =8123578130l;
	static double salary =50000.00;
	static char gender='f';


	public static void showCustomer_details()
	{
		System.out.println(name);
		System.out.println(contactNumber);
		System.out.println(gender);
	} 

	public  void showdetails()
	{
		System.out.println(name);
		System.out.println(contactNumber);
		System.out.println(gender);
		System.out.println(salary);
	}
}

class BankApplication{
	public static void main(String[] args)
	 {
	 	// System.out.println("---For static method--" );
	 	// Account.showCustomer_details();

	 	System.out.println("---For Non- static method--" );
		Account s1=new Account();  // 1 method to call class for non-static here creating an object with reference value : we can use reference value to call many user funtion
		s1.showdetails();  // s1= reference value  & showdetails== user method & ()==constructor call
	 	//new Account().showdetails(); // 2 method to call by creating object without reference value


	 }
}