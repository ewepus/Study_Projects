package Lab_work_8;

import java.util.Scanner;

public class SheepMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя овечки, её пол и возраст");

        String name = sc.nextLine();
        if (name.length() < 3) {
            System.out.println("Invalid name");
        } else {
            String gender = sc.nextLine().toLowerCase();
            if (!gender.equals("male") && !gender.equals("female")) {
                System.out.println("Invalid gender");
            } else {
                try {
                    int age = Integer.parseInt(sc.nextLine());
                    if (age < 0) {
                        System.out.println("Invalid age");
                    } else {
                        Sheep sheep = new Sheep(name, gender, age);
                        System.out.println(sheep.getInfo());
                    }
                } catch (Exception e) {
                    System.out.println("Invalid age");
                }
            }
        }
    }
}
//var_4