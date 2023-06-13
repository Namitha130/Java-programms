//import java.util.Arrays;
class Ascendingarray
{
	public static void main(String[] args) 
	{
	 	int [] a = new int[] { 20, 10 , 30 , 50 ,40};
	 	int temp=0;

	 	// System.out.println("Elements of an array:");
	 	// for(int i=0; i < a.length; i++ )
	 	// 	System.out.println(a[i]);

	 	System.out.println(" elements array ascending order:");
 
		for (int i = 0; i < a.length; i++) // to print original array
		{     
	 		for (int j = i+1; j < a.length; j++) // to print array in ascending order
	 		{     
				if(a[i] > a[j]) 
	 			{    
	 				temp = a[i];    
	 				a[i] = a[j];    
	 				a[j] = temp;    
	 			}     
	 		}     
	 	}        
	 	for(int i=0; i < a.length; i++ )
	 		System.out.println(a[i]);
	 }
	
}

	



