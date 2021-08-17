package com.yash.io_assignment;

import java.io.File;
import java.io.FileInputStream;
 
public class DemoFile8
{
   public static void main(String[] args)
   {
       
      File file = new File("D:\\demo2.txt");
       
      readContentIntoByteArray(file);
   }
 
   public static byte[] readContentIntoByteArray(File file)
   {
      FileInputStream fileInputStream = null;
      byte[] bFile = new byte[(int) file.length()];
      try
      {
         fileInputStream = new FileInputStream(file);
         fileInputStream.read(bFile);
         fileInputStream.close();
         for (int i = 0; i < bFile.length; i++)
         {
            System.out.print((char) bFile[i]);
         }
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return bFile;
   }
}
