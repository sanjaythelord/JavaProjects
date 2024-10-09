package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {  
	      
	    try {  
	    	FileWriter fwrite = new FileWriter("F:\\College\\JAVA\\java13.txt");
	        fwrite.write("Good Morning Everyone. I am great to see you all today.");   
	  
	        // Closing the stream  
	        fwrite.close();   
	        System.out.println("Content is successfully written to the file.");  
	    } catch (IOException e) {  
	        System.out.println("Unexpected error occurred");  
	        e.printStackTrace();  
	        }  
	    }  
}
