package Demo_work_11;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String path = "resources\\example.txt";

    static void write(String text) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(text);
            writer.write(System.lineSeparator());
            writer.flush();
        } catch (IOException e) {
            System.out.println("Exception " + e.getMessage());
        }
    }

    static Scanner scanner = new Scanner(System.in);
    static String text = "";

    public static void main(String[] args) {
        String string = "";
        while (!text.equalsIgnoreCase("end")) {
            string = text;
            text = scanner.nextLine();
        }
        write(string);
    }
}
