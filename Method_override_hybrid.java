class Bank
{  
	long getRateOfInterest()
	{
		return 0;
		// 	String Bank_address ="Medehalli ,Chitradurga";
		// System.out.println( "Bank address : " + Bank_address);
	}  
}
class Account_holder extends Bank
{	
	@Override
	long getRateOfInterest()
	{	
		super.getRateOfInterest();
		// String Account_holder = "Namitha T P";
		// return Account_holder;
		long Mobile_number = 897654322345l;
		return Mobile_number;
		// String address = "#61,sai masana pg Bangalore";
		// return address;
	}
}  
//Creating child classes.  
class SBI extends Bank
{  
	@Override
	int getRateOfInterest()
	{	
		super.getRateOfInterest();
		return 8;
	}  
}  
  
class ICICI extends Bank
{  
	@Override
	int getRateOfInterest()
	{
		super.getRateOfInterest();
		return 7;
	}  
}  
class AXIS extends Bank
{  	
	@Override
	int getRateOfInterest()
	{	
		super.getRateOfInterest();
		return 9;
	}  
}  
//Test class to create objects and call the methods  
class Method_override_hybrid
{  
public static void main(String args[])
	{  
		Account_holder h=new Account_holder();
	SBI s=new SBI();  
	ICICI i=new ICICI();  
	AXIS a=new AXIS();  
	System.out.println("Account_holder details : " + h.getRateOfInterest());
	System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
	System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
	System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
	}  
}  