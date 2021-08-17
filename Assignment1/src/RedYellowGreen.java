public class RedYellowGreen 
{
	public static void main(String[] args)
	{
		String str = "Green";
		
		switch(str)
		{
			case "RED":
			case "red":
			case "Red": System.out.println("Stop");
						break;	
				
			
			case "YELLOW":
			case "yellow":
			case "Yellow": System.out.println("Ready");
						   break;
				
				
			case "GREEN":
			case "green":
			case "Green": System.out.println("Go");
						  break;
				
			default:
					System.out.println("Invalid Input");
		}

	}

}
