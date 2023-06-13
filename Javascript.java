class Javascript{
     public static boolean check(int num1,int num2)
    {
        while(num1!=0)
        {
            if(num1%10==num2%10)
            {
                int n2=num2;
                int num=10^countDigits(n2);
                int rem=num1%num;
                if(rem==num2)
                {
                    return true;
                }
            }
            num1=num1/10;
        }
        return false;
    }

    public static int countDigits(int num)
    {
        int count=0;
        while(num>0)
        {
            int rem=num%10;
            count++;
            num=num/10;
        }
        return count;
    }
    public static void main(String[] args) 
    {
       System.out.println(check(15643,46)); 
       System.out.println(check(5123,12));
    }
}


