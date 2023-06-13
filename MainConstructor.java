class User{
	String user_name;
	long contact_no;
	String email_id;
	String pwd;

	User(String user_name,long contact_no,String email_id, String pwd)
	{
		this.user_name=user_name;
		this.contact_no=contact_no;
		this.email_id=email_id;
		this.pwd=pwd;

	}
	public void show_user_details()
	{
		System.out.println("user login successfully");
		System.out.println(this.user_name + " "+ this.contact_no+" " + this.email_id+" "+this.pwd);
	}

}
class MainConstructor
{
	public static void main(String[] args) {
		User u1= new User("namitha",8123578130l,"itsnamitha130@gmail.com","Enfield@356");
		u1.show_user_details();
		User u2= new User("namithatp",6363066237l,"namithatp121@gmail.com","Enfield@666");
		u2.show_user_details();

	}
}

