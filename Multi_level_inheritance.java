class Dish1
{	
	int total;
	public int hungrykya_dish1()
	{
		//int total1=0;
		String dish="Pizza";
		int  price1 = 340;
		System.out.println("Pizza added succesfully in cart");
		total=price1;
		return total;

		// System.out.println(total1);
	}
}
class Dish2 extends Dish1
{
	
	public int hungrykya_dish2()
	{	
		int total2=0;
		String dish="Burger";
		int price2=260;
		System.out.println("Burger is added succesfully in cart");
		total2=hungrykya_dish1()+price2;

		// System.out.println(total2);
		return total2;
	}
 }
class Dish3 extends Dish2
{

	public int hungrykya_dish3()
	{	
		 int total3=0;
		String dish="Sandwich";
		int price3=160;
		System.out.println("Sandwich is added succesfully in cart");
		total3=hungrykya_dish2()+price3;

		// System.out.println(total3);
		return total3;
	}
 }
	
class Multi_level_inheritance
{
	public static void main(String[] args)
	{
		Dish1 s1= new Dish1();
		s1.hungrykya_dish1();
		//System.out.println(" Total bill: "+s1.total);
		System.out.println("----------");

		Dish2 s2 = new Dish2();
		//s2.hungrykya_dish1();
		int total_price = s2.hungrykya_dish2();
		System.out.println("Total bill: "+total_price);

		System.out.println("----------");

		Dish3 s3 = new Dish3();
		
		int total_bill=s3.hungrykya_dish3();
		System.out.println("total_bill: "+ total_bill);
		
	}
}