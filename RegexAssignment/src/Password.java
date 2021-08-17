import java.util.regex.*;
public class Password 
{
	public static void main(String[] args)
	{
		String expression = "M2adhav#2";
		
		System.out.println(Pattern.matches(expression, "[A-S][02468][a-z A-Z 0-9 #$]*(1)"));

	}

}
