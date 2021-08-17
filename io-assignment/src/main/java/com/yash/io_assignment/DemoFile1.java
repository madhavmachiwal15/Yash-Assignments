package com.yash.io_assignment;
import java.io.*;
/**
 * Creating a class to copy content of one file into another file
 * @author Madhav
 *
 */
public class DemoFile1
{
	public static void main(String[] args) throws IOException , FileNotFoundException
	{
		FileReader fin = new FileReader("C:\\Users\\LENOVO\\eclipse-workspace\\io-assignment\\File1");
		FileWriter fout = new FileWriter("C:\\Users\\LENOVO\\eclipse-workspace\\io-assignment\\File2", true);
		
		int i;
		while((i=fin.read()) !=-1)
		{
			fout.write(i);
		}
		
		System.out.println("File has copied!!");
		
		fin.close();
		fout.close();
	}

}
