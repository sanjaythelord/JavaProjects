package FileHandling;

import java.io.*;

public class DeleteFile {
	public static void main(String[] args) {   
	    File f = new File("F:\\College\\JAVA\\fileq.txt");   
	    if (f.delete()) {   
	      System.out.println(f.getName()+ " file is deleted successfully.");  
	    } else {  
	      System.out.println("Unexpected error found in deletion of the file.");  
	    }   
	  }   
}
