package Demo_work_6;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        int[] numbers = new int[words.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(words[i]);
        }
        int sum = 0, sum_N = 0;
        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] % 2 == 0) sum += numbers[i];
            if (numbers[i] % 23 == 0) sum_N += numbers[i];
        }
        System.out.println(sum);
        System.out.println(sum_N);
    }
}
