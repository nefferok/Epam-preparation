package utilit;

import exception.IncorrectFilePath;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleFileReader {

    public static String readFile(String filePath) throws IncorrectFilePath {

        StringBuilder result = new StringBuilder();

        if (filePath != null && !filePath.isEmpty()) {

            Scanner scanner = null;

            try {

                scanner = new Scanner(new File(filePath));
                scanner.useDelimiter("\n");

                while (scanner.hasNext()) {
                    result.append(scanner.next()).append("\n");
                }

            } catch (FileNotFoundException e) {
                throw new IncorrectFilePath();

            } finally {
                if (scanner != null) {
                    scanner.close();
                }
            }
        }


        return result.toString();
    }
}
