package Lab_work_1;

import java.util.Scanner;

public class TextTransform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        char startChar = scanner.next().charAt(0), finishChar = scanner.next().charAt(0);

        int startIndex = word.indexOf(startChar), finishIndex = word.indexOf(finishChar);
        String partToDelete = word.substring(startIndex, finishIndex + 1), result = word.replace(partToDelete, "");

        System.out.println(result.toLowerCase());
    }
}
//var_10