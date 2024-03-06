package Lab_work_1;

import java.util.Scanner;

public class TextTransform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char startChar = scanner.next().charAt(0);
        char finishChar = scanner.next().charAt(0);

        int startIndex = text.indexOf(startChar);
        int finishIndex = text.indexOf(finishChar);

        String partToDelete = text.substring(startIndex, finishIndex + 1);
        String result = text.replace(partToDelete, "");

        System.out.println(result.toLowerCase());
    }
}
//var_10