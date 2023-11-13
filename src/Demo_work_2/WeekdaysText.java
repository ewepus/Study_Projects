package Demo_work_2;

import java.util.Scanner;

public class WeekdaysText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().toLowerCase();
        switch (day) {
            case "monday", "понедельник", "tuesday", "вторник", "wednesday", "среда", "thursday", "четверг", "friday", "пятница": System.out.println("workday"); break;
            case "saturday", "суббота", "sunday", "воскресенье": System.out.println("holiday"); break;
            default:
                System.out.println("invalid weekday");
        }
    }
}
