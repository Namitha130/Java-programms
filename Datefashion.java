class Datefashion{
public static int Datefashion(int you, int date) 
{
  if ( you <= 2 || date <=2 ){
    return 0;
  }
  else if( you >= 8 || date >= 8){
    return 2;
  }
  else{
    return 1;
  }
}
public static void main(String[] args) {

	System.out.println(Datefashion(5, 10)); 
}
}