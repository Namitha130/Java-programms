./import java.util.Scanner;

class Foodie{
	String user_name;
	long mobile_no;
	String password;

	Foodie(String user_name){
		this.user_name = user_name;
		//this.mobile_no = mobile_no;
	}
	
	Foodie(String user_name,long mobile_no){
		this.user_name = user_name;
		this.mobile_no = mobile_no;
	}
	Foodie(String user_name,long mobile_no, String password){
		this.user_name = user_name;
		this.mobile_no = mobile_no;
		this.password = password;
	}
	
	public void showUserAccountDetails(){
		System.out.println("User create account and login successful !");
		System.out.println("User Account details are ");
		System.out.println("Username : "+this.user_name);
		System.out.println("Mobile Number : "+this.mobile_no);	
	}
	
	public String city(int choice_city){
		String city_name = " ";
		switch(choice_city){
			case 1 : city_name = "Bengaluru";
			break;
			case 2 : city_name = "Mysore";
			break;
			case 3 : city_name = "Chitradurga";
			break;
			case 4 : city_name = "Gadag";
			break;
		}
		return city_name;
	}
	public String food(int choice_food){
		
		String food_type = " ";
		switch(choice_food){
			case 1 : food_type = "Veg";
			break;
			case 2 : food_type = "Non Veg";
			break;
		}
		return food_type;
	}
	public String item(){
		String [] veg_items = new String [] {"North-Meals","South-Meals"};
		String [] non_veg_items = new String [] {"Chicken-Meals","Mutton-Meals"};
		if(food_type == "Veg"){
			
			String item = " ";
			switch(choice){
				case 1 : item = veg_items[0];
				break;
				case 2 : item = veg_items[1];
				break;
			} return item;
		}
		else {
			System.out.println("Select from below");
			System.out.println("1. Chicken-Meals");
			System.out.println("2. Mutton-Meals");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			String item = " ";
			switch(choice){
				case 1 : item = non_veg_items[0];
				break;
				case 2 : item = non_veg_items[1];
				break;
			}return item;
		}
	}
	public int orderValue(){
		if (item() == "North-Meals") return 120;
		else if (item() == "South-Meals") return 150;
		else if (item() == "Chicken-Meals") return 220;
		else return 280;
	}

}

public class FoodieBuddy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Zomato!, Let's create your account to enjoy delicious food");
		System.out.println("Enter your good name");
		String user_name = sc.nextLine();
		// System.out.println("Enter your password");
		// String password = sc.nextLine();
		// System.out.println("Enter your mobile number");
		// long mobile_no = sc.nextLong();
		

		// Foodie f1 = new Foodie(user_name,mobile_no,password);
		Foodie f1 = new Foodie(user_name);
		f1.showUserAccountDetails();
		
		System.out.println("Select from the below cities where do you stay to show delicious food for you");
		System.out.println("1. Bengaluru");
		System.out.println("2. Mysore");
		System.out.println("3. Chitradurga");
		System.out.println("4. Gadag");
		System.out.println("Enter your choice");
		int choice_city = sc.nextInt();
		f1.city(choice_city);

		System.out.println("What kind of food do you wanna order");
		System.out.println("1. Veg");
		System.out.println("2. Non Veg");
		System.out.println("Enter your choice");
		
		int choice_food = sc.nextInt();
		f1.food(choice_food);
		
		System.out.println("Select from below");
		System.out.println("1. North-Meals");
		System.out.println("2. South-Meals");

		int choice_meals = sc.nextInt();
		f1.item(choice_meals);
	}
}
