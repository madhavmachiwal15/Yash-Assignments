import java.util.regex.Pattern;
public class Email {

	
	public static void main(String[] args) 
	{
		String expression = "^[a-z._%-]+@[a-z.-]+\\.[a-z]{2,4}$";
		
		System.out.println(Pattern.matches(expression, "madhav.machiwal@yash.com"));
	}	
		

}
