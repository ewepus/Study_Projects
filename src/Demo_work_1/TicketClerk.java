package Demo_work_1;

import java.util.Scanner;

public class TicketClerk {
    public static void main(String[] args) {
        double cost_1 = 1860.7, cost_2 = 123.45 * 23, discount = 0.95;
        Scanner scanner = new Scanner(System.in);
        int passengers = scanner.nextInt();
        double result_1 = cost_1 * passengers * discount, result_2 = cost_2 * passengers * discount;
        System.out.printf("%.2f\n", result_1);
        System.out.printf("%.2f", result_2);
        scanner.close();
    }
}
