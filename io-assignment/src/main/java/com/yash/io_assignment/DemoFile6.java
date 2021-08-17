package com.yash.io_assignment;

import java.io.File;

public class DemoFile6 {

	
	public static void deleteDirectory(File file)
	{	
		for (File subfile : file.listFiles()) {

			if (subfile.isDirectory()) {
				deleteDirectory(subfile);
			}

			subfile.delete();
		}
	}

	public static void main(String[] args)
	{
	
		String filepath = "D:\\Demo";
		File file = new File(filepath);
	
		deleteDirectory(file);

		file.delete();
	}
}


