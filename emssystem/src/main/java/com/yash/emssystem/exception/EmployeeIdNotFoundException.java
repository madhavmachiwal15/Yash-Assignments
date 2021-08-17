package com.yash.emssystem.exception;
/**
 * Exception class for if EmployeeId is Not found 
 * @author madhav.machiwal
 *
 */
public class EmployeeIdNotFoundException extends Exception 
{
	public EmployeeIdNotFoundException(String str)
	{
		super(str);
	}
}
