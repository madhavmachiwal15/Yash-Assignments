public class Sum_of_Natural 
{
	public static void main(String args[])
	{
		int n=8, i, sum=0;
		
		for(i=1; i<=n; i++)
		{
			if(i%3==0 || i%5==0)
			{
       			sum += i;  //sum = sum+i;
			}
		}
		

		System.out.println("Sum of n natural no divisible by 3 or 5: "+sum);
	}
}
