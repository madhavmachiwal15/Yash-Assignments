package com.yash.exceptionhandlingassignment1;
import java.io.*;

public class ReadContent 
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\exceptionhandlingassignment1\\demo1");
		try(FileInputStream  in = new FileInputStream(f))
		{

			int i = in.read();

			while(true)
			{
				i = in.read();
				if(i==-1)
					break;
				System.out.print((char)i);
				//System.out.println(in.read());
			}
		}

		catch(Exception e)
		{
			e.printStackTrace();

		}
	}

}
