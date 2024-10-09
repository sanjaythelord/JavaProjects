package sam;

import java.io.File;
import java.io.IOException;

public class CreateFile {
public static void main(String[] args) throws IOException {
	String myFile="D:/test.txt";
	File file=new File(myFile);
	if(file.exists()) {
		System.out.println("File already exists");
	}else {
		file.createNewFile();
	}
}
}
