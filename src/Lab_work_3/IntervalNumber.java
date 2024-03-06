package Lab_work_3;

import java.util.Scanner;

public class IntervalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 23, input = sc.nextInt();

        while (!((input > 4 * N && input < 5 * N) || (input > 14 * N && input < 15 * N))) {
            System.out.println("Not_yet");
            input = sc.nextInt();
        }

        System.out.println("Correct_number_" + input);
    }
}
//var_9
