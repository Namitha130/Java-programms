class Order
{
	public void order_list()
	{
		String item="Burger";
		int price = 250;
		System.out.println("Item list: "+ item + "   " +"Total: "+price );
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
class Hierarchical_inhr_example
{
	public static void main(String[] args) 
	{
		Order s1=new Order();
		s1.order_list();
		System.out.println("---------------");
		Takeaway s2=new Takeaway();
		s2.order_list();
		s2.Takeaway_details();
		System.out.println("------------");
		Delivery s3 = new Delivery();
		s3.order_list();  
		s3.Delivery_details();
	}
}