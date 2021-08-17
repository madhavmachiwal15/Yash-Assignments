import java.util.*;
import java.util.regex.*;
public class IndianCurrency 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String cur;
		System.out.println("Enter Currency digits:");
		cur = sc.next();
		
		Pattern p = Pattern.compile(cur);
		Matcher m = p.matcher("[0-9]{2}[,][0-9]{2}[,][0-9]{2}[,][0-9]{3}$");
		boolean b = m.matches();
		
		System.out.println(b);
	}

}
