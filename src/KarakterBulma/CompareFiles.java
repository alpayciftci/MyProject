package KarakterBulma;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompareFiles {

    public static void main(String[] args) throws FileReadException {
        String originalText = readFile("input.txt");
        String decodedText = readFile("decompressed.txt");

        if (originalText.equals(decodedText)) {
            System.out.println("Both files have the same content.");
        } else {
            System.out.println("Files have different content.");
        }
    }

    public static String readFile(String fileName) throws FileReadException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new FileReadException("Error reading file: " + fileName, e);
        }
        return content.toString();
    }
}

    class FileReadException extends Exception {
        public FileReadException(String message, Throwable cause) {
            super(message, cause);
        }
    }


