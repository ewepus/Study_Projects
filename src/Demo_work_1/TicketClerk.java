package Demo_work_1;

import java.util.Scanner;

public class TicketClerk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double costFirst = 1860.7, costSecond = 123.45 * 23, discount = 0.95;
        int passengers = scanner.nextInt();

        double resultFirst = costFirst * passengers * discount, resultSecond = costSecond * passengers * discount;

        System.out.printf("%.2f\n", resultFirst);
        System.out.printf("%.2f", resultSecond);
        scanner.close();
    }
}
