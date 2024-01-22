package Demo_work_6;

import java.util.Scanner;

public class ReversePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            int digit = Integer.parseInt(sc.nextLine());
            numbers[i] = digit;
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
