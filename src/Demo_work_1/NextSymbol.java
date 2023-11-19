package Demo_work_1;

import java.util.Scanner;

public class NextSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        System.out.println(--symbol);
        System.out.print(symbol+23);
        scanner.close();
    }
}
