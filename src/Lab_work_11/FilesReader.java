package Lab_work_11;

import Demo_work_11.Person;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesReader {
    static String path = "resources\\example11.txt";
    static void readFile() {
        String string = "";

        try (FileReader reader = new FileReader(path)) {
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNext()) {
                string += scanner.nextLine();
            }

            String[] text = string.split(" ");
            int count = 0;
            for (String s : text) {
                count += s.length();
            }
            System.out.println("Кол-во знаков в тексте, за исключением пробелов и переносов строк: " + count);

        } catch (FileNotFoundException e) {
            System.out.println("Wrong path " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}
