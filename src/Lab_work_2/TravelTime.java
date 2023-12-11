package Lab_work_2;

import java.util.Scanner;

public class TravelTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String depTime = scanner.nextLine();
        int travelTime = Integer.parseInt(scanner.nextLine());
        int stopTime = Integer.parseInt(scanner.nextLine());

        int depTime_hours = Integer.parseInt(depTime.substring(0, 2));
        int depTime_minutes = Integer.parseInt(depTime.substring(3, 5));

        if ((depTime_hours > 23) || (depTime_hours < 0) || (depTime_minutes > 59) || (depTime_minutes < 0)) {
            System.out.println("Недопустимый формат времени");
        }
        else if ((travelTime + stopTime) > 1440) {
            System.out.println("Время в пути не должно превышать один день");
        }
        else {
                int arrivalTime = stopTime + travelTime + depTime_hours * 60 + depTime_minutes;
                int arrivalTime_hours = arrivalTime / 60;
                int arrivalTime_minutes = arrivalTime % 60;

                if (arrivalTime_hours >= 24) {
                    arrivalTime_hours -= 24;
                }
                String format_hours = String.format("%02d", arrivalTime_hours);
                String format_minutes = String.format("%02d", arrivalTime_minutes);
                System.out.print(format_hours + ":" + format_minutes);
        }
    }
}
//var_5