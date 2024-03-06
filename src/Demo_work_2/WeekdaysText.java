package Demo_work_2;

import java.util.Scanner;

public class WeekdaysText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.next().toLowerCase();

        String information = switch (day) {
            case "monday", "понедельник", "tuesday", "вторник", "wednesday", "среда", "thursday", "четверг", "friday",
                    "пятница" -> "workday";
            case "saturday", "суббота", "sunday", "воскресенье" -> "holiday";
            default -> "invalid weekday";
        };

        System.out.print(information);
    }
}
