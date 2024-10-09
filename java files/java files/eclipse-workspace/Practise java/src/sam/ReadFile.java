package sam;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
public static void main(String[] args) throws IOException {
	String myFile="D:/test.txt";
	List<String> strings=Files.readAllLines(Paths.get(myFile));
	String content=" ";
	for(String s : strings) {
		System.out.println("Reading file content :"+s);
		content +=s;
	}
	System.out.println("Reading outside :");
	System.out.println(content);
}
}
