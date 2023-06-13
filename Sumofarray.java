class Sumofarray{
	// main method
// 		public static void main(String[] args) 
// 	{  
        
//         int [] a = new int [] { 2, 3, 5, 7 , 11};  //initialising the array
//         int sum = 0;  
         
//         for (int i = 0; i < a.length; i++) // loop to perform sum of an arryay
//         {  
//            sum = sum + a[i];  
//         }  
//         System.out.println("Sum of all the elements of an array: " + sum);  
//     }  
// }
// 
// user defind method
	public static void test(int[] a)
	{
		int sum = 0;
		for(int i= 0;i < a.length ; i++)
		{
			sum = sum + a[i];
		 //System.out.println(sum);	 
		}
	System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		int [] a = { 2, 3, 5,7,11};
		test(a); 
	}
}