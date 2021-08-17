package com.yash.io_assignment;
import java.io.*;
import java.util.*;
/**
 * Creating a class to take file name as commandline argument
 * @author Madhav
 *
 */
public class DemoFile3
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		if(args.length == 0)
		{
			System.out.println("Enter file name as command line argument!!");
			System.exit(1);
		}

		File f = new File(args[0]);

		Scanner sc = new Scanner(f);

		System.out.println(f.exists());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getPath());
		System.out.println(f.lastModified());
		System.out.println(f.length());
	}

}
