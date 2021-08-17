package com.yash.io_assignment;
import java.io.*;
/**
 * Class for read the file and displaying data from file 
 * @author Madhav
 *
 */
public class DemoFile2 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\io-assignment\\Company\\basicinfo");
		
		FileInputStream fin = new FileInputStream(f);
		while(true)
		{
			int i = fin.read();
			if(i==-1)
				break;
			System.out.print((char)i);
		}
		
		fin.close();
	}

}
