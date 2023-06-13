class Whatsappv1
{
	public void sendmsg()
	{
		System.out.println("Message send successfully");
	}
}
class Whatsappv2 extends Whatsappv1
{
	public void sendvoicemsg()
	{
		System.out.println("voice Message send successfully");
	}
}
class Whatsappv3 extends Whatsappv2
{
	public void videocall()
	{
		System.out.println("videocall done successfully");
	}
}

class whatsapp_Multilevel_inheritance
{
	public static void main(String[] args) 
	{	
		Whatsappv1 w1= new Whatsappv1();
		w1.sendmsg();
		System.out.println("-------------");
		Whatsappv2 w2= new Whatsappv2();
		w2.sendmsg();
		w2.sendvoicemsg();
		
		System.out.println("-------------");
		
		Whatsappv3 w3= new Whatsappv3();
		w3.sendmsg();
		w3.sendvoicemsg();
		w3.videocall();
		
		


	}
}