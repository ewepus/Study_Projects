package Demo_work_3;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = scanner.nextInt(), count = 0, power = 1;

        do {
            power *= 2;
            count += 1;
        } while (limit > power * 2);

        System.out.println(power);
        System.out.print(count);
    }
}
