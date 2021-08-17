public class Increasing_Number 
{
	public static void main(String args[]) 
	{
		int num=1234;
		boolean flag = false;

		int currentDigit = num % 10;
		num = num/10;
        
		while(num>0)
		{
           if(currentDigit <= num % 10)
           {
               flag = true;
               break;
           }

           currentDigit = num % 10;
           num = num/10;
       }
        
		if(flag)
		{
           System.out.println("Number is not an increasing number.");
		}
		else
		{
           System.out.println("Number is an increasing number.");
		}
    }

}
