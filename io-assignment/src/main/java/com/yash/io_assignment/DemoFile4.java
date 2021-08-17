   package com.yash.io_assignment;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
public class DemoFile4 
{
	public static void main(String[] args) throws FileNotFoundException, InputMismatchException
	{
		Scanner sc = new Scanner(new File("C:\\Users\\LENOVO\\eclipse-workspace\\io-assignment\\File3"));
		Scanner s = new Scanner(System.in);
		
		while(sc.hasNextLine())
		{
			String name = s.nextLine();
			//String [] details = name.split(" ");
			
			System.out.println("Name: "+sc.next(name));
			//System.out.println("Address: "+details[1]);
			//System.out.println("Phone Number: "+details[2]);
		}
	}

}
