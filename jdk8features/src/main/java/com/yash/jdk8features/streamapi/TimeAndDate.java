package com.yash.jdk8features.streamapi;

import java.time.*;
import java.time.temporal.ChronoUnit;
public class TimeAndDate
{
	public void localDate_and_Time()
	{
		LocalDateTime currenttime = LocalDateTime.now();
		System.out.println("Current Time: "+currenttime);

		LocalDate localdate = currenttime.toLocalDate();
		System.out.println("Local Date: "+localdate);

		System.out.println(currenttime.getMonth());
		System.out.println(currenttime.getHour());
		System.out.println(currenttime.getDayOfYear());
		System.out.println(currenttime.getMinute());
		System.out.println(currenttime.getMonthValue());
		System.out.println(LocalTime.of(12, 15));
		System.out.println(LocalDate.of(2002, 2, 16));

		ZonedDateTime obj1 = ZonedDateTime.now();
		System.out.println("Zone: " + obj1);

		System.out.println(ZoneId.systemDefault());

		// here plus(1) denotes increment of 1 decade
		System.out.println(currenttime.plus(1, ChronoUnit.DECADES));

		System.out.println(currenttime.plus(10, ChronoUnit.DAYS));
	}

	public static void main(String[] args) 
	{
		TimeAndDate obj = new TimeAndDate();
		obj.localDate_and_Time();

	}
}
