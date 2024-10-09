package Assignment;

import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("C:\\Users\\Asus\\eclipse-workspace\\sanjayjava\\src\\Assignment\\file.txt");
		fileWriter.write("i am learner");
		fileWriter.close();

	}

}
