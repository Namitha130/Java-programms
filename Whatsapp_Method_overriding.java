class WhatsappV1
{
	public void sendmsg()
	{
		System.out.println("Message sent and got single tick");
	}
}
class WhatsappV2 extends WhatsappV1
{ 	
	@Override
	public void sendmsg()
	{	
		super.sendmsg();
		System.out.println("Message sent and got double tick");
	}
}
class WhatsappV3 extends WhatsappV2
{
	@Override
	public void sendmsg()
	{
		super.sendmsg();
		System.out.println("Message sent and got blue tick");
	}
}

class Whatsapp_Method_overriding
{
	public static void main(String[] args)
	{
		WhatsappV3 w3 = new WhatsappV3();
		w3.sendmsg();
	}
}