public class Prime_Num 
{
	public static void main(String arhgs[])
	{
		int i ,num=17;
		for(i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				break;
			}	
		}		
		if(i>num/2 && num>1)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}
}
