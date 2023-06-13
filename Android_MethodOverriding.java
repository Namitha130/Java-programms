class Android
{	

	public void profile()
	{
		String Android_version = "12";
		String Hardware_version = "MP_0.1";
		String OS_version ="Funtouch OS 12 Global";
		System.out.println(" Android version : "+ Android_version + " " + " Hardware_version: "+ Hardware_version + " " + "OS Version : " +OS_version);
	}
}
// class Samsung extends Android
// {
// 	public void profile()
// 	{

// 	}
// }
class Vivo extends Android
{
	@Override
	public void profile()
	{	
		super.profile();
		String Vivo_Model = "V2065";
		double Vivo_RAM = 4.00;

		System.out.println("Vivo_Model: " + Vivo_Model + " " + "Vivo_RAM : "+Vivo_RAM);
	}
}
class Oneplus extends Android
{	
	@Override
	public void profile()
	{	
		super.profile();
		String Oneplus_Model ="AC2001";
		double  Oneplus_RAM = 6.00;
		System.out.println("Oneplus_Model: " + Oneplus_Model + " " + "Oneplus_RAM : "+Oneplus_RAM);
	}
}
class Android_MethodOverriding
{
	public static void main(String[] args) 
	{
		Oneplus s1= new Oneplus();
		s1.profile();

		Vivo s2= new Vivo();
		s2.profile();
	}
}