package com.yash.jdk8features.streamapiandtimeapi;

import java.time.*;

public class TimeAndDateDemo 
{
	public void timeAndDate()
	{
		ZoneId z = ZoneId.of("Europe/Paris");
		Clock c = Clock.systemDefaultZone(); 
		Clock c1 = Clock.system(z);
		System.out.println(c);
		//	System.out.println(c1);

		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		
		
	}
	public static void main(String[] args)
	{
		TimeAndDateDemo obj = new TimeAndDateDemo();
		obj.timeAndDate();
	}

}
