public class Power_of_two 
{
	public static void main(String args[])
	{
		int num=16;
		boolean flag = false;
		
		while(num!=1)
		{
			if(num%2!=0)
			{
				flag=true;;
				break;
			}
			num/=2;
		}
		
		if(flag==false)
			System.out.println("Number is Power of 2");
		else
			System.out.println("Number is not Power of 2");
	}
}
