class Covid_Analysis{

	public static void plot_graph(int year)
	{
		System.out.println("Covid started in the year: " + year);
	}

	public void plot_graph(int year, long no_of_cases)
	{
		System.out.println("Covid cases in the year"+ year + " " +no_of_cases);
	}
	public long plot_graph(long no_of_cases)
	{
		return no_of_cases;
	}
}
class App_Method_Overloading{
	public static void main(String[] args)
	{
		Covid_Analysis.plot_graph(2019);
		Covid_Analysis s1= new Covid_Analysis();
		s1.plot_graph(2020,3l);
		s1.plot_graph(15l); // its not printing bcz we haven't printing the return type
		long count = s1.plot_graph(15l);
		System.out.println("No of cases: "+ count);

		

	}
}