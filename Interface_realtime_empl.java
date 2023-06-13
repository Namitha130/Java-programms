interface Photo
{
	public void resize();
	public void crop();
	public void addfilter()
	{
		System.out.println(" Choose filter : venusia");
	}
}
interface Post
{
	public void like()
	{
		System.out.println("total like count: 190++");
	}
	public void comment()
	{
		System.out.println("Looking pretty!!!!...");
	}
	public void share()
	{
		System.out.println("Share with watsapp, snapchat");
	}
	public void addCaptions()
	{
		System.out.println("you can add captions to your picture");
	}
	public void tag()
	{
		System.out.println("taggged people are: sush_shmita, shailu_nadig,nammi_121");
	}
}
interface VideoEdit
{
	public void trim();
	public void addAudio();
	public void changeSpeed();
}
class Picture implements Photo,Post,VideoEdit
{
	@Override
	public void resize()
	{
		System.out.println("Picture is resized from original size ");
	}
	public double size()
	{
		double Picture_size = 18.4;
	}
	public int resol()
	{
		int pic_resolution = 234;

	}
	public String type()
	{
		String picture_type ="dolly.jpg";
	}
}
class Video implements Photo,Post,VideoEdit
{	
	@Override
	public void resize()
	{
		System.out.println("Video is resized from original size");
	}
	public double size()
	{
		double video_size = 50.6;
	}
	public int duration()
	{
		int video_duration = 40;
	}
	public String quality()
	{
			String video_quality = "High-quality";
	}
}
class Interface_realtime_empl
{
	public static void main(String[] args) 
	{
		
	}
}