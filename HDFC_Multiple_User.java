class User{
	static String bank_name="Canara Bank";
	static String bank_address ="Chitradurga";
	 		String bank_holder_name;
	 		long account_no ;
	 		double balance;

	User(String bank_holder_name,long account_no ,double balance)
	{
		this.bank_holder_name= bank_holder_name;
		this.account_no=account_no;
		this.balance = balance;
	}

	public void show_account_details()
	{
		System.out.println("Account details:");
		System.out.println(bank_name+ "  "+ bank_address+ "  "+this.bank_holder_name+"  "+ this.account_no+"  "+ this.balance);
	}



}

class HDFC_Multiple_User{
	public static void main(String[] args) {
		User u1= new User("namitha",8123578912l,56000.89);
		u1.show_account_details();

	}
}