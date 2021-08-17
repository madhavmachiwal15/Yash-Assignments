import java.util.regex.*;
public class String_Matcher 
{
	public class Pattern1
	{
		public boolean outputCheck(String str)
		{
			String regex = "^...9...4.....7....1....";
			Pattern p = Pattern.compile(regex);
			
			if(str==null)
				return false;
			
			Matcher m = p.matcher(str);
			
			return m.matches();
		}
		
		public boolean outputCheck1(String str)
		{
			String regex = "one.two.three.four.five";
			
			Pattern p = Pattern.compile(regex);
			if(str==null)
			{
				return false;
			}
			
			Matcher m = p.matcher(str);
			
			return m.matches();
		}
	}
	public static void main(String[] args)
	{
		String_Matcher obj = new String_Matcher();
		String str = "one9two4three7four1five";
		obj.outputcheck(str);
		System.out.println("9\n4\n7\n1");
		obj.outputcheck1(str);
		System.out.println("one\ntwo\nthree\nfour\nfive\n");
	}

}
