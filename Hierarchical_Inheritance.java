class Account
{
	long account_no= 567834785678l;
	String Customer_name="Prema L";
	double balance;
	public double deposite(double amount)
	{
		balance=balance+amount;
		return balance;
	}
	public double withdraw(double amount)
	{
		balance=balance-amount;
		return balance;
	}
}
class Saving extends Account


{

}
class current extends Account
{

}
class Hierarchical_Inheritance{
	public static void main(String[] args) 
	{
		
	}
}
