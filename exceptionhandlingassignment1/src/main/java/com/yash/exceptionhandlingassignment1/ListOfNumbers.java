package com.yash.exceptionhandlingassignment1;
import java.io.*;

public class ListOfNumbers 
{

	public static void main(String[] args) throws FileNotFoundException, IOException, EOFException
	{
		String filePath = "C:\\Users\\LENOVO\\eclipse-workspace\\exceptionhandlingassignment1\\demo1";
		
		try(FileInputStream fin = new FileInputStream(filePath); DataInputStream din = new DataInputStream(fin))
		{	
			int i=din.readInt();
			
			System.out.println("Integers : "+i);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
