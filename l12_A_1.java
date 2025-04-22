import java.io.*;

public class l12_A_1{
    public static void main(String[] args) {
        // File name to read
        String fileName = "C:\\Users\\asus\\Documents\\sem 2\\OOPs lab\\rjm.txt";

        // Variables for counting
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            // Open the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Read lines from the file
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                wordCount += line.split("\\s").length; // Split by whitespace
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file " + fileName + " does not exist.");
            return;
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
            return;
        }

        // Display the results
        System.out.println("File: " + fileName);
        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
    }
}