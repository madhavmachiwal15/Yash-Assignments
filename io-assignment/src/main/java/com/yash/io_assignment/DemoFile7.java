package com.yash.io_assignment;

import java.io.File;

public class DemoFile7 {

	public static void main(String[] args)
	{

		boolean flag;

		try {

			File file = new File("D:\\demo1.txt");

			file.createNewFile();

			flag = file.setReadOnly();

			System.out.println("Is File is read-only : "+ flag);

			flag = file.canWrite();
			System.out.println("Can we write : "+ flag);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
