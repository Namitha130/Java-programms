class Palindrom_String{
  public static void main(String[] args) {
    
    String s1 = "madam";
    String s2  = ""; //reverseString
    
    for (int i = s1.length() - 1; i >=0; i--)
     {
      s2 = s2+ s1.charAt(i); 
     }
    if (s1.equalsIgnoreCase(s2))
      {
      System.out.println(s1 + " is a Palindrome String.");
      }
    else 
      {
      System.out.println(s1+ " is not a Palindrome String.");
      }
      
  }
}
 

    


