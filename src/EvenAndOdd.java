import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(word -> Integer.parseInt(word)).toArray();
        int evenSum = 0, oddSum = 0;
        for (int digit : numbers) {
            if (digit % 2 == 0) evenSum += digit;
            else oddSum += digit;
        }
        System.out.println(Math.abs(evenSum - oddSum));
    }
}
