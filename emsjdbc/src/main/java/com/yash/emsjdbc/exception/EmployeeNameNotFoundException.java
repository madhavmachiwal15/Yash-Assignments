package com.yash.emsjdbc.exception;
/**
 * Exception class for if EmployeeName is Not found 
 * @author madhav.machiwal
 *
 */
public class EmployeeNameNotFoundException extends Exception 
{
	public EmployeeNameNotFoundException(String str)
	{
		super(str);
	}
}
