public class Sum_of_Cube
{
	public static void main(String args[])
	{
		int sum = 0, temp, n=123;
	
		while( n > 0 )
		{
			temp = n % 10;	
			n = n / 10;		
			sum = sum + temp * temp * temp;
		}

		System.out.println("Sum of cubes of digits of n digit number: "+sum);
	}
}
