package sam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
public static void main(String[] args)throws IOException {
	String myFile="D:/test.txt";
	BufferedWriter bw=null;
	FileWriter fw=null;
	try {
		String line1="We are on java traiining at Neosphere"+System.lineSeparator();
		String line2="We wanna be a Java Developer.";
		String content=line1+"\n"+line2;
		fw=new FileWriter(myFile);
	    bw = new BufferedWriter(fw);
		bw.write(content);
		System.out.println("Done");
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	finally {
		bw.close();
		fw.close();
		
	}
}
}
