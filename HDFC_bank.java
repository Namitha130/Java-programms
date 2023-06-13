class User{
	String bank_name;
	String account_holder;
	long account_no;
	double balance;

	User(String bank_name,String account_holder,long account_no,double balance)
	{
		this.bank_name=bank_name;
		this.account_holder=account_holder;
		this.account_no=account_no;
		this.balance=balance;
		}
	public void show_account_details()
	{
		System.out.println("Account Details :");
		System.out.println(this.bank_name +"  "+ this.account_holder +"  "+ this.account_no +"  " +this.balance);
	}	

}
class Multiple_bank
{
	public static void main(String[] args) 
	{
		User n1= new User("HDFC_Bank" ,"Namitha" , 6567894325l , 37600.50);
		n1.show_account_details();

		User s1= new User("Canara_Bank" ,"Sushma" , 6567894325l , 45600.50);
		s1.show_account_details();

		User k1= new User("ICICA_Bank" ,"Kavya" , 6567894325l , 76600.50);
		k1.show_account_details();
	}

}
	