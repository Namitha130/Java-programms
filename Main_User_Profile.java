// class User_Profile{
// 	static String app_name="Hungry_Kya";
// 	static String address="Bangalore";
// 	String user_name;
// 	long contact_no;
// 	String pwd;
	
// 	User_Profile(String user_name)
// 	{
// 		System.out.println("User created profile in "+ app_name +" " +address+ " "+"with name:"+ user_name);
// 	}

// 	User_Profile(String user_name,long contact_no)
// 	{
// 		System.out.println("User created profile in "+ app_name +" " +address+ " "+"with name and contact.no:"+ user_name +" "+ contact_no);
// 	}
// 	User_Profile(String user_name,long contact_no,String pwd)
// 	{
// 		System.out.println("User created profile in "+ app_name +" " +address+ " "+"with name and contact.no and password:"+ user_name +" "+ contact_no+ " "+ pwd);
// 	}

	
    
// 	//static String id="veg";
// 	if(id=="veg")
// 	{
// 		User_Profile(int a,String veg1,int b,String veg2,int c,String veg3)
//     	{
//     		System.out.println(a +" "+veg1 +" "+ b +" "+veg2+" "+ c +" "+veg3 );
//     	}
// 	}
// 	else if(id=="non_veg")
// 	{
// 		User_Profile(int d,String nonV1,int e,String nonV2,int f,String nonV3 ,int g,String nonV4)                                                                                                                                                                                 
//     	{
//     		System.out.println(d +" "+nonV1 +" "+ e +" "+nonV3+" "+ f +" "+nonV3+ " "+ g +" "+nonV4);
//     	}
// 	}
// 	else
// 	{
// 	 	User_Profile(int x,String fastfood1,int y,String fastfood2)
//     	{
//     		System.out.println(x +" "+ fastfood1 +" "+ y +" "+ fastfood2);
//     	}
// 	}
// }
// class Main_User_Profile{
// 	public static void main(String[] args) 
// 	{
// 	    User_Profile u1 = new User_Profile("namitha");
// 	    User_Profile u2 = new User_Profile("namitha",812345678l);
// 	     User_Profile u3 = new User_Profile("namitha",812345678l,"Enfield@345");
	     
	     
// 	       User_Profile u4 = new User_Profile(1 , "Dosa", 2,"idli",3,"pulav");
// 	       User_Profile u5 = new User_Profile(1 , "Chicken Biriyani", 2,"Fish Biriyani",3,"Prawns Biriyani",4,"Mutton Biriyani");
// 	       User_Profile u6 = new User_Profile(1,"pizza" ,2, "burger");
// 	}
// }

class User_Profile
{
	static String app_name="Hungry_Kya";
	static String address="Bangalore";
	String user_name;
	long contact_no;
	String pwd;
	
	User_Profile(String user_name)
	{
		System.out.println("User created profile in "+ app_name +" " +address+ " "+"with name:"+ user_name);
	}

	User_Profile(String user_name,long contact_no)
	{
		System.out.println("User created profile in "+ app_name +" " +address+ " "+"with name and contact.no:"+ user_name +" "+ contact_no);
	}
	User_Profile(String user_name,long contact_no,String pwd)
	{
		System.out.println("User created profile in "+ app_name +" " +address+ " "+"with name and contact.no and password:"+ user_name +" "+ contact_no+ " "+ pwd);
	}

	public void veg(String veg1,String veg2,String veg3){
		{
			System.out.println(veg1 +" "+veg2+" "+veg3 );
			
		}
	}
	public void nonVeg(String nonV1,String nonV2,String nonV3,String nonV4){
		{
			System.out.println(nonV1 +" "+nonV2+" "+nonV3+" "+nonV4 );
			
		}
	}
	public void mixed(String mix1,String mix2){
		{
			System.out.println(mix1+" "+mix2);
			
		}
	}

}
class Main_User_Profile{
	public static void main(String[] args){
		User_Profile u1 = new User_Profile("namitha");
		User_Profile u2 = new User_Profile("namitha",812345678l);
		User_Profile u3 = new User_Profile("namitha",812345678l,"Enfield@345");

		 String id = "veg";
		// String id = "non_veg";
		// String id = "mixed";
		if (id == "veg")
		{
			u1.veg("Dosa","idli","pulav");
		}
		else if (id == "non_veg")
		{
			u1.nonVeg("Chicken Biriyani","Fish Biriyani","Prawns Biriyani","Mutton Biriyani");
		}
		
		else if (id == "mixed")
		{
			u1.mixed("pizza","burger");
		}
		else System.out.println("Not a valid choice");
	}
}