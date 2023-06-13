class Account{
	String name;
	long contact_no;
	String email_id;
	String dob;
	double balance;

	public void showAccountDetails(String name,long contact_no,String email_id,String dob)
	{
		this.name = name;
		this.contact_no = contact_no;
		this.email_id = email_id;
		this.dob = dob;
		System.out.println("Account details are : " + this.name + " " + this.contact_no + " " + this.email_id + " " + this.dob + " ");
	}

		public double deposite(double amount)
		{
			this.balance = balance + amount;
			return this.balance;
		}
		public double withdraw(double amount)
		{
			this.balance = balance - amount;
			return this.balance;
		}
	public void check_balance()
	{
		System.out.println("Balance is : "+ this.balance);
	}

}
class MainBank1{
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.showAccountDetails("Namitha",8123578130l,"itsnamitha130@gmail.com","12-01-1999");
		a1.check_balance();
		a1.deposite(1000);

		System.out.println("After deposite ");

		a1.check_balance();
		a1.withdraw(300);

		System.out.println("After withdraw ");
		
		a1.check_balance();
		System.out.println();		
	}
}