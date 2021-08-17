import java.util.regex.*;
public class LandlineStd_Pattern
{
	public static void main(String[] args) 
	{
		String expression = "^(\\d{4}[- ]?)[2]\\d{6}$";
		
		System.out.println(Pattern.matches(expression, "0755 2563149"));
		System.out.println(Pattern.matches(expression, "0755 256314"));
		System.out.println(Pattern.matches(expression, "0755 25631"));
		System.out.println(Pattern.matches(expression, "0755 25631499"));
		System.out.println(Pattern.matches(expression, "0756 2563149"));
		System.out.println(Pattern.matches(expression, "0755 2563149"));
	}


}
