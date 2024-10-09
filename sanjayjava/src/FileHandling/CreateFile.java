package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String args[]) {  
        try {  
         
         File f = new File("F:\\College\\JAVA1\\javaBalmiki.txt");
         if (f.createNewFile())
         {  
         System.out.println("File " + f.getName() + " is created successfully.");  
         } else {  
         System.out.println("File is already exist in the directory.");  
                }  
          } 
        catch (IOException exception) {  
        System.out.println("An unexpected error is occurred.");  
        exception.printStackTrace();  
           }   
      }  
}
