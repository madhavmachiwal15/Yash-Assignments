package com.yash.io_assignment;

import java.io.*;
public class DemoFile5 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\file4.txt");
		FileInputStream fin = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fin);
		BufferedReader reader = new BufferedReader(input);
		
		String str;
		
		int scount=0;	// sentence
		int ccount=0; // character
		int pcount=1;	//paragraph
		

		while((str = reader.readLine()) !=null)
		{
			if(str.equals(""))
			{
				pcount++;
			}
			else
			{
				ccount = ccount+str.length();
				
				String [] slist = str.split("[!?.:]"); //qsentence delimiter in java
				
				scount = scount+slist.length;
				
			}
		}
		
		System.out.println("Total no of alphabets: "+ccount);
		System.out.println("Total number of sentences: "+scount);
		System.out.println("Total no of paragraphs: "+pcount);
	}

}
