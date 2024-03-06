package Lab_work_2;

import java.util.Scanner;

public class TravelTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String depTime = scanner.nextLine();
        int travelTime = scanner.nextInt();
        int stopTime = scanner.nextInt();

        if (!depTime.contains(":") || travelTime < 0 || stopTime < 0) {
            System.out.println("Недопустимый формат времени");
        } else {
            int colonIndex = depTime.indexOf(':'); //индекс двоеточия
            int depTimeHours = Integer.parseInt(depTime.substring(0, colonIndex)); //идём до двоеточия
            int depTimeMinutes = Integer.parseInt(depTime.substring(colonIndex + 1)); //идём с двоеточия до конца

            if ((depTimeHours > 23) || (depTimeHours < 0) || (depTimeMinutes > 59) || (depTimeMinutes < 0)) {
                System.out.println("Недопустимый формат времени");
            } else if ((travelTime + stopTime) > 1440) {
                System.out.println("Время в пути не должно превышать один день");
            } else {
                int arrivalTime = depTimeHours * 60 + depTimeMinutes + travelTime + stopTime;
                int arrivalTimeHours = arrivalTime / 60;
                int arrivalTimeMinutes = arrivalTime % 60;

                if (arrivalTimeHours >= 24) {
                    arrivalTimeHours -= 24;
                }
                String formattedHours = String.format("%02d", arrivalTimeHours);
                String formattedMinutes = String.format("%02d", arrivalTimeMinutes);
                System.out.print(formattedHours + ":" + formattedMinutes);
            }
        }
    }
}
//var_5
