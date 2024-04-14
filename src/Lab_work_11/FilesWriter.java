package Lab_work_11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesWriter {
    static String path = "resources\\task.txt";

    static void sumOfIntegers() {
        try (FileReader reader = new FileReader(path)) {
            Scanner scanner = new Scanner(reader);
            String text = "";

            while (scanner.hasNext()) {
                String sourceText = scanner.nextLine();
                String[] stringNumbers = sourceText.replace("(", "").replace(")", "")
                        .split("\\+");
                int[] numbers = new int[stringNumbers.length];
                int answer = 0;
                try {
                    for (int i = 0; i < stringNumbers.length; i++) {
                        numbers[i] = Integer.parseInt(stringNumbers[i]);
                        answer += numbers[i];
                    }
                    text += sourceText + "=" + answer + "\n";
                } catch (NumberFormatException e) {
                    text += sourceText + "=invalid\n";
                }
            }
            writePersons(text);

        } catch (FileNotFoundException e) {
            System.out.println("Wrong path " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception " + e.getMessage());
        }
    }

    static void writePersons(String text) {
        try (FileWriter writer = new FileWriter(path, false)) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        sumOfIntegers();
    }
}
/*

-1+2+(-3)+4
1+(-2)-3

(-3.5
-3,5)
3abc

*/