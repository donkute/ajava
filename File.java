//Write a Java program to accept a file name and display number of characters,words and lines in the files.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String fileName = scanner.nextLine();

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                lineCount++;
                charCount += currentLine.length();

                // Split the line into words based on whitespace
                String[] words = currentLine.trim().split("\\s+");
                if (!currentLine.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("File: " + fileName);
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
