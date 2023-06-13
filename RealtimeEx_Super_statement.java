class Gmail
{
	String name;    
	long contact_no;
	String email_id;
	// createing an contructor1 for superclass=Gmail
	Gmail(String name,long contact_no,String email_id)	
	{
		this.name=name;
		this.contact_no= contact_no;
		this.email_id=email_id;
	} 
	//crerating an constructor2 for superclass=Gmail
	Gmail(long pwd)
	{
		System.out.println(pwd);
	}  
	// creating an behaviour to print the statements
	public void show_details()
	{
		System.out.println(name + " " +contact_no+ " " + email_id );
	}       	
}

class G_drive extends Gmail
{
	String doc_name;
	// creating constructor for subclass=G_drive
	G_drive(String name,long contact_no,String email_id)
	{
		super(name,contact_no,email_id); 
	}
	// creating constructor2 for subclass=G_drive
	G_drive(String doc_name)
	{
		super(234567890); // super keyword for pwd:constructor2:of superclass
		this.doc_name=doc_name;
	}
	//behaviour
	public void show_doc()
	{
		System.out.println(doc_name);
	} 
}
class RealtimeEx_Super_statement
{
	public static void main(String[] args) 
	{	

		Gmail g1= new Gmail("Namitha",345678987654l,"itsnamitha130@gmail.com");
		g1.show_details();
		G_drive g2 = new G_drive("java.doc");
		g2.show_doc();	
	}

}





