package Demo_work_9;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        try {
            Child child = new Child(name, age);
            System.out.println(child);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
