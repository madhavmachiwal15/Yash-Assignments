public class Fibonacci_Non_Recursive 
{
	public static void main(String[] args) 
	{
		 int a=1,b=1,c,i,count=10;    
		 System.out.print(a+" "+b); 
		    
		 for(i=2;i<count;++i)   
		 {    
		  c=a+b;    
		  System.out.print(" "+c);    
		  a=b;    
		  b=c;    
		 }    

	}
}
