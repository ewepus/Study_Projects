package Lab_work_1;

import java.util.Scanner;

public class TextTransform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char symbol_1 = scanner.next().charAt(0);
        char symbol_2 = scanner.next().charAt(0);
        String result = word.replace(String.valueOf(symbol_1), "").replace(String.valueOf(symbol_2), "");
        System.out.print(result.toLowerCase());
    }
}
//var_10