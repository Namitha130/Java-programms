class Order
{	
	int total=0;
	public int order_list()
	{
		// String item="Burger";
		// int price = 250;
		// System.out.println("Item list: "+ item + "   " +"Total: "+price );
		String dish1="Pizza";
		int  price1 = 340;
		String dish2="Burger";
		int price2=260;
		String dish3="Sandwich";
		int price3=160;
		System.out.println("Item list: "+ dish1 + "   " +dish2 + "  "+ dish3);
		total=price1+price2+price3;
		return total;

	}
}

class Takeaway extends Order
{
	public void Takeaway_details()
	{
	  String Customer_name = "Pooja";
	  long Contact_no = 8123578130l;
	  String timings = "7:30pm";
	  String branch_name ="Basavanagudi,Bangalore";
	  System.out.println("Customer_name: " + Customer_name ) ;
	  System.out.println("Contact Number: " + Contact_no ) ;
	  System.out.println("Takeaway timings: " + timings ) ;
	  System.out.println("Takeaway adress: " + branch_name);
	 
	}

}
class Delivery extends Order
{
	public void Delivery_details()
	{
	  String name = "Pooja";
	  long mobile_no = 8123578130l;
	  String address = "#61 sai masana pg Bangalore";
	  int pincode =540004; 
	 
	  System.out.println("Customer_name: " + name ) ;
	  System.out.println("Contact Number: " + mobile_no ) ;

	  System.out.println("Delivery adress: " + address);
	  System.out.println("Pincode: " +pincode);
	}

}
class Dine_In extends Order
{
	public void DineIn_details()
	{
	  String visitor_name = "Pooja";
	  long contact_no = 8123578130l;
	  int number_of_people= 3;
	  String Dinein_branch = "Koramanga, Bangalore";
	  int Dinein_pincode =540904; 
	 
	  System.out.println("Visitor_name: " + visitor_name ) ;
	  System.out.println("Contact Number: " + contact_no ) ;
	  System.out.println("Number of people: " + number_of_people);
	  System.out.println("Dinein_branch : " + Dinein_branch);
	  System.out.println("Pincode: " +Dinein_pincode);
	}

}

class Hybrid_inheritance
{
	public static void main(String[] args) 
	{	
		System.out.println("------ORDER DETAILS ");
		Order s1=new Order();
		s1.order_list();
		int total_bill = s1.order_list();
		System.out.println("Total: " + total_bill);

		
		
		System.out.println("-------TAKE-AWAY DETAILS--------");

		Takeaway s2=new Takeaway();
		s2.order_list();
		s2.Takeaway_details();
		System.out.println("---------DELIVERY DETAILS------");

		Delivery s3 = new Delivery();
		s3.order_list();  
		s3.Delivery_details();
		System.out.println("----------DINE-IN DETAILS-------");
		Dine_In s4 = new Dine_In();
		s4.order_list();  
		s4.DineIn_details();
	}
}

