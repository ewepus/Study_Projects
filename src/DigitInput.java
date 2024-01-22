import java.util.Map;
import java.util.Scanner;

public class DigitInput {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double a = getIntegerNumber(), b = getIntegerNumber();
        System.out.print(a + " + " + b + " = " + sum(a, b));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static double getDecimalNumber() {
        String text = sc.nextLine();
        do {
            try {
                if (text.contains(",")) {
                    text = text.replace(",", ".");
                }
                if (text.contains(" ")) {
                    text = text.replace(" ", "");
                }
                return Double.parseDouble(text);
            } catch (NumberFormatException ex) {
                System.out.println("Please, try again");
                text = sc.nextLine();
            }
        } while (true);
    }
    static double getIntegerNumber() {
        do {
            double maybe = getDecimalNumber();
            if (maybe == Math.round(maybe)) {
                return (int) maybe;
            } else {
                System.out.println("Please, try again");
            }
        } while (true);
    }
}
