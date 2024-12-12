import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "java.txt";
        int wordCount = 0, charCount = 0, lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;

                // Count characters
                charCount += line.length();

                // Count words
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }

            System.out.println("File: " + fileName);
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

