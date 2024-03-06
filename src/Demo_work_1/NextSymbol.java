package Demo_work_1;

import java.util.Scanner;

public class NextSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.next().charAt(0);
        scanner.close();

        symbol += 23;
        System.out.println(symbol);
    }
}
