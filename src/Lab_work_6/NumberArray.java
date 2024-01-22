package Lab_work_6;

import java.util.Arrays;
import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(word -> Integer.parseInt(word)).toArray();
                int sum = 0, count = 0;
                for (int i = 0; i < numbers.length; i++) {
                    sum += numbers[i];
                    count++;
                }
                System.out.println("Sum of numbers: " + sum);
                System.out.println("Quantity of numbers: " + count);
                for (int i = 1; i < numbers.length - 1; i++) {
                    if (numbers[i-1] < numbers[i] && numbers[i+1] < numbers[i]) System.out.print(numbers[i] + " ");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please, try again");
            }
        }
    }
}
//var_9