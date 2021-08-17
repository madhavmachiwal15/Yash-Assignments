import java.util.regex.*;
public class AadharNumber_Pattern 
{
	public static void main(String[] args) 
	{
		String expression = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
		
		System.out.println(Pattern.matches(expression, "3646 2598 7893"));
		System.out.println(Pattern.matches(expression, "36461 2598 7893"));
		System.out.println(Pattern.matches(expression, "364 2598 7893"));
		System.out.println(Pattern.matches(expression, "0646 2598 7893"));
		System.out.println(Pattern.matches(expression, "3646 02598 7893"));
		System.out.println(Pattern.matches(expression, "3646 2598 78953"));
	}

}
