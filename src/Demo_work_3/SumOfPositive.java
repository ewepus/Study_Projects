package Demo_work_3;

import java.util.Scanner;

public class SumOfPositive {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int enter = 0;
        do {
            sum += enter;
            enter = scanner.nextInt();
        } while (enter >= 0 && enter < 23);
        System.out.print(sum);
    }
}