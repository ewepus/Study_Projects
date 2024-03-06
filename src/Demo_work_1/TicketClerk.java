package Demo_work_1;

import java.util.Scanner;

public class TicketClerk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ticketCost = 123.45 * 23;
        double discount = 0.95;
        int passengers = scanner.nextInt();
        scanner.close();

        double result = ticketCost * passengers * discount;

        System.out.printf("%.2f", result);
    }
}
