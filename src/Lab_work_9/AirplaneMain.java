package Lab_work_9;

import java.util.Scanner;

public class AirplaneMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите кол-во пассажиров самолёта");
        Integer passengers = Integer.parseInt(sc.nextLine());

        System.out.println("Введите кол-во крыльев самолёта");
        Integer wingsCount = Integer.parseInt(sc.nextLine());

        System.out.println("Введите кол-во двигателей самолёта");
        Integer enginesNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Введите да, если это гидроплан и нет, если это обычный самолёт");
        String isHydroplane = sc.nextLine().toLowerCase();

        try {
            if (isHydroplane.equals("нет")) {
                Airplane airplane = new Airplane(passengers, wingsCount, enginesNumber, false);
                System.out.println(airplane);
            } else if (isHydroplane.equals("да")) {
                Airplane airplane = new Airplane(passengers, wingsCount, enginesNumber, true);
                System.out.println(airplane);
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
//var_3
