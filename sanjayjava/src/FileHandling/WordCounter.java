package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//Java BufferedReader class is used to read the text from a character-based
//input stream. It can be used to read data line by line by readLine()
//method. It makes the performance fast. 
public class WordCounter {
    public static void main(String[] args) {
        String filePath = "F:\\College\\JAVA\\file.txt";
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words using whitespace as a delimiter
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Total number of words: " + wordCount);
    }
}
